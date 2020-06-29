
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class Customer {

    @SerializedName("accepts_marketing")
    private Boolean acceptsMarketing;
    @SerializedName("accepts_marketing_updated_at")
    private String acceptsMarketingUpdatedAt;
    @SerializedName("admin_graphql_api_id")
    private String adminGraphqlApiId;
    @SerializedName("created_at")
    private String createdAt;
    @Expose
    private String currency;
    @SerializedName("default_address")
    private DefaultAddress defaultAddress;
    @Expose
    private String email;
    @SerializedName("first_name")
    private String firstName;
    @Expose
    private Long id;
    @SerializedName("last_name")
    private String lastName;
    @SerializedName("last_order_id")
    private Long lastOrderId;
    @SerializedName("last_order_name")
    private String lastOrderName;
    @SerializedName("marketing_opt_in_level")
    private Object marketingOptInLevel;
    @SerializedName("multipass_identifier")
    private Object multipassIdentifier;
    @Expose
    private Object note;
    @SerializedName("orders_count")
    private Long ordersCount;
    @Expose
    private Object phone;
    @Expose
    private String state;
    @Expose
    private String tags;
    @SerializedName("tax_exempt")
    private Boolean taxExempt;
    @SerializedName("tax_exemptions")
    private List<Object> taxExemptions;
    @SerializedName("total_spent")
    private String totalSpent;
    @SerializedName("updated_at")
    private String updatedAt;
    @SerializedName("verified_email")
    private Boolean verifiedEmail;

    public Boolean getAcceptsMarketing() {
        return acceptsMarketing;
    }

    public String getAcceptsMarketingUpdatedAt() {
        return acceptsMarketingUpdatedAt;
    }

    public String getAdminGraphqlApiId() {
        return adminGraphqlApiId;
    }

    public String getCreatedAt() {
        return createdAt;
    }

    public String getCurrency() {
        return currency;
    }

    public DefaultAddress getDefaultAddress() {
        return defaultAddress;
    }

    public String getEmail() {
        return email;
    }

    public String getFirstName() {
        return firstName;
    }

    public Long getId() {
        return id;
    }

    public String getLastName() {
        return lastName;
    }

    public Long getLastOrderId() {
        return lastOrderId;
    }

    public String getLastOrderName() {
        return lastOrderName;
    }

    public Object getMarketingOptInLevel() {
        return marketingOptInLevel;
    }

    public Object getMultipassIdentifier() {
        return multipassIdentifier;
    }

    public Object getNote() {
        return note;
    }

    public Long getOrdersCount() {
        return ordersCount;
    }

    public Object getPhone() {
        return phone;
    }

    public String getState() {
        return state;
    }

    public String getTags() {
        return tags;
    }

    public Boolean getTaxExempt() {
        return taxExempt;
    }

    public List<Object> getTaxExemptions() {
        return taxExemptions;
    }

    public String getTotalSpent() {
        return totalSpent;
    }

    public String getUpdatedAt() {
        return updatedAt;
    }

    public Boolean getVerifiedEmail() {
        return verifiedEmail;
    }

    public static class Builder {

        private Boolean acceptsMarketing;
        private String acceptsMarketingUpdatedAt;
        private String adminGraphqlApiId;
        private String createdAt;
        private String currency;
        private DefaultAddress defaultAddress;
        private String email;
        private String firstName;
        private Long id;
        private String lastName;
        private Long lastOrderId;
        private String lastOrderName;
        private Object marketingOptInLevel;
        private Object multipassIdentifier;
        private Object note;
        private Long ordersCount;
        private Object phone;
        private String state;
        private String tags;
        private Boolean taxExempt;
        private List<Object> taxExemptions;
        private String totalSpent;
        private String updatedAt;
        private Boolean verifiedEmail;

        public Customer.Builder withAcceptsMarketing(Boolean acceptsMarketing) {
            this.acceptsMarketing = acceptsMarketing;
            return this;
        }

        public Customer.Builder withAcceptsMarketingUpdatedAt(String acceptsMarketingUpdatedAt) {
            this.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
            return this;
        }

        public Customer.Builder withAdminGraphqlApiId(String adminGraphqlApiId) {
            this.adminGraphqlApiId = adminGraphqlApiId;
            return this;
        }

        public Customer.Builder withCreatedAt(String createdAt) {
            this.createdAt = createdAt;
            return this;
        }

        public Customer.Builder withCurrency(String currency) {
            this.currency = currency;
            return this;
        }

        public Customer.Builder withDefaultAddress(DefaultAddress defaultAddress) {
            this.defaultAddress = defaultAddress;
            return this;
        }

        public Customer.Builder withEmail(String email) {
            this.email = email;
            return this;
        }

        public Customer.Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Customer.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public Customer.Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Customer.Builder withLastOrderId(Long lastOrderId) {
            this.lastOrderId = lastOrderId;
            return this;
        }

        public Customer.Builder withLastOrderName(String lastOrderName) {
            this.lastOrderName = lastOrderName;
            return this;
        }

        public Customer.Builder withMarketingOptInLevel(Object marketingOptInLevel) {
            this.marketingOptInLevel = marketingOptInLevel;
            return this;
        }

        public Customer.Builder withMultipassIdentifier(Object multipassIdentifier) {
            this.multipassIdentifier = multipassIdentifier;
            return this;
        }

        public Customer.Builder withNote(Object note) {
            this.note = note;
            return this;
        }

        public Customer.Builder withOrdersCount(Long ordersCount) {
            this.ordersCount = ordersCount;
            return this;
        }

        public Customer.Builder withPhone(Object phone) {
            this.phone = phone;
            return this;
        }

        public Customer.Builder withState(String state) {
            this.state = state;
            return this;
        }

        public Customer.Builder withTags(String tags) {
            this.tags = tags;
            return this;
        }

        public Customer.Builder withTaxExempt(Boolean taxExempt) {
            this.taxExempt = taxExempt;
            return this;
        }

        public Customer.Builder withTaxExemptions(List<Object> taxExemptions) {
            this.taxExemptions = taxExemptions;
            return this;
        }

        public Customer.Builder withTotalSpent(String totalSpent) {
            this.totalSpent = totalSpent;
            return this;
        }

        public Customer.Builder withUpdatedAt(String updatedAt) {
            this.updatedAt = updatedAt;
            return this;
        }

        public Customer.Builder withVerifiedEmail(Boolean verifiedEmail) {
            this.verifiedEmail = verifiedEmail;
            return this;
        }

        public Customer build() {
            Customer customer = new Customer();
            customer.acceptsMarketing = acceptsMarketing;
            customer.acceptsMarketingUpdatedAt = acceptsMarketingUpdatedAt;
            customer.adminGraphqlApiId = adminGraphqlApiId;
            customer.createdAt = createdAt;
            customer.currency = currency;
            customer.defaultAddress = defaultAddress;
            customer.email = email;
            customer.firstName = firstName;
            customer.id = id;
            customer.lastName = lastName;
            customer.lastOrderId = lastOrderId;
            customer.lastOrderName = lastOrderName;
            customer.marketingOptInLevel = marketingOptInLevel;
            customer.multipassIdentifier = multipassIdentifier;
            customer.note = note;
            customer.ordersCount = ordersCount;
            customer.phone = phone;
            customer.state = state;
            customer.tags = tags;
            customer.taxExempt = taxExempt;
            customer.taxExemptions = taxExemptions;
            customer.totalSpent = totalSpent;
            customer.updatedAt = updatedAt;
            customer.verifiedEmail = verifiedEmail;
            return customer;
        }

    }

}
