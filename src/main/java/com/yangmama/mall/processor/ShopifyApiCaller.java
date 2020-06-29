package com.yangmama.mall.processor;

import okhttp3.Credentials;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.io.IOException;


/**
 * Set privilege of API in Shopify.com before using this method
 * @author peter ma
 * */

@Service
public class ShopifyApiCaller {

    @Value("${ymm.shopify.api.key}")
    private String apiKey;

    @Value("${ymm.shopify.api.password}")
    private String apiPassword;

    @Autowired
    private OkHttpClient okHttpClient;

    public Response get(String url) throws IOException {
        String credential = Credentials.basic(apiKey, apiPassword);
        Request request = new Request.Builder()
                .header("Authorization", credential)
                .url(url)
                .build();
        Response response = okHttpClient.newCall(request).execute();
//        System.out.println(response.toString());
        return response;
    }
}
