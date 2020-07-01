package com.yangmama.mall.controller;

import com.yangmama.mall.pojo.request.OrderRequestParameter;
import com.yangmama.mall.service.LocalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/importation")
public class ImportationController {
    @Autowired
    LocalOrderService localOrderService;

    @PostMapping("/orders")
    public boolean importOrderList(@RequestParam(required = false) final String sinceId,
                                   @RequestParam(required = false) final String createdAtMin,
                                   @RequestParam(required = false) final String createdAtMax,
                                   @RequestParam(required = false) final String status) throws Exception {
        OrderRequestParameter orderRequestParameter = OrderRequestParameter.builder()
                .sinceId(sinceId)
                .createdAtMax(createdAtMax)
                .createdAtmMin(createdAtMin)
                .status(status)
                .build();
        localOrderService.importLocalOrderList(orderRequestParameter);
        return true;
    }
}
