package com.yangmama.mall.processor;

import com.google.gson.Gson;
import com.yangmama.mall.pojo.products.Product;
import com.yangmama.mall.pojo.products.ProductList;
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
 * Product processor
 * @author peter ma
 */

@Service
public class ProductProcessor extends BaseProcessor<Product> {

    @Value("${ymm.shopify.url.base.url}")
    private String baseUrl;

    @Value("${ymm.shopify.url.product.url}")
    private String productUrl;

    @Autowired
    private ShopifyApiCaller shopifyApiCaller;

    @Override
    public List<Product> getList() throws IOException {
        List<Product> list = new ArrayList<>();
        String url = getBaseUrl() + getSpecificUrl();
        Optional<String> nextPageUrl = Optional.of(url);
        while (nextPageUrl.isPresent()) {
            Response response = shopifyApiCaller.get(nextPageUrl.get());
            Headers headers = response.headers();
            nextPageUrl = PaginationUtil.getNextPageUrl(headers);
            ProductList partialList =  new Gson().fromJson(response.body().string(), ProductList.class);
            list.addAll(partialList.getProducts());
        }
        return list;
    }

    @Override
    public String getBaseUrl() {
        return baseUrl;
    }

    @Override
    public String getSpecificUrl() {
        return productUrl;
    }
}
