
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TaxLine {

    @Expose
    private String price;
    @SerializedName("price_set")
    private PriceSet priceSet;
    @Expose
    private Double rate;
    @Expose
    private String title;

    public String getPrice() {
        return price;
    }

    public PriceSet getPriceSet() {
        return priceSet;
    }

    public Double getRate() {
        return rate;
    }

    public String getTitle() {
        return title;
    }

    public static class Builder {

        private String price;
        private PriceSet priceSet;
        private Double rate;
        private String title;

        public TaxLine.Builder withPrice(String price) {
            this.price = price;
            return this;
        }

        public TaxLine.Builder withPriceSet(PriceSet priceSet) {
            this.priceSet = priceSet;
            return this;
        }

        public TaxLine.Builder withRate(Double rate) {
            this.rate = rate;
            return this;
        }

        public TaxLine.Builder withTitle(String title) {
            this.title = title;
            return this;
        }

        public TaxLine build() {
            TaxLine taxLine = new TaxLine();
            taxLine.price = price;
            taxLine.priceSet = priceSet;
            taxLine.rate = rate;
            taxLine.title = title;
            return taxLine;
        }

    }

}
