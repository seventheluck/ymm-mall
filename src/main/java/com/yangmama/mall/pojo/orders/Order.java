package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Order {

    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("app_id")
    private Long appId;
    @SerializedName("billing_address")
    private BillingAddress billingAddress;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("buyer_accepts_marketing")
    private Boolean buyerAcceptsMarketing;
    @SerializedName("cancel_reason")
    private Object cancelReason;
    @SerializedName("cancelled_at")
    private Object cancelledAt;
    @SerializedName("cart_token")
    private String cartToken;
    @SerializedName("checkout_id")
    private Long checkoutId;
    @SerializedName("checkout_token")
    private String checkoutToken;
    @SerializedName("client_details")
    private ClientDetails clientDetails;
    @SerializedName("closed_at")
    private Object closedAt;
    @Expose
    private Boolean confirmed;
    @SerializedName("contact_email")
    private String contactEmail;
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    private String currency;
    @SerializedName("current_total_duties_set")
    private Object currentTotalDutiesSet;
    @Expose
    private Customer customer;
    @SerializedName("customer_locale")
    private String customerLocale;
    @SerializedName("device_id")
    private Object deviceId;
    @SerializedName("discount_applications")
    private List<Object> discountApplications;
    @SerializedName("discount_codes")
    private List<Object> discountCodes;
    @Expose
    private String email;
    @SerializedName("financial_status")
    private String financialStatus;
    @SerializedName("fulfillment_status")
    private Object fulfillmentStatus;
    @Expose
    private List<Object> fulfillments;
    @Expose
    private String gateway;
    @Expose
    private Long id;
    @SerializedName("landing_site")
    private String landingSite;
    @SerializedName("landing_site_ref")
    private Object landingSiteRef;
    @SerializedName("line_items")
    private List<LineItem> lineItems;
    @SerializedName("additional_line_items")
    private List<LineItem> additionalLineItems;
    @SerializedName("location_id")
    private Object locationId;
    @Expose
    private String name;
    @Expose
    private String note;
    @SerializedName("note_attributes")
    private List<Object> noteAttributes;
    @Expose
    private Long number;
    @SerializedName("order_number")
    private Long orderNumber;
    @SerializedName("order_status_url")
    private String orderStatusUrl;
    @SerializedName("original_total_duties_set")
    private Object originalTotalDutiesSet;
    @SerializedName("payment_details")
    private PaymentDetails paymentDetails;
    @SerializedName("payment_gateway_names")
    private List<String> paymentGatewayNames;
    @Expose
    private Object phone;
    @SerializedName("presentment_currency")
    private String presentmentCurrency;
    @SerializedName("processed_at")
    private String processedAt;
    @SerializedName("processing_method")
    private String processingMethod;
    @Expose
    private Object reference;
    @SerializedName("referring_site")
    private String referringSite;
    @Expose
    private List<Object> refunds;
    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;
    @SerializedName("shipping_lines")
    private List<ShippingLine> shippingLines;
    @SerializedName("override_shipping_lines")
    private ShippingLine overrideShippingLine;
    @SerializedName("source_identifier")
    private Object sourceIdentifier;
    @SerializedName("source_name")
    private String sourceName;
    @SerializedName("source_url")
    private Object sourceUrl;
    @SerializedName("subtotal_price")
    private String subtotalPrice;
    @SerializedName("subtotal_price_set")
    private SubtotalPriceSet subtotalPriceSet;
    @Expose
    private String tags;
    @SerializedName("tax_lines")
    private List<TaxLine> taxLines;
    @SerializedName("taxes_included")
    private Boolean taxesIncluded;
    @Expose
    private Boolean test;
    @Expose
    private String token;
    @SerializedName("total_discounts")
    private String totalDiscounts;
    @SerializedName("total_discounts_set")
    private TotalDiscountsSet totalDiscountsSet;
    @SerializedName("total_line_items_price")
    private String totalLineItemsPrice;
    @SerializedName("additional_total_line_items_price")
    private String additionalSubtotal;
    @SerializedName("total_line_items_price_set")
    private TotalLineItemsPriceSet totalLineItemsPriceSet;
    @SerializedName("total_price")
    private String totalPrice;
    @SerializedName("total_price_set")
    private TotalPriceSet totalPriceSet;
    @SerializedName("total_price_usd")
    private String totalPriceUsd;
    @SerializedName("total_shipping_price_set")
    private TotalShippingPriceSet totalShippingPriceSet;
    @SerializedName("total_tax")
    private String totalTax;
    @SerializedName("total_tax_set")
    private TotalTaxSet totalTaxSet;
    @SerializedName("total_tip_received")
    private String totalTipReceived;
    @SerializedName("total_weight")
    private Long totalWeight;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("user_id")
    private Object userId;

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public Long getAppId() {
        return appId;
    }

    public BillingAddress getBillingAddress() {
        return billingAddress;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public Boolean getBuyerAcceptsMarketing() {
        return buyerAcceptsMarketing;
    }

    public Object getCancelReason() {
        return cancelReason;
    }

    public Object getCancelledAt() {
        return cancelledAt;
    }

    public String getCartToken() {
        return cartToken;
    }

    public Long getCheckoutId() {
        return checkoutId;
    }

    public String getCheckoutToken() {
        return checkoutToken;
    }

    public ClientDetails getClientDetails() {
        return clientDetails;
    }

    public Object getClosedAt() {
        return closedAt;
    }

    public Boolean getConfirmed() {
        return confirmed;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public Object getCurrentTotalDutiesSet() {
        return currentTotalDutiesSet;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String getCustomerLocale() {
        return customerLocale;
    }

    public Object getDeviceId() {
        return deviceId;
    }

    public List<Object> getDiscountApplications() {
        return discountApplications;
    }

    public List<Object> getDiscountCodes() {
        return discountCodes;
    }

    public String getEmail() {
        return email;
    }

    public String getFinancialStatus() {
        return financialStatus;
    }

    public Object getFulfillmentStatus() {
        return fulfillmentStatus;
    }

    public List<Object> getFulfillments() {
        return fulfillments;
    }

    public String getGateway() {
        return gateway;
    }

    public Long getId() {
        return id;
    }

    public String getLandingSite() {
        return landingSite;
    }

    public Object getLandingSiteRef() {
        return landingSiteRef;
    }

    public List<LineItem> getLineItems() {
        return lineItems;
    }

    public List<LineItem> getAdditionalLineItems() {
        return additionalLineItems;
    }

    public void setAdditionalLineItems(List<LineItem> additionalLineItems) {
        this.additionalLineItems = additionalLineItems;
    }

    public Object getLocationId() {
        return locationId;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public List<Object> getNoteAttributes() {
        return noteAttributes;
    }

    public Long getNumber() {
        return number;
    }

    public Long getOrderNumber() {
        return orderNumber;
    }

    public String getOrderStatusUrl() {
        return orderStatusUrl;
    }

    public Object getOriginalTotalDutiesSet() {
        return originalTotalDutiesSet;
    }

    public PaymentDetails getPaymentDetails() {
        return paymentDetails;
    }

    public List<String> getPaymentGatewayNames() {
        return paymentGatewayNames;
    }

    public Object getPhone() {
        return phone;
    }

    public String getPresentmentCurrency() {
        return presentmentCurrency;
    }

    public String getProcessedAt() {
        return processedAt;
    }

    public String getProcessingMethod() {
        return processingMethod;
    }

    public Object getReference() {
        return reference;
    }

    public String getReferringSite() {
        return referringSite;
    }

    public List<Object> getRefunds() {
        return refunds;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    public List<ShippingLine> getShippingLines() {
        return shippingLines;
    }

    public ShippingLine getOverrideShippingLine() {
        return overrideShippingLine;
    }

    public void setOverrideShippingLine(ShippingLine shippingLine) {
        this.overrideShippingLine = shippingLine;
    }

    public Object getSourceIdentifier() {
        return sourceIdentifier;
    }

    public String getSourceName() {
        return sourceName;
    }

    public Object getSourceUrl() {
        return sourceUrl;
    }

    public String getSubtotalPrice() {
        return subtotalPrice;
    }

    public SubtotalPriceSet getSubtotalPriceSet() {
        return subtotalPriceSet;
    }

    public String getTags() {
        return tags;
    }

    public List<TaxLine> getTaxLines() {
        return taxLines;
    }

    public Boolean getTaxesIncluded() {
        return taxesIncluded;
    }

    public Boolean getTest() {
        return test;
    }

    public String getToken() {
        return token;
    }

    public String getTotalDiscounts() {
        return totalDiscounts;
    }

    public TotalDiscountsSet getTotalDiscountsSet() {
        return totalDiscountsSet;
    }

    public String getTotalLineItemsPrice() {
        return totalLineItemsPrice;
    }

    public String getAdditionalSubtotal() {
        return additionalSubtotal;
    }

    public void setAdditionalSubtotal(String additionalSubtotal) {
        this.additionalSubtotal = additionalSubtotal;
    }

    public TotalLineItemsPriceSet getTotalLineItemsPriceSet() {
        return totalLineItemsPriceSet;
    }

    public String getTotalPrice() {
        return totalPrice;
    }

    public TotalPriceSet getTotalPriceSet() {
        return totalPriceSet;
    }

    public String getTotalPriceUsd() {
        return totalPriceUsd;
    }

    public TotalShippingPriceSet getTotalShippingPriceSet() {
        return totalShippingPriceSet;
    }

    public String getTotalTax() {
        return totalTax;
    }

    public TotalTaxSet getTotalTaxSet() {
        return totalTaxSet;
    }

    public String getTotalTipReceived() {
        return totalTipReceived;
    }

    public Long getTotalWeight() {
        return totalWeight;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Object getUserId() {
        return userId;
    }

    public static class Builder {

        private String adminGraphqlApiId;
        private Long appId;
        private BillingAddress billingAddress;
        private String browserIp;
        private Boolean buyerAcceptsMarketing;
        private Object cancelReason;
        private Object cancelledAt;
        private String cartToken;
        private Long checkoutId;
        private String checkoutToken;
        private ClientDetails clientDetails;
        private Object closedAt;
        private Boolean confirmed;
        private String contactEmail;
        private String createdAt;
        private String currency;
        private Object currentTotalDutiesSet;
        private Customer customer;
        private String customerLocale;
        private Object deviceId;
        private List<Object> discountApplications;
        private List<Object> discountCodes;
        private String email;
        private String financialStatus;
        private Object fulfillmentStatus;
        private List<Object> fulfillments;
        private String gateway;
        private Long id;
        private String landingSite;
        private Object landingSiteRef;
        private List<LineItem> lineItems;
        private List<LineItem> additionalLineItems;
        private Object locationId;
        private String name;
        private String note;
        private List<Object> noteAttributes;
        private Long number;
        private Long orderNumber;
        private String orderStatusUrl;
        private Object originalTotalDutiesSet;
        private PaymentDetails paymentDetails;
        private List<String> paymentGatewayNames;
        private Object phone;
        private String presentmentCurrency;
        private String processedAt;
        private String processingMethod;
        private Object reference;
        private String referringSite;
        private List<Object> refunds;
        private ShippingAddress shippingAddress;
        private List<ShippingLine> shippingLines;
        private ShippingLine overrideShippingLine;
        private Object sourceIdentifier;
        private String sourceName;
        private Object sourceUrl;
        private String subtotalPrice;
        private SubtotalPriceSet subtotalPriceSet;
        private String tags;
        private List<TaxLine> taxLines;
        private Boolean taxesIncluded;
        private Boolean test;
        private String token;
        private String totalDiscounts;
        private TotalDiscountsSet totalDiscountsSet;
        private String totalLineItemsPrice;
        private String additionalSubtotal;
        private TotalLineItemsPriceSet totalLineItemsPriceSet;
        private String totalPrice;
        private TotalPriceSet totalPriceSet;
        private String totalPriceUsd;
        private TotalShippingPriceSet totalShippingPriceSet;
        private String totalTax;
        private TotalTaxSet totalTaxSet;
        private String totalTipReceived;
        private Long totalWeight;
        private String updatedAt;
        private Object userId;

        public Order.Builder withAdminGraphqlApiId(String adminGraphqlApiId) {
            this.adminGraphqlApiId = adminGraphqlApiId;
            return this;
        }

        public Order.Builder withAppId(Long appId) {
            this.appId = appId;
            return this;
        }

        public Order.Builder withBillingAddress(BillingAddress billingAddress) {
            this.billingAddress = billingAddress;
            return this;
        }

        public Order.Builder withBrowserIp(String browserIp) {
            this.browserIp = browserIp;
            return this;
        }

        public Order.Builder withBuyerAcceptsMarketing(Boolean buyerAcceptsMarketing) {
            this.buyerAcceptsMarketing = buyerAcceptsMarketing;
            return this;
        }

        public Order.Builder withCancelReason(Object cancelReason) {
            this.cancelReason = cancelReason;
            return this;
        }

        public Order.Builder withCancelledAt(Object cancelledAt) {
            this.cancelledAt = cancelledAt;
            return this;
        }

        public Order.Builder withCartToken(String cartToken) {
            this.cartToken = cartToken;
            return this;
        }

        public Order.Builder withCheckoutId(Long checkoutId) {
            this.checkoutId = checkoutId;
            return this;
        }

        public Order.Builder withCheckoutToken(String checkoutToken) {
            this.checkoutToken = checkoutToken;
            return this;
        }

        public Order.Builder withClientDetails(ClientDetails clientDetails) {
            this.clientDetails = clientDetails;
            return this;
        }

        public Order.Builder withClosedAt(Object closedAt) {
            this.closedAt = closedAt;
            return this;
        }

        public Order.Builder withConfirmed(Boolean confirmed) {
            this.confirmed = confirmed;
            return this;
        }

        public Order.Builder withContactEmail(String contactEmail) {
            this.contactEmail = contactEmail;
            return this;
        }

        public Order.Builder withCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Order.Builder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Order.Builder withCurrentTotalDutiesSet(Object currentTotalDutiesSet) {
            this.currentTotalDutiesSet = currentTotalDutiesSet;
            return this;
        }

        public Order.Builder withCustomer(Customer customer) {
            this.customer = customer;
            return this;
        }

        public Order.Builder withCustomerLocale(String customerLocale) {
            this.customerLocale = customerLocale;
            return this;
        }

        public Order.Builder withDeviceId(Object deviceId) {
            this.deviceId = deviceId;
            return this;
        }

        public Order.Builder withDiscountApplications(List<Object> discountApplications) {
            this.discountApplications = discountApplications;
            return this;
        }

        public Order.Builder withDiscountCodes(List<Object> discountCodes) {
            this.discountCodes = discountCodes;
            return this;
        }

        public Order.Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Order.Builder withFinancialStatus(String financialStatus) {
            this.financialStatus = financialStatus;
            return this;
        }

        public Order.Builder withFulfillmentStatus(Object fulfillmentStatus) {
            this.fulfillmentStatus = fulfillmentStatus;
            return this;
        }

        public Order.Builder withFulfillments(List<Object> fulfillments) {
            this.fulfillments = fulfillments;
            return this;
        }

        public Order.Builder withGateway(String gateway) {
            this.gateway = gateway;
            return this;
        }

        public Order.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Order.Builder withLandingSite(String landingSite) {
            this.landingSite = landingSite;
            return this;
        }

        public Order.Builder withLandingSiteRef(Object landingSiteRef) {
            this.landingSiteRef = landingSiteRef;
            return this;
        }

        public Order.Builder withLineItems(List<LineItem> lineItems) {
            this.lineItems = lineItems;
            return this;
        }

        public Order.Builder withAdditionalLineItems(List<LineItem> lineItems) {
            this.additionalLineItems = lineItems;
            return this;
        }

        public Order.Builder withLocationId(Object locationId) {
            this.locationId = locationId;
            return this;
        }

        public Order.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public Order.Builder withNote(String note) {
            this.note = note;
            return this;
        }

        public Order.Builder withNoteAttributes(List<Object> noteAttributes) {
            this.noteAttributes = noteAttributes;
            return this;
        }

        public Order.Builder withNumber(Long number) {
            this.number = number;
            return this;
        }

        public Order.Builder withOrderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        public Order.Builder withOrderStatusUrl(String orderStatusUrl) {
            this.orderStatusUrl = orderStatusUrl;
            return this;
        }

        public Order.Builder withOriginalTotalDutiesSet(Object originalTotalDutiesSet) {
            this.originalTotalDutiesSet = originalTotalDutiesSet;
            return this;
        }

        public Order.Builder withPaymentDetails(PaymentDetails paymentDetails) {
            this.paymentDetails = paymentDetails;
            return this;
        }

        public Order.Builder withPaymentGatewayNames(List<String> paymentGatewayNames) {
            this.paymentGatewayNames = paymentGatewayNames;
            return this;
        }

        public Order.Builder withPhone(Object phone) {
            this.phone = phone;
            return this;
        }

        public Order.Builder withPresentmentCurrency(String presentmentCurrency) {
            this.presentmentCurrency = presentmentCurrency;
            return this;
        }

        public Order.Builder withProcessedAt(String processedAt) {
            this.processedAt = processedAt;
            return this;
        }

        public Order.Builder withProcessingMethod(String processingMethod) {
            this.processingMethod = processingMethod;
            return this;
        }

        public Order.Builder withReference(Object reference) {
            this.reference = reference;
            return this;
        }

        public Order.Builder withReferringSite(String referringSite) {
            this.referringSite = referringSite;
            return this;
        }

        public Order.Builder withRefunds(List<Object> refunds) {
            this.refunds = refunds;
            return this;
        }

        public Order.Builder withShippingAddress(ShippingAddress shippingAddress) {
            this.shippingAddress = shippingAddress;
            return this;
        }

        public Order.Builder withShippingLines(List<ShippingLine> shippingLines) {
            this.shippingLines = shippingLines;
            return this;
        }

        public Order.Builder withOverrideShippingLine(ShippingLine shippingLine) {
            this.overrideShippingLine = shippingLine;
            return this;
        }

        public Order.Builder withSourceIdentifier(Object sourceIdentifier) {
            this.sourceIdentifier = sourceIdentifier;
            return this;
        }

        public Order.Builder withSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }

        public Order.Builder withSourceUrl(Object sourceUrl) {
            this.sourceUrl = sourceUrl;
            return this;
        }

        public Order.Builder withSubtotalPrice(String subtotalPrice) {
            this.subtotalPrice = subtotalPrice;
            return this;
        }

        public Order.Builder withSubtotalPriceSet(SubtotalPriceSet subtotalPriceSet) {
            this.subtotalPriceSet = subtotalPriceSet;
            return this;
        }

        public Order.Builder withTags(String tags) {
            this.tags = tags;
            return this;
        }

        public Order.Builder withTaxLines(List<TaxLine> taxLines) {
            this.taxLines = taxLines;
            return this;
        }

        public Order.Builder withTaxesIncluded(Boolean taxesIncluded) {
            this.taxesIncluded = taxesIncluded;
            return this;
        }

        public Order.Builder withTest(Boolean test) {
            this.test = test;
            return this;
        }

        public Order.Builder withToken(String token) {
            this.token = token;
            return this;
        }

        public Order.Builder withTotalDiscounts(String totalDiscounts) {
            this.totalDiscounts = totalDiscounts;
            return this;
        }

        public Order.Builder withTotalDiscountsSet(TotalDiscountsSet totalDiscountsSet) {
            this.totalDiscountsSet = totalDiscountsSet;
            return this;
        }

        public Order.Builder withTotalLineItemsPrice(String totalLineItemsPrice) {
            this.totalLineItemsPrice = totalLineItemsPrice;
            return this;
        }

        public Order.Builder withAdditionalTotalLineItemsPrice(String totalLineItemsPrice) {
            this.additionalSubtotal = totalLineItemsPrice;
            return this;
        }

        public Order.Builder withTotalLineItemsPriceSet(TotalLineItemsPriceSet totalLineItemsPriceSet) {
            this.totalLineItemsPriceSet = totalLineItemsPriceSet;
            return this;
        }

        public Order.Builder withTotalPrice(String totalPrice) {
            this.totalPrice = totalPrice;
            return this;
        }

        public Order.Builder withTotalPriceSet(TotalPriceSet totalPriceSet) {
            this.totalPriceSet = totalPriceSet;
            return this;
        }

        public Order.Builder withTotalPriceUsd(String totalPriceUsd) {
            this.totalPriceUsd = totalPriceUsd;
            return this;
        }

        public Order.Builder withTotalShippingPriceSet(TotalShippingPriceSet totalShippingPriceSet) {
            this.totalShippingPriceSet = totalShippingPriceSet;
            return this;
        }

        public Order.Builder withTotalTax(String totalTax) {
            this.totalTax = totalTax;
            return this;
        }

        public Order.Builder withTotalTaxSet(TotalTaxSet totalTaxSet) {
            this.totalTaxSet = totalTaxSet;
            return this;
        }

        public Order.Builder withTotalTipReceived(String totalTipReceived) {
            this.totalTipReceived = totalTipReceived;
            return this;
        }

        public Order.Builder withTotalWeight(Long totalWeight) {
            this.totalWeight = totalWeight;
            return this;
        }

        public Order.Builder withUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Order.Builder withUserId(Object userId) {
            this.userId = userId;
            return this;
        }

        public Order build() {
            Order order = new Order();
            order.adminGraphqlApiId = adminGraphqlApiId;
            order.appId = appId;
            order.billingAddress = billingAddress;
            order.browserIp = browserIp;
            order.buyerAcceptsMarketing = buyerAcceptsMarketing;
            order.cancelReason = cancelReason;
            order.cancelledAt = cancelledAt;
            order.cartToken = cartToken;
            order.checkoutId = checkoutId;
            order.checkoutToken = checkoutToken;
            order.clientDetails = clientDetails;
            order.closedAt = closedAt;
            order.confirmed = confirmed;
            order.contactEmail = contactEmail;
            order.createdAt = createdAt;
            order.currency = currency;
            order.currentTotalDutiesSet = currentTotalDutiesSet;
            order.customer = customer;
            order.customerLocale = customerLocale;
            order.deviceId = deviceId;
            order.discountApplications = discountApplications;
            order.discountCodes = discountCodes;
            order.email = email;
            order.financialStatus = financialStatus;
            order.fulfillmentStatus = fulfillmentStatus;
            order.fulfillments = fulfillments;
            order.gateway = gateway;
            order.id = id;
            order.landingSite = landingSite;
            order.landingSiteRef = landingSiteRef;
            order.lineItems = lineItems;
            order.additionalLineItems = additionalLineItems;
            order.locationId = locationId;
            order.name = name;
            order.note = note;
            order.noteAttributes = noteAttributes;
            order.number = number;
            order.orderNumber = orderNumber;
            order.orderStatusUrl = orderStatusUrl;
            order.originalTotalDutiesSet = originalTotalDutiesSet;
            order.paymentDetails = paymentDetails;
            order.paymentGatewayNames = paymentGatewayNames;
            order.phone = phone;
            order.presentmentCurrency = presentmentCurrency;
            order.processedAt = processedAt;
            order.processingMethod = processingMethod;
            order.reference = reference;
            order.referringSite = referringSite;
            order.refunds = refunds;
            order.shippingAddress = shippingAddress;
            order.shippingLines = shippingLines;
            order.overrideShippingLine = overrideShippingLine;
            order.sourceIdentifier = sourceIdentifier;
            order.sourceName = sourceName;
            order.sourceUrl = sourceUrl;
            order.subtotalPrice = subtotalPrice;
            order.subtotalPriceSet = subtotalPriceSet;
            order.tags = tags;
            order.taxLines = taxLines;
            order.taxesIncluded = taxesIncluded;
            order.test = test;
            order.token = token;
            order.totalDiscounts = totalDiscounts;
            order.totalDiscountsSet = totalDiscountsSet;
            order.totalLineItemsPrice = totalLineItemsPrice;
            order.additionalSubtotal = additionalSubtotal;
            order.totalLineItemsPriceSet = totalLineItemsPriceSet;
            order.totalPrice = totalPrice;
            order.totalPriceSet = totalPriceSet;
            order.totalPriceUsd = totalPriceUsd;
            order.totalShippingPriceSet = totalShippingPriceSet;
            order.totalTax = totalTax;
            order.totalTaxSet = totalTaxSet;
            order.totalTipReceived = totalTipReceived;
            order.totalWeight = totalWeight;
            order.updatedAt = updatedAt;
            order.userId = userId;
            return order;
        }

    }

}
