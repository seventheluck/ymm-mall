
package com.yangmama.mall.pojo.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Image {

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @Expose
    private Object alt;
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    private Long height;
    @Expose
    private Long id;
    @Expose
    private Long position;
    @SerializedName("product_id")
    private Long productId;
    @Expose
    private String src;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("variant_ids")
    private List<Object> variantIds;
    @Expose
    private Long width;

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public Object getAlt() {
        return alt;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public Long getHeight() {
        return height;
    }

    public Long getId() {
        return id;
    }

    public Long getPosition() {
        return position;
    }

    public Long getProductId() {
        return productId;
    }

    public String getSrc() {
        return src;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public List<Object> getVariantIds() {
        return variantIds;
    }

    public Long getWidth() {
        return width;
    }

    public static class Builder {

        private String adminGraphqlApiId;
        private Object alt;
        private String createdAt;
        private Long height;
        private Long id;
        private Long position;
        private Long productId;
        private String src;
        private String updatedAt;
        private List<Object> variantIds;
        private Long width;

        public Image.Builder withAdminGraphqlApiId(String adminGraphqlApiId) {
            this.adminGraphqlApiId = adminGraphqlApiId;
            return this;
        }

        public Image.Builder withAlt(Object alt) {
            this.alt = alt;
            return this;
        }

        public Image.Builder withCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Image.Builder withHeight(Long height) {
            this.height = height;
            return this;
        }

        public Image.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Image.Builder withPosition(Long position) {
            this.position = position;
            return this;
        }

        public Image.Builder withProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Image.Builder withSrc(String src) {
            this.src = src;
            return this;
        }

        public Image.Builder withUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Image.Builder withVariantIds(List<Object> variantIds) {
            this.variantIds = variantIds;
            return this;
        }

        public Image.Builder withWidth(Long width) {
            this.width = width;
            return this;
        }

        public Image build() {
            Image image = new Image();
            image.adminGraphqlApiId = adminGraphqlApiId;
            image.alt = alt;
            image.createdAt = createdAt;
            image.height = height;
            image.id = id;
            image.position = position;
            image.productId = productId;
            image.src = src;
            image.updatedAt = updatedAt;
            image.variantIds = variantIds;
            image.width = width;
            return image;
        }

    }

}
