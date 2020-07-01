package com.yangmama.mall.pojo.request;

import lombok.Data;

import java.util.List;

@Data
public class CombinationOrderRequest {
    private String mainOrderDisplayId;
    private List<String> subordinateOrderDisplayIds;
}
