package com.yangmama.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ShippingMethodController {

    @GetMapping("/shipping")
    public List<String> getShippingMethod() {
        return null;
    }
}
