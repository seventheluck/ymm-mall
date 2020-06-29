
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DefaultAddress {

    @Expose
    private String address1;
    @Expose
    private String address2;
    @Expose
    private String city;
    @Expose
    private Object company;
    @Expose
    private String country;
    @SerializedName("country_code")
    private String countryCode;
    @SerializedName("country_name")
    private String countryName;
    @SerializedName("customer_id")
    private Long customerId;
    @Expose
    private Boolean defaultFlag;
    @SerializedName("first_name")
    private String firstName;
    @Expose
    private Long id;
    @SerializedName("last_name")
    private String lastName;
    @Expose
    private String name;
    @Expose
    private String phone;
    @Expose
    private String province;
    @SerializedName("province_code")
    private String provinceCode;
    @Expose
    private String zip;

    public String getAddress1() {
        return address1;
    }

    public String getAddress2() {
        return address2;
    }

    public String getCity() {
        return city;
    }

    public Object getCompany() {
        return company;
    }

    public String getCountry() {
        return country;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public String getCountryName() {
        return countryName;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public Boolean getDefaultFlag() {
        return defaultFlag;
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

    public String getName() {
        return name;
    }

    public String getPhone() {
        return phone;
    }

    public String getProvince() {
        return province;
    }

    public String getProvinceCode() {
        return provinceCode;
    }

    public String getZip() {
        return zip;
    }

    public static class Builder {

        private String address1;
        private String address2;
        private String city;
        private Object company;
        private String country;
        private String countryCode;
        private String countryName;
        private Long customerId;
        private Boolean defaultFlag;
        private String firstName;
        private Long id;
        private String lastName;
        private String name;
        private String phone;
        private String province;
        private String provinceCode;
        private String zip;

        public DefaultAddress.Builder withAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public DefaultAddress.Builder withAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public DefaultAddress.Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public DefaultAddress.Builder withCompany(Object company) {
            this.company = company;
            return this;
        }

        public DefaultAddress.Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public DefaultAddress.Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public DefaultAddress.Builder withCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public DefaultAddress.Builder withCustomerId(Long customerId) {
            this.customerId = customerId;
            return this;
        }

        public DefaultAddress.Builder withDefault(Boolean defaultFlag) {
            this.defaultFlag = defaultFlag;
            return this;
        }

        public DefaultAddress.Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public DefaultAddress.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public DefaultAddress.Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public DefaultAddress.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public DefaultAddress.Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public DefaultAddress.Builder withProvince(String province) {
            this.province = province;
            return this;
        }

        public DefaultAddress.Builder withProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }

        public DefaultAddress.Builder withZip(String zip) {
            this.zip = zip;
            return this;
        }

        public DefaultAddress build() {
            DefaultAddress defaultAddress = new DefaultAddress();
            defaultAddress.address1 = address1;
            defaultAddress.address2 = address2;
            defaultAddress.city = city;
            defaultAddress.company = company;
            defaultAddress.country = country;
            defaultAddress.countryCode = countryCode;
            defaultAddress.countryName = countryName;
            defaultAddress.customerId = customerId;
            defaultAddress.defaultFlag = defaultFlag;
            defaultAddress.firstName = firstName;
            defaultAddress.id = id;
            defaultAddress.lastName = lastName;
            defaultAddress.name = name;
            defaultAddress.phone = phone;
            defaultAddress.province = province;
            defaultAddress.provinceCode = provinceCode;
            defaultAddress.zip = zip;
            return defaultAddress;
        }

    }

}
