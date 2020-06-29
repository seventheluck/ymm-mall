
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class DiscountedPriceSet {

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

        public DiscountedPriceSet.Builder withPresentmentMoney(PresentmentMoney presentmentMoney) {
            this.presentmentMoney = presentmentMoney;
            return this;
        }

        public DiscountedPriceSet.Builder withShopMoney(ShopMoney shopMoney) {
            this.shopMoney = shopMoney;
            return this;
        }

        public DiscountedPriceSet build() {
            DiscountedPriceSet discountedPriceSet = new DiscountedPriceSet();
            discountedPriceSet.presentmentMoney = presentmentMoney;
            discountedPriceSet.shopMoney = shopMoney;
            return discountedPriceSet;
        }

    }

}
