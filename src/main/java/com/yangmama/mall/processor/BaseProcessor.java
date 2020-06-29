package com.yangmama.mall.processor;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.yangmama.mall.utils.PaginationUtil;
import okhttp3.Headers;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 * base processor
 * @author peter ma
 * @param <T> type of record
 */
public abstract class BaseProcessor<T> {

    @Autowired
    private ShopifyApiCaller shopifyApiCaller;

    public List<T> getList() throws IOException {
        List<T> list = new ArrayList<>();
        String url = getBaseUrl() + getSpecificUrl();
        Optional<String> nextPageUrl = Optional.of(url);
        while (nextPageUrl.isPresent()) {
            Response response = shopifyApiCaller.get(nextPageUrl.get());
            Headers headers = response.headers();
            nextPageUrl = PaginationUtil.getNextPageUrl(headers);
            Type listType = new TypeToken<List<T>>(){}.getType();
            List<T> partialList =  new Gson().fromJson(response.body().string(), listType);
            list.addAll(partialList);
        }
        return list;
    }

    /**
     * Get base url address in String format
     * @return base url address
     */
    public abstract String getBaseUrl();


    /**
     * Get specific url address in String format
     * @return specific url address
     */
    public abstract String getSpecificUrl();
}
