
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class OriginLocation {

    @Expose
    private String address1;
    @Expose
    private String address2;
    @Expose
    private String city;
    @SerializedName("country_code")
    private String countryCode;
    @Expose
    private Long id;
    @Expose
    private String name;
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

    public String getCountryCode() {
        return countryCode;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
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
        private String countryCode;
        private Long id;
        private String name;
        private String provinceCode;
        private String zip;

        public OriginLocation.Builder withAddress1(String address1) {
            this.address1 = address1;
            return this;
        }

        public OriginLocation.Builder withAddress2(String address2) {
            this.address2 = address2;
            return this;
        }

        public OriginLocation.Builder withCity(String city) {
            this.city = city;
            return this;
        }

        public OriginLocation.Builder withCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }

        public OriginLocation.Builder withId(Long id) {
            this.id = id;
            return this;
        }

        public OriginLocation.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public OriginLocation.Builder withProvinceCode(String provinceCode) {
            this.provinceCode = provinceCode;
            return this;
        }

        public OriginLocation.Builder withZip(String zip) {
            this.zip = zip;
            return this;
        }

        public OriginLocation build() {
            OriginLocation originLocation = new OriginLocation();
            originLocation.address1 = address1;
            originLocation.address2 = address2;
            originLocation.city = city;
            originLocation.countryCode = countryCode;
            originLocation.id = id;
            originLocation.name = name;
            originLocation.provinceCode = provinceCode;
            originLocation.zip = zip;
            return originLocation;
        }

    }

}
