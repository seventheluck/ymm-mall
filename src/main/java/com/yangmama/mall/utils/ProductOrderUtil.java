package com.yangmama.mall.utils;

import com.google.common.collect.ImmutableMap;
import com.yangmama.mall.pojo.products.Product;

import java.util.Map;

public class ProductOrderUtil {

    private static final Map<String, Integer> PRODUCT_VENDOR_WEIGHT_MAPPING = new ImmutableMap.Builder<String, Integer>()
            .put("楊媽媽手工坊", 10)
            .put("Southern Taiwan Food Truck", 11)
            .put("Yuanbao", 20)
            .put("Zhu", 30)
            .put("Guanjun", 40)
            .put("Binge", 50)
            .put("Belle Pastry", 60)
            .put("200Hao", 70)
            .build();

    public static int getWeight(Product product) {
        return PRODUCT_VENDOR_WEIGHT_MAPPING.get(product.getVendor());
    }
}
