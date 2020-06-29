package com.yangmama.mall.utils;

import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.model.LocalProduct;
import com.yangmama.mall.pojo.orders.Order;
import com.yangmama.mall.pojo.products.Product;
import com.yangmama.mall.pojo.products.Variant;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class ShopifyToLocalUtil {

    public static List<LocalOrder> convert(List<Order> shopifyOrderList) {
        List<LocalOrder> localOrderList = new ArrayList<>();
        for (Order order : shopifyOrderList) {
            localOrderList.add(shopifyOrderToLocalOrder(order));
        }
        return localOrderList;
    }

    public static LocalOrder shopifyOrderToLocalOrder(Order shopifyOrder) {
        LocalOrder localOrder = new LocalOrder();
        localOrder.setDisplayId(shopifyOrder.getName());
        localOrder.setEmail(shopifyOrder.getContactEmail());
        localOrder.setName(shopifyOrder.getCustomer().getFirstName() + " " + shopifyOrder.getCustomer().getLastName());
        localOrder.setPhone(shopifyOrder.getShippingAddress().getPhone());
        localOrder.setShippingMethod(shopifyOrder.getProcessingMethod());
        localOrder.setShippingMethod(shopifyOrder.getShippingLines().get(0).getTitle());
        localOrder.setNote(shopifyOrder.getNote());
        localOrder.setShopifyId(String.valueOf(shopifyOrder.getId()));
        localOrder.setSubtotalPrice(new BigDecimal(shopifyOrder.getSubtotalPrice()));
        localOrder.setTotalPrice(new BigDecimal(shopifyOrder.getTotalPrice()));
        localOrder.setAddress1(shopifyOrder.getShippingAddress().getAddress1());
        localOrder.setAddress2(shopifyOrder.getShippingAddress().getAddress2());
        localOrder.setCity(shopifyOrder.getShippingAddress().getCity());
        localOrder.setState(shopifyOrder.getShippingAddress().getProvince());
        localOrder.setCountry(shopifyOrder.getShippingAddress().getCountry());
        localOrder.setZipCode(shopifyOrder.getShippingAddress().getZip());
        localOrder.setStatus("open");
        return localOrder;
    }

    public static List<LocalProduct> shopifyProductToLocalProduct(Product product) {
        List<LocalProduct> localProductList = new ArrayList<>();
        List<Variant> variantList = product.getVariants();
        for (Variant variant : variantList) {
            LocalProduct localProduct = new LocalProduct();
            localProduct.setShopifyId(String.valueOf(product.getId()));
            localProduct.setVariantId(String.valueOf(variant.getId()));
            if (variantList.size() == 1) {
                localProduct.setName(product.getTitle());
            } else {
                localProduct.setName(product.getTitle() + " " + variant.getTitle());
            }

            localProduct.setVendor(product.getVendor());
            localProduct.setPrice(new BigDecimal(variant.getPrice()));
            localProductList.add(localProduct);
        }
        return localProductList;
    }
}
