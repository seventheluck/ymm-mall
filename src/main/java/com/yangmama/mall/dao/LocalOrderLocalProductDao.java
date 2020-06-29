package com.yangmama.mall.dao;

import com.yangmama.mall.model.LocalOrderLocalProduct;

import java.util.List;

public interface LocalOrderLocalProductDao {

    void save(LocalOrderLocalProduct LocalOrderLocalProduct);

    void delete(Long id);
}
