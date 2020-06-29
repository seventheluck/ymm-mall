package com.yangmama.mall.utils;

import com.yangmama.mall.pojo.orders.Order;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ListSplitUtil {

    public static List<Order> getList(List<Order> orderList, String sheetName, Set<String> values) {
        if (values.size() == 0) {
            return orderList;
        }

        List<Order> list = new ArrayList<>();
        for (Order order : orderList) {
            if (order.getOverrideShippingLine() != null) {
                if (values.contains(order.getOverrideShippingLine().getTitle())) {
                    list.add(order);
                }
            } else if (values.contains(order.getShippingLines().get(0).getTitle())) {
                list.add(order);
            }
        }
        return list;
    }
}
