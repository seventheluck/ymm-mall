package com.yangmama.mall.utils;

import com.yangmama.mall.pojo.orders.LineItem;

import java.util.ArrayList;
import java.util.List;

/**
 * Line item of shopify util
 * @author peter ma
 */
public class LineItemUtil {

    public static String getProductNotes(List<LineItem> lineItems) {
        StringBuilder sb = new StringBuilder();
        for (LineItem lineItem : lineItems) {
            sb.append(lineItem.getQuantity())
                    .append(": ")
                    .append(lineItem.getName())
                    .append(";")
                    .append("\n");
        }
        return sb.toString();
    }

    public static List<LineItem> combineAllLineItems(List<LineItem> lineItems, List<LineItem> additionalLineItems) {
        if (additionalLineItems == null || additionalLineItems.size() == 0) {
            return lineItems;
        }

        List<LineItem> newLineItems = new ArrayList<>(lineItems);
        newLineItems.addAll(additionalLineItems);
        return newLineItems;
    }

    public static String getProductVariantId(long productId, long variantId) {
        return productId + "|" + variantId;
    }

    public static String getProductVariantName(String productTitle, String variantTitle) {
        return productTitle + " " + variantTitle;
    }
}
