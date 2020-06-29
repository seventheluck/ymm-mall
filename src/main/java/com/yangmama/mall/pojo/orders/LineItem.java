
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class LineItem {

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("discount_allocations")
    private List<Object> discountAllocations;
    @Expose
    private List<Object> duties;
    @SerializedName("fulfillable_quantity")
    private Long fulfillableQuantity;
    @SerializedName("fulfillment_service")
    private String fulfillmentService;
    @SerializedName("fulfillment_status")
    private Object fulfillmentStatus;
    @SerializedName("gift_card")
    private Boolean giftCard;
    @Expose
    private Long grams;
    @Expose
    private Long id;
    @Expose
    private String name;
    @SerializedName("origin_location")
    private OriginLocation originLocation;
    @Expose
    private String price;
    @SerializedName("price_set")
    private PriceSet priceSet;
    @SerializedName("product_exists")
    private Boolean productExists;
    @SerializedName("product_id")
    private Long productId;
    @Expose
    private List<Object> properties;
    @Expose
    private Long quantity;
    @SerializedName("requires_shipping")
    private Boolean requiresShipping;
    @Expose
    private String sku;
    @SerializedName("tax_lines")
    private List<TaxLine> taxLines;
    @Expose
    private Boolean taxable;
    @Expose
    private String title;
    @SerializedName("total_discount")
    private String totalDiscount;
    @SerializedName("total_discount_set")
    private TotalDiscountSet totalDiscountSet;
    @SerializedName("variant_id")
    private Long variantId;
    @SerializedName("variant_inventory_management")
    private String variantInventoryManagement;
    @SerializedName("variant_title")
    private String variantTitle;
    @Expose
    private String vendor;

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public List<Object> getDiscountAllocations() {
        return discountAllocations;
    }

    public List<Object> getDuties() {
        return duties;
    }

    public Long getFulfillableQuantity() {
        return fulfillableQuantity;
    }

    public String getFulfillmentService() {
        return fulfillmentService;
    }

    public Object getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public Boolean getGiftCard() {
        return giftCard;
    }

    public Long getGrams() {
        return grams;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public OriginLocation getOriginLocation() {
        return originLocation;
    }

    public String getPrice() {
        return price;
    }

    public PriceSet getPriceSet() {
        return priceSet;
    }

    public Boolean getProductExists() {
        return productExists;
    }

    public Long getProductId() {
        return productId;
    }

    public List<Object> getProperties() {
        return properties;
    }

    public Long getQuantity() {
        return quantity;
    }

    public Boolean getRequiresShipping() {
        return requiresShipping;
    }

    public String getSku() {
        return sku;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public Boolean getTaxable() {
        return taxable;
    }

    public String getTitle() {
        return title;
    }

    public String getTotalDiscount() {
        return totalDiscount;
    }

    public TotalDiscountSet getTotalDiscountSet() {
        return totalDiscountSet;
    }

    public Long getVariantId() {
        return variantId;
    }

    public String getVariantInventoryManagement() {
        return variantInventoryManagement;
    }

    public String getVariantTitle() {
        return variantTitle;
    }

    public String getVendor() {
        return vendor;
    }

    public static class Builder {

        private String adminGraphqlApiId;
        private List<Object> discountAllocations;
        private List<Object> duties;
        private Long fulfillableQuantity;
        private String fulfillmentService;
        private Object fulfillmentStatus;
        private Boolean giftCard;
        private Long grams;
        private Long id;
        private String name;
        private OriginLocation originLocation;
        private String price;
        private PriceSet priceSet;
        private Boolean productExists;
        private Long productId;
        private List<Object> properties;
        private Long quantity;
        private Boolean requiresShipping;
        private String sku;
        private List<TaxLine> taxLines;
        private Boolean taxable;
        private String title;
        private String totalDiscount;
        private TotalDiscountSet totalDiscountSet;
        private Long variantId;
        private String variantInventoryManagement;
        private String variantTitle;
        private String vendor;

        public LineItem.Builder withAdminGraphqlApiId(String adminGraphqlApiId) {
            this.adminGraphqlApiId = adminGraphqlApiId;
            return this;
        }

        public LineItem.Builder withDiscountAllocations(List<Object> discountAllocations) {
            this.discountAllocations = discountAllocations;
            return this;
        }

        public LineItem.Builder withDuties(List<Object> duties) {
            this.duties = duties;
            return this;
        }

        public LineItem.Builder withFulfillableQuantity(Long fulfillableQuantity) {
            this.fulfillableQuantity = fulfillableQuantity;
            return this;
        }

        public LineItem.Builder withFulfillmentService(String fulfillmentService) {
            this.fulfillmentService = fulfillmentService;
            return this;
        }

        public LineItem.Builder withFulfillmentStatus(Object fulfillmentStatus) {
            this.fulfillmentStatus = fulfillmentStatus;
            return this;
        }

        public LineItem.Builder withGiftCard(Boolean giftCard) {
            this.giftCard = giftCard;
            return this;
        }

        public LineItem.Builder withGrams(Long grams) {
            this.grams = grams;
            return this;
        }

        public LineItem.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public LineItem.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public LineItem.Builder withOriginLocation(OriginLocation originLocation) {
            this.originLocation = originLocation;
            return this;
        }

        public LineItem.Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public LineItem.Builder withPriceSet(PriceSet priceSet) {
            this.priceSet = priceSet;
            return this;
        }

        public LineItem.Builder withProductExists(Boolean productExists) {
            this.productExists = productExists;
            return this;
        }

        public LineItem.Builder withProductId(Long productId) {
            this.productId = productId;
            return this;
        }

        public LineItem.Builder withProperties(List<Object> properties) {
            this.properties = properties;
            return this;
        }

        public LineItem.Builder withQuantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        public LineItem.Builder withRequiresShipping(Boolean requiresShipping) {
            this.requiresShipping = requiresShipping;
            return this;
        }

        public LineItem.Builder withSku(String sku) {
            this.sku = sku;
            return this;
        }

        public LineItem.Builder withTaxLines(List<TaxLine> taxLines) {
            this.taxLines = taxLines;
            return this;
        }

        public LineItem.Builder withTaxable(Boolean taxable) {
            this.taxable = taxable;
            return this;
        }

        public LineItem.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public LineItem.Builder withTotalDiscount(String totalDiscount) {
            this.totalDiscount = totalDiscount;
            return this;
        }

        public LineItem.Builder withTotalDiscountSet(TotalDiscountSet totalDiscountSet) {
            this.totalDiscountSet = totalDiscountSet;
            return this;
        }

        public LineItem.Builder withVariantId(Long variantId) {
            this.variantId = variantId;
            return this;
        }

        public LineItem.Builder withVariantInventoryManagement(String variantInventoryManagement) {
            this.variantInventoryManagement = variantInventoryManagement;
            return this;
        }

        public LineItem.Builder withVariantTitle(String variantTitle) {
            this.variantTitle = variantTitle;
            return this;
        }

        public LineItem.Builder withVendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public LineItem build() {
            LineItem lineItem = new LineItem();
            lineItem.adminGraphqlApiId = adminGraphqlApiId;
            lineItem.discountAllocations = discountAllocations;
            lineItem.duties = duties;
            lineItem.fulfillableQuantity = fulfillableQuantity;
            lineItem.fulfillmentService = fulfillmentService;
            lineItem.fulfillmentStatus = fulfillmentStatus;
            lineItem.giftCard = giftCard;
            lineItem.grams = grams;
            lineItem.id = id;
            lineItem.name = name;
            lineItem.originLocation = originLocation;
            lineItem.price = price;
            lineItem.priceSet = priceSet;
            lineItem.productExists = productExists;
            lineItem.productId = productId;
            lineItem.properties = properties;
            lineItem.quantity = quantity;
            lineItem.requiresShipping = requiresShipping;
            lineItem.sku = sku;
            lineItem.taxLines = taxLines;
            lineItem.taxable = taxable;
            lineItem.title = title;
            lineItem.totalDiscount = totalDiscount;
            lineItem.totalDiscountSet = totalDiscountSet;
            lineItem.variantId = variantId;
            lineItem.variantInventoryManagement = variantInventoryManagement;
            lineItem.variantTitle = variantTitle;
            lineItem.vendor = vendor;
            return lineItem;
        }

    }

}
