package com.yangmama.mall.controller;

import com.yangmama.mall.pojo.request.CombinationOrderRequest;
import com.yangmama.mall.service.CombinationService;
import lombok.NonNull;
import org.jetbrains.annotations.NotNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/combination")
public class CombinationController {
    @Autowired
    CombinationService combinationService;

    @PostMapping("/orders")
    public boolean combineOrders(@NotNull @RequestBody CombinationOrderRequest request) throws Exception {
        combinationService.combineOrders(request.getMainOrderDisplayId(), request.getSubordinateOrderDisplayIds());
        return true;
    }
}
