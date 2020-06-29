
package com.yangmama.mall.pojo.products;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ProductList {

    @Expose
    private List<Product> products;

    public List<Product> getProducts() {
        return products;
    }

    public static class Builder {

        private List<Product> products;

        public ProductList.Builder withProducts(List<Product> products) {
            this.products = products;
            return this;
        }

        public ProductList build() {
            ProductList productList = new ProductList();
            productList.products = products;
            return productList;
        }

    }

}
