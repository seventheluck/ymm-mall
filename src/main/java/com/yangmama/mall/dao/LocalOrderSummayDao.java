package com.yangmama.mall.dao;

import com.yangmama.mall.model.LocalOrderSummary;

public interface LocalOrderSummayDao {

    void save(LocalOrderSummary localOrderSummary);

    void delete(Long id);

    LocalOrderSummary queryByProductIdAndShippingMethod(Long productId, String shippingMethod);

}
