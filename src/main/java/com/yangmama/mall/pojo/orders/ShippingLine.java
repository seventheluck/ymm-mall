
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ShippingLine {

    @SerializedName("carrier_identifier")
    private Object carrierIdentifier;
    @Expose
    private String code;
    @SerializedName("delivery_category")
    private Object deliveryCategory;
    @SerializedName("discount_allocations")
    private List<Object> discountAllocations;
    @SerializedName("discounted_price")
    private String discountedPrice;
    @SerializedName("discounted_price_set")
    private DiscountedPriceSet discountedPriceSet;
    @Expose
    private Long id;
    @Expose
    private Object phone;
    @Expose
    private String price;
    @SerializedName("price_set")
    private PriceSet priceSet;
    @SerializedName("requested_fulfillment_service_id")
    private Object requestedFulfillmentServiceId;
    @Expose
    private String source;
    @SerializedName("tax_lines")
    private List<TaxLine> taxLines;
    @Expose
    private String title;

    public Object getCarrierIdentifier() {
        return carrierIdentifier;
    }

    public String getCode() {
        return code;
    }

    public Object getDeliveryCategory() {
        return deliveryCategory;
    }

    public List<Object> getDiscountAllocations() {
        return discountAllocations;
    }

    public String getDiscountedPrice() {
        return discountedPrice;
    }

    public DiscountedPriceSet getDiscountedPriceSet() {
        return discountedPriceSet;
    }

    public Long getId() {
        return id;
    }

    public Object getPhone() {
        return phone;
    }

    public String getPrice() {
        return price;
    }

    public PriceSet getPriceSet() {
        return priceSet;
    }

    public Object getRequestedFulfillmentServiceId() {
        return requestedFulfillmentServiceId;
    }

    public String getSource() {
        return source;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder {

        private Object carrierIdentifier;
        private String code;
        private Object deliveryCategory;
        private List<Object> discountAllocations;
        private String discountedPrice;
        private DiscountedPriceSet discountedPriceSet;
        private Long id;
        private Object phone;
        private String price;
        private PriceSet priceSet;
        private Object requestedFulfillmentServiceId;
        private String source;
        private List<TaxLine> taxLines;
        private String title;

        public ShippingLine.Builder withCarrierIdentifier(Object carrierIdentifier) {
            this.carrierIdentifier = carrierIdentifier;
            return this;
        }

        public ShippingLine.Builder withCode(String code) {
            this.code = code;
            return this;
        }

        public ShippingLine.Builder withDeliveryCategory(Object deliveryCategory) {
            this.deliveryCategory = deliveryCategory;
            return this;
        }

        public ShippingLine.Builder withDiscountAllocations(List<Object> discountAllocations) {
            this.discountAllocations = discountAllocations;
            return this;
        }

        public ShippingLine.Builder withDiscountedPrice(String discountedPrice) {
            this.discountedPrice = discountedPrice;
            return this;
        }

        public ShippingLine.Builder withDiscountedPriceSet(DiscountedPriceSet discountedPriceSet) {
            this.discountedPriceSet = discountedPriceSet;
            return this;
        }

        public ShippingLine.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public ShippingLine.Builder withPhone(Object phone) {
            this.phone = phone;
            return this;
        }

        public ShippingLine.Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public ShippingLine.Builder withPriceSet(PriceSet priceSet) {
            this.priceSet = priceSet;
            return this;
        }

        public ShippingLine.Builder withRequestedFulfillmentServiceId(Object requestedFulfillmentServiceId) {
            this.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
            return this;
        }

        public ShippingLine.Builder withSource(String source) {
            this.source = source;
            return this;
        }

        public ShippingLine.Builder withTaxLines(List<TaxLine> taxLines) {
            this.taxLines = taxLines;
            return this;
        }

        public ShippingLine.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public ShippingLine build() {
            ShippingLine shippingLine = new ShippingLine();
            shippingLine.carrierIdentifier = carrierIdentifier;
            shippingLine.code = code;
            shippingLine.deliveryCategory = deliveryCategory;
            shippingLine.discountAllocations = discountAllocations;
            shippingLine.discountedPrice = discountedPrice;
            shippingLine.discountedPriceSet = discountedPriceSet;
            shippingLine.id = id;
            shippingLine.phone = phone;
            shippingLine.price = price;
            shippingLine.priceSet = priceSet;
            shippingLine.requestedFulfillmentServiceId = requestedFulfillmentServiceId;
            shippingLine.source = source;
            shippingLine.taxLines = taxLines;
            shippingLine.title = title;
            return shippingLine;
        }

    }

}
