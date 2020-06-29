package com.yangmama.mall.utils;

import com.yangmama.mall.pojo.orders.LineItem;
import com.yangmama.mall.pojo.orders.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/**
 * Order filter
 * @author peter ma
 */
public class OrderFilter {
    private List<Order> allOrders;
    public OrderFilter(List<Order> allOrders) {
        this.allOrders = new ArrayList<>(allOrders);
    }

    private List<Order> findBy(Set<String> filterSet) {
        List<Order> result = new ArrayList<>();
        for (Order order : allOrders) {
            List<LineItem> lineItems = order.getLineItems();
            for (LineItem lineItem : lineItems) {
                if (filterSet.contains(lineItem.getName())) {
                    result.add(order);
                    break;
                }
            }
        }
        return result;
    }

    public List<String> findAllEmails(Set<String> filterSet) {
        List<Order> orders = findBy(filterSet);
        List<String> emails = new ArrayList<>();
        for (Order order : orders) {
            emails.add(order.getEmail());
        }
        return emails;
    }

    public List<String> findAllOrderIds(Set<String> filterSet) {
        List<Order> orders = findBy(filterSet);
        List<String> orderIds = new ArrayList<>();
        for (Order order : orders) {
            orderIds.add(order.getName());
        }
        return orderIds;
    }

    public List<String> findAllIds(Set<String> filterSet) {
        List<Order> orders = findBy(filterSet);
        List<String> orderIds = new ArrayList<>();
        for (Order order : orders) {
            orderIds.add("https://yangmama.myshopify.com/admin/orders/"+order.getId());
        }
        return orderIds;
    }
}
