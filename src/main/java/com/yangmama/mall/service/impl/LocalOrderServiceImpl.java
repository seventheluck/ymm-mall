package com.yangmama.mall.service.impl;

import com.google.common.base.Strings;
import com.yangmama.mall.dao.LocalOrderDao;
import com.yangmama.mall.dao.LocalOrderSummaryDao;
import com.yangmama.mall.dao.LocalProductDao;
import com.yangmama.mall.dao.LocalOrderLocalProductDao;
import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.model.LocalOrderLocalProduct;
import com.yangmama.mall.model.LocalOrderSummary;
import com.yangmama.mall.model.LocalProduct;
import com.yangmama.mall.pojo.orders.LineItem;
import com.yangmama.mall.pojo.orders.Order;
import com.yangmama.mall.pojo.products.Product;
import com.yangmama.mall.pojo.request.OrderRequestParameter;
import com.yangmama.mall.processor.OrderProcessor;
import com.yangmama.mall.processor.ProductProcessor;
import com.yangmama.mall.service.LocalOrderService;
import com.yangmama.mall.utils.ShopifyToLocalUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

/**
 * @author wenchaoma
 */
@Service
public class LocalOrderServiceImpl implements LocalOrderService {

    @Autowired
    LocalOrderDao localOrderDao;

    @Autowired
    LocalProductDao localProductDao;

    @Autowired
    LocalOrderLocalProductDao localOrderLocalProductDao;

    @Autowired
    LocalOrderSummaryDao localOrderSummaryDao;

    @Autowired
    OrderProcessor orderProcessor;

    @Autowired
    ProductProcessor productProcessor;

    @Autowired
    LocalOrderService localOrderService;

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public List<LocalOrder> get(String shippingMethod, int pageNumber, int pageSize) {
        if (!Strings.isNullOrEmpty(shippingMethod)) {
            return localOrderDao.getByShippingMethod(shippingMethod, "open");
        }

        return localOrderDao.get("open");
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public LocalOrder get(Long id) {
        return localOrderDao.get(id);
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void save(LocalOrder localOrder) {
        localOrderDao.save(localOrder);
    }

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void delete(Long id) {
        localOrderDao.delete(id);
    }

    @Transactional(propagation = Propagation.REQUIRED, rollbackFor = {Exception.class})
    @Override
    public void importLocalOrderList(OrderRequestParameter orderRequestParameter) throws Exception {
        localOrderService.syncProduct();
        List<Order> orderList = orderProcessor.getList(orderRequestParameter);

        for (Order order : orderList) {
            LocalOrder localOrder = ShopifyToLocalUtil.shopifyOrderToLocalOrder(order);
            if (localOrderDao.getByDisplayid(order.getName()) != null) {
                continue;
            }
            for (LineItem lineItem : order.getLineItems()) {
                if (lineItem.getProductId() == null) {
                    continue;
                }
                LocalProduct localProduct = localProductDao.getByShopifyIdAndVariantId(String.valueOf(lineItem.getProductId()), String.valueOf(lineItem.getVariantId()));

                LocalOrderLocalProduct relation = LocalOrderLocalProduct.builder()
                        .quantity(lineItem.getQuantity())
                        .status("open")
                        .price(new BigDecimal(lineItem.getPrice()))
                        .localProduct(localProduct)
                        .localOrder(localOrder)
                        .build();
                localOrderLocalProductDao.save(relation);
                localOrder.getLocalOrderLocalProducts().add(relation);
                LocalOrderSummary localOrderSummary = localOrderSummaryDao.queryByProductIdAndShippingMethod(localProduct.getId(), localOrder.getShippingMethod());
                if (localOrderSummary == null) {
                    localOrderSummary = LocalOrderSummary.builder()
                            .localProduct(localProduct)
                            .quantity(0L)
                            .shippingMethod(localOrder.getShippingMethod())
                            .build();
                }
                localOrderSummary.setQuantity(localOrderSummary.getQuantity() + lineItem.getQuantity());
                localOrderSummaryDao.save(localOrderSummary);
            }
            localOrderDao.save(localOrder);

        }
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRES_NEW, rollbackFor = {Exception.class})
    public void syncProduct() throws IOException {
        List<Product> productList = productProcessor.getList();
        for (Product product : productList) {
            List<LocalProduct> localProductList = ShopifyToLocalUtil.shopifyProductToLocalProduct(product);
            for (LocalProduct localProduct : localProductList) {
                LocalProduct prevProduct = localProductDao.getByShopifyIdAndVariantId(localProduct.getShopifyId(), localProduct.getVariantId());
                if (prevProduct != null) {
                    prevProduct.setName(localProduct.getName());
                    localProductDao.save(prevProduct);
                } else {
                    localProductDao.save(localProduct);
                }
            }
        }
    }
}
