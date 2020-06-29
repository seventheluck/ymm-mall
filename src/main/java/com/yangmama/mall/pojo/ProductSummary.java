package com.yangmama.mall.pojo;

import com.yangmama.mall.pojo.products.Product;

public class ProductSummary {
    private String name;
    private Long count;
    private Product product;

    public ProductSummary(String name, Long count, Product product) {
        this.name = name;
        this.count = count;
        this.product = product;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }
}
