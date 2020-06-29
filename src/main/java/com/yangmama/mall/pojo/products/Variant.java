
package com.yangmama.mall.pojo.products;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Variant {

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @Expose
    private String barcode;
    @SerializedName("compare_at_price")
    private Object compareAtPrice;
    @SerializedName("created_at")
    private String createdAt;
    @SerializedName("fulfillment_service")
    private String fulfillmentService;
    @Expose
    private Long grams;
    @Expose
    private Long id;
    @SerializedName("image_id")
    private Object imageId;
    @SerializedName("inventory_item_id")
    private Long inventoryItemId;
    @SerializedName("inventory_management")
    private String inventoryManagement;
    @SerializedName("inventory_policy")
    private String inventoryPolicy;
    @SerializedName("inventory_quantity")
    private Long inventoryQuantity;
    @SerializedName("old_inventory_quantity")
    private Long oldInventoryQuantity;
    @Expose
    private String option1;
    @Expose
    private Object option2;
    @Expose
    private Object option3;
    @Expose
    private Long position;
    @Expose
    private String price;
    @SerializedName("product_id")
    private Long productId;
    @SerializedName("requires_shipping")
    private Boolean requiresShipping;
    @Expose
    private String sku;
    @Expose
    private Boolean taxable;
    @Expose
    private String title;
    @SerializedName("updated_at")
    private String updatedAt;
    @Expose
    private Double weight;
    @SerializedName("weight_unit")
    private String weightUnit;

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public String getBarcode() {
        return barcode;
    }

    public Object getCompareAtPrice() {
        return compareAtPrice;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public Long getGrams() {
        return grams;
    }

    public Long getId() {
        return id;
    }

    public Object getImageId() {
        return imageId;
    }

    public Long getInventoryItemId() {
        return inventoryItemId;
    }

    public String getInventoryManagement() {
        return inventoryManagement;
    }

    public String getInventoryPolicy() {
        return inventoryPolicy;
    }

    public Long getInventoryQuantity() {
        return inventoryQuantity;
    }

    public Long getOldInventoryQuantity() {
        return oldInventoryQuantity;
    }

    public String getOption1() {
        return option1;
    }

    public Object getOption2() {
        return option2;
    }

    public Object getOption3() {
        return option3;
    }

    public Long getPosition() {
        return position;
    }

    public String getPrice() {
        return price;
    }

    public Long getProductId() {
        return productId;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    public String getSku() {
        return sku;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public String getTitle() {
        return title;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Double getWeight() {
        return weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public static class Builder {

        private String adminGraphqlApiId;
        private String barcode;
        private Object compareAtPrice;
        private String createdAt;
        private String fulfillmentService;
        private Long grams;
        private Long id;
        private Object imageId;
        private Long inventoryItemId;
        private String inventoryManagement;
        private String inventoryPolicy;
        private Long inventoryQuantity;
        private Long oldInventoryQuantity;
        private String option1;
        private Object option2;
        private Object option3;
        private Long position;
        private String price;
        private Long productId;
        private Boolean requiresShipping;
        private String sku;
        private Boolean taxable;
        private String title;
        private String updatedAt;
        private Double weight;
        private String weightUnit;

        public Variant.Builder withAdminGraphqlApiId(String adminGraphqlApiId) {
            this.adminGraphqlApiId = adminGraphqlApiId;
            return this;
        }

        public Variant.Builder withBarcode(String barcode) {
            this.barcode = barcode;
            return this;
        }

        public Variant.Builder withCompareAtPrice(Object compareAtPrice) {
            this.compareAtPrice = compareAtPrice;
            return this;
        }

        public Variant.Builder withCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Variant.Builder withFulfillmentService(String fulfillmentService) {
            this.fulfillmentService = fulfillmentService;
            return this;
        }

        public Variant.Builder withGrams(Long grams) {
            this.grams = grams;
            return this;
        }

        public Variant.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Variant.Builder withImageId(Object imageId) {
            this.imageId = imageId;
            return this;
        }

        public Variant.Builder withInventoryItemId(Long inventoryItemId) {
            this.inventoryItemId = inventoryItemId;
            return this;
        }

        public Variant.Builder withInventoryManagement(String inventoryManagement) {
            this.inventoryManagement = inventoryManagement;
            return this;
        }

        public Variant.Builder withInventoryPolicy(String inventoryPolicy) {
            this.inventoryPolicy = inventoryPolicy;
            return this;
        }

        public Variant.Builder withInventoryQuantity(Long inventoryQuantity) {
            this.inventoryQuantity = inventoryQuantity;
            return this;
        }

        public Variant.Builder withOldInventoryQuantity(Long oldInventoryQuantity) {
            this.oldInventoryQuantity = oldInventoryQuantity;
            return this;
        }

        public Variant.Builder withOption1(String option1) {
            this.option1 = option1;
            return this;
        }

        public Variant.Builder withOption2(Object option2) {
            this.option2 = option2;
            return this;
        }

        public Variant.Builder withOption3(Object option3) {
            this.option3 = option3;
            return this;
        }

        public Variant.Builder withPosition(Long position) {
            this.position = position;
            return this;
        }

        public Variant.Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public Variant.Builder withProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public Variant.Builder withRequiresShipping(Boolean requiresShipping) {
            this.requiresShipping = requiresShipping;
            return this;
        }

        public Variant.Builder withSku(String sku) {
            this.sku = sku;
            return this;
        }

        public Variant.Builder withTaxable(Boolean taxable) {
            this.taxable = taxable;
            return this;
        }

        public Variant.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public Variant.Builder withUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Variant.Builder withWeight(Double weight) {
            this.weight = weight;
            return this;
        }

        public Variant.Builder withWeightUnit(String weightUnit) {
            this.weightUnit = weightUnit;
            return this;
        }

        public Variant build() {
            Variant variant = new Variant();
            variant.adminGraphqlApiId = adminGraphqlApiId;
            variant.barcode = barcode;
            variant.compareAtPrice = compareAtPrice;
            variant.createdAt = createdAt;
            variant.fulfillmentService = fulfillmentService;
            variant.grams = grams;
            variant.id = id;
            variant.imageId = imageId;
            variant.inventoryItemId = inventoryItemId;
            variant.inventoryManagement = inventoryManagement;
            variant.inventoryPolicy = inventoryPolicy;
            variant.inventoryQuantity = inventoryQuantity;
            variant.oldInventoryQuantity = oldInventoryQuantity;
            variant.option1 = option1;
            variant.option2 = option2;
            variant.option3 = option3;
            variant.position = position;
            variant.price = price;
            variant.productId = productId;
            variant.requiresShipping = requiresShipping;
            variant.sku = sku;
            variant.taxable = taxable;
            variant.title = title;
            variant.updatedAt = updatedAt;
            variant.weight = weight;
            variant.weightUnit = weightUnit;
            return variant;
        }

    }

}
