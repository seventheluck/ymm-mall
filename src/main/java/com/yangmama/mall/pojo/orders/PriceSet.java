
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PriceSet {

    @SerializedName("presentment_money")
    private PresentmentMoney presentmentMoney;
    @SerializedName("shop_money")
    private ShopMoney shopMoney;

    public PresentmentMoney getPresentmentMoney() {
        return presentmentMoney;
    }

    public ShopMoney getShopMoney() {
        return shopMoney;
    }

    public static class Builder {

        private PresentmentMoney presentmentMoney;
        private ShopMoney shopMoney;

        public PriceSet.Builder withPresentmentMoney(PresentmentMoney presentmentMoney) {
            this.presentmentMoney = presentmentMoney;
            return this;
        }

        public PriceSet.Builder withShopMoney(ShopMoney shopMoney) {
            this.shopMoney = shopMoney;
            return this;
        }

        public PriceSet build() {
            PriceSet priceSet = new PriceSet();
            priceSet.presentmentMoney = presentmentMoney;
            priceSet.shopMoney = shopMoney;
            return priceSet;
        }

    }

}
