package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.payments.OrderInfo;
import lombok.Getter;

/**
 * This class contains information about an incoming pre-checkout query.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class PreCheckoutQuery implements TelegramUpdate, JsonFormatter {
    /**
     * Unique query identifier
     */
    private String id;

    /**
     * User who sent the query
     */
    private User from;

    /**
     * Three-letter ISO 4217 currency code, or "XTR" for payments in Telegram Stars
     */
    private String currency;

    /**
     * Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    @SerializedName("total_amount")
    private Integer totalAmount;

    /**
     * Bot-specified invoice payload
     */
    @SerializedName("invoice_payload")
    private String invoicePayload;

    /**
     * Identifier of the shipping option chosen by the user
     */
    @SerializedName("shipping_option_id")
    private String shippingOptionId;

    /**
     * Order information provided by the user
     */
    @SerializedName("order_info")
    private OrderInfo orderInfo;
}