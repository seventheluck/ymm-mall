
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PresentmentMoney {

    @Expose
    private String amount;
    @SerializedName("currency_code")
    private String currencyCode;

    public String getAmount() {
        return amount;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public static class Builder {

        private String amount;
        private String currencyCode;

        public PresentmentMoney.Builder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public PresentmentMoney.Builder withCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public PresentmentMoney build() {
            PresentmentMoney presentmentMoney = new PresentmentMoney();
            presentmentMoney.amount = amount;
            presentmentMoney.currencyCode = currencyCode;
            return presentmentMoney;
        }

    }

}
