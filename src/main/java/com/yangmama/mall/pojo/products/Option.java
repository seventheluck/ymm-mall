
package com.yangmama.mall.pojo.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Option {

    @Expose
    private Long id;
    @Expose
    private String name;
    @Expose
    private Long position;
    @SerializedName("product_id")
    private Long productId;
    @Expose
    private List<String> values;

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Long getPosition() {
        return position;
    }

    public Long getProductId() {
        return productId;
    }

    public List<String> getValues() {
        return values;
    }

    public static class Builder {

        private Long id;
        private String name;
        private Long position;
        private Long productId;
        private List<String> values;

        public Option.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Option.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Option.Builder withPosition(Long position) {
            this.position = position;
            return this;
        }

        public Option.Builder withProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Option.Builder withValues(List<String> values) {
            this.values = values;
            return this;
        }

        public Option build() {
            Option option = new Option();
            option.id = id;
            option.name = name;
            option.position = position;
            option.productId = productId;
            option.values = values;
            return option;
        }

    }

}
