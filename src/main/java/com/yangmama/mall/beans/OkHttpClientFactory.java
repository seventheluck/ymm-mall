package com.yangmama.mall.beans;

import okhttp3.OkHttpClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

/**
 * OkHttpClient factory
 * @author peter ma
 */

@Configuration
public class OkHttpClientFactory {
    @Bean
    public OkHttpClient getClientInstance() {
        return new OkHttpClient().newBuilder()
                .readTimeout(20000L, TimeUnit.MILLISECONDS)
                .connectTimeout(20000L, TimeUnit.MILLISECONDS)
                .build();
    }
}
