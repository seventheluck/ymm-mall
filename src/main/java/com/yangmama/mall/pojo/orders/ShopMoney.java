
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ShopMoney {

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

        public ShopMoney.Builder withAmount(String amount) {
            this.amount = amount;
            return this;
        }

        public ShopMoney.Builder withCurrencyCode(String currencyCode) {
            this.currencyCode = currencyCode;
            return this;
        }

        public ShopMoney build() {
            ShopMoney shopMoney = new ShopMoney();
            shopMoney.amount = amount;
            shopMoney.currencyCode = currencyCode;
            return shopMoney;
        }

    }

}
