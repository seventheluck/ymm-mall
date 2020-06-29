package com.yangmama.mall.dao;

import com.yangmama.mall.model.LocalProduct;

import java.util.List;

public interface LocalProductDao {

    List<LocalProduct> get();

    LocalProduct get(Long id);

    List<LocalProduct> getByShopifyIdAndVariantId(String shopifyId, String variantId);

    List<LocalProduct> getByStatus(String status);
    
    void save(LocalProduct LocalProduct);

    void delete(Long id);
}
