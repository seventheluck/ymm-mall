package com.yangmama.mall.dao;

import com.yangmama.mall.model.LocalOrderSummary;

public interface LocalOrderSummaryDao {

    void save(LocalOrderSummary localOrderSummary);

    void delete(Long id);

    LocalOrderSummary queryByProductIdAndShippingMethod(Long productId, String shippingMethod);
}
