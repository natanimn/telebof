package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * This class contains basic information about a successful payment.
 * Note that if the buyer initiates a chargeback with the relevant payment provider following this transaction, the funds may be debited from your balance.
 * This is outside of Telegram's control.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SuccessfulPayment {
    /**
     * Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars
     */
    private String currency;

    /**
     * Total refunded price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45, total_amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies)
     */
    @SerializedName("total_amount")
    private Integer totalAmount;

    /**
     * Expiration date of the subscription, in Unix time; for recurring payments only
     */
    @SerializedName("subscription_expiration_date")
    private Integer subscriptionExpirationDate;

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

    /**
     * Telegram payment identifier
     */
    @SerializedName("telegram_payment_charge_id")
    private String telegramPaymentChargeId;

    /**
     * Provider payment identifier
     */
    @SerializedName("provider_payment_charge_id")
    private String providerPaymentChargeId;

    /**
     * True, if the payment is a recurring payment for a subscription
     */
    @SerializedName("is_recurring")
    private Boolean isRecurring;

    /**
     * True, if the payment is the first payment for a subscription
     */
    @SerializedName("is_first_recurring")
    private Boolean isFirstRecurring;

    public String getCurrency() {
        return currency;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public Integer getSubscriptionExpirationDate() {
        return subscriptionExpirationDate;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public String getShippingOptionId() {
        return shippingOptionId;
    }

    public OrderInfo getOrderInfo() {
        return orderInfo;
    }

    public String getTelegramPaymentChargeId() {
        return telegramPaymentChargeId;
    }

    public String getProviderPaymentChargeId() {
        return providerPaymentChargeId;
    }

    public Boolean getIsRecurring() {
        return isRecurring;
    }

    public Boolean getIsFirstRecurring() {
        return isFirstRecurring;
    }
}