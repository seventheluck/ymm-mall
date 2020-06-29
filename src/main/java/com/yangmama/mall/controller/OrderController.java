package com.yangmama.mall.controller;

import com.yangmama.mall.model.LocalOrder;
import com.yangmama.mall.model.LocalOrderSummary;
import com.yangmama.mall.model.LocalProduct;
import com.yangmama.mall.pojo.request.OrderRequestParameter;
import com.yangmama.mall.service.LocalOrderService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
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

    @PostMapping("/addorders")
    public boolean createOrder(@RequestParam final List<LocalProduct> productList,
                               @RequestParam final String shippingMethod) {
        return false;
    }

    @GetMapping("/orders/summary")
    public List<LocalOrderSummary> getOrderSummary() {
        return null;
    }

    @PostMapping("/orders/addproduct")
    public boolean addProduct(@NonNull @RequestParam final String orderId,
                              @NonNull @RequestParam final String productId,
                              @RequestParam final int amount) {
        return false;
    }

    @PostMapping("/order/deleteproduct")
    public boolean removeProduct(@NonNull @RequestParam final String orderId,
                                 @NonNull @RequestParam final String productId,
                                 @RequestParam final int amount) {
        return false;
    }

    @PostMapping("/order/updateproduct")
    public boolean updateProduct(@NonNull @RequestParam final String orderId,
                                 @NonNull @RequestParam final String productId,
                                 @RequestParam final int amount) {
        return false;
    }

}
