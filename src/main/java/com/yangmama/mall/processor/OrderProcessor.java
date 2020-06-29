package com.yangmama.mall.processor;

import com.google.common.base.Strings;
import com.google.gson.Gson;
import com.yangmama.mall.pojo.orders.Order;
import com.yangmama.mall.pojo.orders.OrderList;
import com.yangmama.mall.pojo.request.OrderRequestParameter;
import com.yangmama.mall.utils.PaginationUtil;
import okhttp3.Headers;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * Order processor
 * @author peter ma
 */

@Service
public class OrderProcessor extends BaseProcessor<Order> {

    @Value("${ymm.shopify.url.base.url}")
    private String baseUrl;

    @Value("${ymm.shopify.url.order.url}")
    private String orderUrl;

    @Autowired
    private ShopifyApiCaller shopifyApiCaller;

    public List<Order> getList(OrderRequestParameter orderRequestParameter) throws IOException {
        List<Order> list = new ArrayList<>();
        String url = urlParameterWrapper(getBaseUrl() + getSpecificUrl(), orderRequestParameter);
        Optional<String> nextPageUrl = Optional.of(url);
        while (nextPageUrl.isPresent()) {
            Response response = shopifyApiCaller.get(nextPageUrl.get());
            Headers headers = response.headers();
            nextPageUrl = PaginationUtil.getNextPageUrl(headers);
            OrderList partialList =  new Gson().fromJson(response.body().string(), OrderList.class);
            list.addAll(partialList.getOrders());
        }
        return list;
    }

    public String urlParameterWrapper(String url, OrderRequestParameter orderRequestParameter) {
        StringBuilder sb = new StringBuilder();
        if (!Strings.isNullOrEmpty(orderRequestParameter.getAttributionAppId())) {
            sb.append("&attribution_app_id=").append(orderRequestParameter.getAttributionAppId());
        }

        if (!Strings.isNullOrEmpty(orderRequestParameter.getCreatedAtMax())) {
            sb.append("&created_at_man=").append(orderRequestParameter.getCreatedAtMax());
        }

        if (!Strings.isNullOrEmpty(orderRequestParameter.getCreatedAtmMin())) {
            sb.append("&created_at_min=").append(orderRequestParameter.getCreatedAtmMin());
        }

        if (!Strings.isNullOrEmpty(orderRequestParameter.getLimit())) {
            sb.append("&limit=").append(orderRequestParameter.getLimit());
        }

        if (!Strings.isNullOrEmpty(orderRequestParameter.getSinceId())) {
            sb.append("&since_id=").append(orderRequestParameter.getSinceId());
        }

        if (!Strings.isNullOrEmpty((orderRequestParameter.getUpdatedAtMin()))) {
            sb.append("&updated_at_min=").append(orderRequestParameter.getUpdatedAtMin());
        }

        if (!Strings.isNullOrEmpty(orderRequestParameter.getUpdatedAtMax())) {
            sb.append("&updated_at_max=").append(orderRequestParameter.getUpdatedAtMax());
        }

        if (!Strings.isNullOrEmpty(orderRequestParameter.getStatus())) {
            sb.append("&status=").append(orderRequestParameter.getStatus());
        }

        return url + "?" + sb.toString().substring(1);
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public String getSpecificUrl() {
        return orderUrl;
    }
}
