package com.yangmama.mall.controller;

import com.yangmama.mall.model.LocalOrderSummary;
import com.yangmama.mall.service.LocalOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/summary")
public class OrderSummaryController {
    @Autowired
    LocalOrderService localOrderService;

    @GetMapping("/orders")
    public List<LocalOrderSummary> getOrderSummary() {
        return null;
    }
}
