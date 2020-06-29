package com.yangmama.mall.pojo.request;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * ids
 * Retrieve only orders specified by a comma-separated list of order IDs.
 *
 * limit
 * The maximum number of results to show on a page.
 *
 * (default: 50, maximum: 250)
 * since_id
 * Show orders after the specified ID.
 *
 * created_at_min
 * Show orders created at or after date (format: 2014-04-25T16:15:47-04:00).
 *
 * created_at_max
 * Show orders created at or before date (format: 2014-04-25T16:15:47-04:00).
 *
 * updated_at_min
 * Show orders last updated at or after date (format: 2014-04-25T16:15:47-04:00).
 *
 * updated_at_max
 * Show orders last updated at or before date (format: 2014-04-25T16:15:47-04:00).
 *
 * processed_at_min
 * Show orders imported at or after date (format: 2014-04-25T16:15:47-04:00).
 *
 * processed_at_max
 * Show orders imported at or before date (format: 2014-04-25T16:15:47-04:00).
 *
 * attribution_app_id
 * Show orders attributed to a certain app, specified by the app ID. Set as current to show orders for the app currently consuming the API.
 *
 * status
 * Filter orders by their status.
 *
 * (default: open)
 * open: Show only open orders.
 * closed: Show only closed orders.
 * cancelled: Show only canceled orders.
 * any: Show orders of any status, including archived orders.
 * financial_status
 * Filter orders by their financial status.
 *
 * (default: any)
 * authorized: Show only authorized orders
 * pending: Show only pending orders
 * paid: Show only paid orders
 * partially_paid: Show only partially paid orders
 * refunded: Show only refunded orders
 * voided: Show only voided orders
 * partially_refunded: Show only partially refunded orders
 * any: Show orders of any financial status.
 * unpaid: Show authorized and partially paid orders.
 * fulfillment_status
 * Filter orders by their fulfillment status.
 *
 * (default: any)
 * shipped: Show orders that have been shipped. Returns orders with fulfillment_status of fulfilled.
 * partial: Show partially shipped orders.
 * unshipped: Show orders that have not yet been shipped. Returns orders with fulfillment_status of null.
 * any: Show orders of any fulfillment status.
 * unfulfilled: Returns orders with fulfillment_status of null or partial.
 * fields
 * Retrieve only certain fields, specified by a comma-separated list of fields names.
 */
@Data
@Builder
public class OrderRequestParameter {

    private List<String> ids;
    private String limit;
    private String sinceId;
    private String createdAtmMin;
    private String createdAtMax;
    private String updatedAtMin;
    private String updatedAtMax;
    private String processedAtMin;
    private String processedAtMax;
    private String attributionAppId;
    private String status;
    private String financialStatus;
    private String fulfillmentStatus;
    private String fields;
}
