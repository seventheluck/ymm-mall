
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class BillingAddress {

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
    @SerializedName("first_name")
    private String firstName;
    @SerializedName("last_name")
    private String lastName;
    @Expose
    private Double latitude;
    @Expose
    private Double longitude;
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

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
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
        private String firstName;
        private String lastName;
        private Double latitude;
        private Double longitude;
        private String name;
        private String phone;
        private String province;
        private String provinceCode;
        private String zip;

        public BillingAddress.Builder withAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public BillingAddress.Builder withAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public BillingAddress.Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public BillingAddress.Builder withCompany(Object company) {
            this.company = company;
            return this;
        }

        public BillingAddress.Builder withCountry(String country) {
            this.country = country;
            return this;
        }

        public BillingAddress.Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public BillingAddress.Builder withFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public BillingAddress.Builder withLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public BillingAddress.Builder withLatitude(Double latitude) {
            this.latitude = latitude;
            return this;
        }

        public BillingAddress.Builder withLongitude(Double longitude) {
            this.longitude = longitude;
            return this;
        }

        public BillingAddress.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public BillingAddress.Builder withPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public BillingAddress.Builder withProvince(String province) {
            this.province = province;
            return this;
        }

        public BillingAddress.Builder withProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }

        public BillingAddress.Builder withZip(String zip) {
            this.zip = zip;
            return this;
        }

        public BillingAddress build() {
            BillingAddress billingAddress = new BillingAddress();
            billingAddress.address1 = address1;
            billingAddress.address2 = address2;
            billingAddress.city = city;
            billingAddress.company = company;
            billingAddress.country = country;
            billingAddress.countryCode = countryCode;
            billingAddress.firstName = firstName;
            billingAddress.lastName = lastName;
            billingAddress.latitude = latitude;
            billingAddress.longitude = longitude;
            billingAddress.name = name;
            billingAddress.phone = phone;
            billingAddress.province = province;
            billingAddress.provinceCode = provinceCode;
            billingAddress.zip = zip;
            return billingAddress;
        }

    }

}
