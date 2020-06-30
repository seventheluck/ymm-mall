package com.yangmama.mall.service;

import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.pojo.request.OrderRequestParameter;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.List;

public interface LocalOrderService {

    List<LocalOrder> get(String shippingMethod, int pageNumber, int pageSize);

    LocalOrder get(Long id);

    void save(LocalOrder localOrder);

    void delete(Long id);

    void importLocalOrderList(OrderRequestParameter orderRequestParameter) throws Exception;

    void syncProduct() throws IOException;
}
