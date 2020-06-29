
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class TotalLineItemsPriceSet {

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

        public TotalLineItemsPriceSet.Builder withPresentmentMoney(PresentmentMoney presentmentMoney) {
            this.presentmentMoney = presentmentMoney;
            return this;
        }

        public TotalLineItemsPriceSet.Builder withShopMoney(ShopMoney shopMoney) {
            this.shopMoney = shopMoney;
            return this;
        }

        public TotalLineItemsPriceSet build() {
            TotalLineItemsPriceSet totalLineItemsPriceSet = new TotalLineItemsPriceSet();
            totalLineItemsPriceSet.presentmentMoney = presentmentMoney;
            totalLineItemsPriceSet.shopMoney = shopMoney;
            return totalLineItemsPriceSet;
        }

    }

}
