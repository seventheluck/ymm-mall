
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OrderList {

    @Expose
    private List<Order> orders;

    public List<Order> getOrders() {
        return orders;
    }

    public static class Builder {

        private List<Order> orders;

        public OrderList.Builder withOrders(List<Order> orders) {
            this.orders = orders;
            return this;
        }

        public OrderList build() {
            OrderList orderList = new OrderList();
            orderList.orders = orders;
            return orderList;
        }

    }

}
