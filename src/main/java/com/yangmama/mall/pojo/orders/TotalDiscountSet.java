
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TotalDiscountSet {

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

        public TotalDiscountSet.Builder withPresentmentMoney(PresentmentMoney presentmentMoney) {
            this.presentmentMoney = presentmentMoney;
            return this;
        }

        public TotalDiscountSet.Builder withShopMoney(ShopMoney shopMoney) {
            this.shopMoney = shopMoney;
            return this;
        }

        public TotalDiscountSet build() {
            TotalDiscountSet totalDiscountSet = new TotalDiscountSet();
            totalDiscountSet.presentmentMoney = presentmentMoney;
            totalDiscountSet.shopMoney = shopMoney;
            return totalDiscountSet;
        }

    }

}
