package com.yangmama.mall.dao;

import com.yangmama.mall.model.LocalOrder;

import java.util.List;

public interface LocalOrderDao {

    List<LocalOrder> get();

    LocalOrder get(Long id);

    List<LocalOrder> getByShippingMethod(String shippingMethod);

    List<LocalOrder> getByStatus(List<String> status);

    LocalOrder getByDisplayid(String displayId);

    void save(LocalOrder localOrder);

    void delete(Long id);
}
