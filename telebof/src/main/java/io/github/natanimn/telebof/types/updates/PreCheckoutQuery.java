package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.payments.OrderInfo;
import com.google.gson.annotations.SerializedName;

/**
 * This class contains information about an incoming pre-checkout query.
 * @param id Unique query identifier
 * @param from User who sent the query
 * @param currency Three-letter ISO 4217 currency code, or "XTR" for payments in Telegram Stars
 * @param totalAmount Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
 * @param invoicePayload Bot-specified invoice payload
 * @param shippingOptionId Identifier of the shipping option chosen by the user
 * @param orderInfo Order information provided by the user
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PreCheckoutQuery(
        String id,
        User from,
        String currency,
        @SerializedName("total_amount") Integer totalAmount,
        @SerializedName("invoice_payload") String invoicePayload,
        @SerializedName("shipping_option_id") String shippingOptionId,
        @SerializedName("order_info") OrderInfo orderInfo
) implements TelegramUpdate {}