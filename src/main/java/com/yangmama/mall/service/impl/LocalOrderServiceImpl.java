package com.yangmama.mall.service.impl;

import com.google.common.base.Strings;
import com.yangmama.mall.dao.LocalOrderDao;
import com.yangmama.mall.dao.LocalProductDao;
import com.yangmama.mall.dao.LocalOrderLocalProductDao;
import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.model.LocalOrderLocalProduct;
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
import org.springframework.transaction.annotation.Transactional;

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
    OrderProcessor orderProcessor;

    @Autowired
    ProductProcessor productProcessor;

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public List<LocalOrder> get(String shippingMethod, int pageNumber, int pageSize) {
        if (!Strings.isNullOrEmpty(shippingMethod)) {
            return localOrderDao.getByShippingMethod(shippingMethod);
        }

        return localOrderDao.get();
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

    @Transactional(rollbackFor = {Exception.class})
    @Override
    public void importLocalOrderList(OrderRequestParameter orderRequestParameter) throws Exception {
        List<Order> orderList = orderProcessor.getList(orderRequestParameter);
        List<Product> productList = productProcessor.getList();
        for (Product product : productList) {
            List<LocalProduct> localProductList = ShopifyToLocalUtil.shopifyProductToLocalProduct(product);
            for (LocalProduct localProduct : localProductList) {
                if (localProductDao.getByShopifyIdAndVariantId(localProduct.getShopifyId(), localProduct.getVariantId()) != null) {
                    continue;
                }
                localProductDao.save(localProduct);
            }
        }

        for (Order order : orderList) {
            LocalOrder localOrder = ShopifyToLocalUtil.shopifyOrderToLocalOrder(order);
            if (localOrderDao.getByDisplayid(order.getName()) != null) {
                continue;
            }
            for (LineItem lineItem : order.getLineItems()) {
                List<LocalProduct> localProduct = localProductDao.getByShopifyIdAndVariantId(String.valueOf(lineItem.getProductId()), String.valueOf(lineItem.getVariantId()));
                LocalOrderLocalProduct relation = LocalOrderLocalProduct.builder()
                        .quantity(lineItem.getQuantity())
                        .status("open")
                        .price(new BigDecimal(lineItem.getPrice()))
                        .localProduct(localProduct.get(0))
                        .localOrder(localOrder)
                        .build();
                localOrderLocalProductDao.save(relation);
                localOrder.getLocalOrderLocalProducts().add(relation);
            }
            localOrderDao.save(localOrder);

        }
    }
}
