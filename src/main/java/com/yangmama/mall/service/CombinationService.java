package com.yangmama.mall.service;

import java.util.List;

public interface CombinationService {

    void combineOrders(String mainOrderDisplayId, List<String> subordinateOrderDisplayIds) throws Exception;
}
