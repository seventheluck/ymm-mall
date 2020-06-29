
package com.yangmama.mall.pojo.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Product {

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("body_html")
    private String bodyHtml;
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    private String handle;
    @Expose
    private Long id;
    @Expose
    private Image image;
    @Expose
    private List<Image> images;
    @Expose
    private List<Option> options;
    @SerializedName("product_type")
    private String productType;
    @SerializedName("published_at")
    private String publishedAt;
    @SerializedName("published_scope")
    private String publishedScope;
    @Expose
    private String tags;
    @SerializedName("template_suffix")
    private String templateSuffix;
    @Expose
    private String title;
    @SerializedName("updated_at")
    private String updatedAt;
    @Expose
    private List<Variant> variants;
    @Expose
    private String vendor;

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getHandle() {
        return handle;
    }

    public Long getId() {
        return id;
    }

    public Image getImage() {
        return image;
    }

    public List<Image> getImages() {
        return images;
    }

    public List<Option> getOptions() {
        return options;
    }

    public String getProductType() {
        return productType;
    }

    public String getPublishedAt() {
        return publishedAt;
    }

    public String getPublishedScope() {
        return publishedScope;
    }

    public String getTags() {
        return tags;
    }

    public String getTemplateSuffix() {
        return templateSuffix;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public List<Variant> getVariants() {
        return variants;
    }

    public String getVendor() {
        return vendor;
    }

    public static class Builder {

        private String adminGraphqlApiId;
        private String bodyHtml;
        private String createdAt;
        private String handle;
        private Long id;
        private Image image;
        private List<Image> images;
        private List<Option> options;
        private String productType;
        private String publishedAt;
        private String publishedScope;
        private String tags;
        private String templateSuffix;
        private String title;
        private String updatedAt;
        private List<Variant> variants;
        private String vendor;

        public Product.Builder withAdminGraphqlApiId(String adminGraphqlApiId) {
            this.adminGraphqlApiId = adminGraphqlApiId;
            return this;
        }

        public Product.Builder withBodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        public Product.Builder withCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Product.Builder withHandle(String handle) {
            this.handle = handle;
            return this;
        }

        public Product.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Product.Builder withImage(Image image) {
            this.image = image;
            return this;
        }

        public Product.Builder withImages(List<Image> images) {
            this.images = images;
            return this;
        }

        public Product.Builder withOptions(List<Option> options) {
            this.options = options;
            return this;
        }

        public Product.Builder withProductType(String productType) {
            this.productType = productType;
            return this;
        }

        public Product.Builder withPublishedAt(String publishedAt) {
            this.publishedAt = publishedAt;
            return this;
        }

        public Product.Builder withPublishedScope(String publishedScope) {
            this.publishedScope = publishedScope;
            return this;
        }

        public Product.Builder withTags(String tags) {
            this.tags = tags;
            return this;
        }

        public Product.Builder withTemplateSuffix(String templateSuffix) {
            this.templateSuffix = templateSuffix;
            return this;
        }

        public Product.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Product.Builder withUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Product.Builder withVariants(List<Variant> variants) {
            this.variants = variants;
            return this;
        }

        public Product.Builder withVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public Product build() {
            Product product = new Product();
            product.adminGraphqlApiId = adminGraphqlApiId;
            product.bodyHtml = bodyHtml;
            product.createdAt = createdAt;
            product.handle = handle;
            product.id = id;
            product.image = image;
            product.images = images;
            product.options = options;
            product.productType = productType;
            product.publishedAt = publishedAt;
            product.publishedScope = publishedScope;
            product.tags = tags;
            product.templateSuffix = templateSuffix;
            product.title = title;
            product.updatedAt = updatedAt;
            product.variants = variants;
            product.vendor = vendor;
            return product;
        }

    }

}
