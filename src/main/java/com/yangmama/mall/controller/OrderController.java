package com.yangmama.mall.controller;

import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.model.LocalProduct;
import com.yangmama.mall.service.LocalOrderService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    LocalOrderService localOrderService;

    @GetMapping("/orders")
    public List<LocalOrder> getOrderList(@RequestParam(required = false) final String shippingMethod,
                                         @RequestParam final int pageNumber,
                                         @RequestParam final int pageSize) {
        return localOrderService.get(shippingMethod, pageNumber, pageSize);
    }

    @GetMapping("/order")
    public LocalOrder getOrder(@RequestParam String displayId) {
        return localOrderService.getByDisplayId(displayId);
    }

    @PostMapping("/orders")
    public boolean createOrder(@RequestParam final List<LocalProduct> productList,
                               @RequestParam final String shippingMethod) {
        return false;
    }

    @PostMapping("/order/product")
    public boolean addProduct(@NonNull @RequestParam final String orderId,
                              @NonNull @RequestParam final String productId,
                              @RequestParam final int amount) {
        return false;
    }

    @DeleteMapping("/order/product")
    public boolean removeProduct(@NonNull @RequestParam final String orderId,
                                 @NonNull @RequestParam final String productId,
                                 @RequestParam final int amount) {
        return false;
    }

    @PutMapping("/order/product")
    public boolean updateProduct(@NonNull @RequestParam final String orderId,
                                 @NonNull @RequestParam final String productId,
                                 @RequestParam final int amount) {
        return false;
    }

}
