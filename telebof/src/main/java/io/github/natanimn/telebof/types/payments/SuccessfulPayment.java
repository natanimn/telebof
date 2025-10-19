package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * This class contains basic information about a successful payment.
 * Note that if the buyer initiates a chargeback with the relevant payment provider following this transaction, the funds may be debited from your balance.
 * This is outside of Telegram's control.
 * @param currency Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars
 * @param totalAmount Total refunded price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45, total_amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies)
 * @param subscriptionExpirationDate Expiration date of the subscription, in Unix time; for recurring payments only
 * @param invoicePayload Bot-specified invoice payload
 * @param shippingOptionId Identifier of the shipping option chosen by the user
 * @param orderInfo Order information provided by the user
 * @param telegramPaymentChargeId Telegram payment identifier
 * @param providerPaymentChargeId Provider payment identifier
 * @param isRecurring True, if the payment is a recurring payment for a subscription
 * @param isFirstRecurring True, if the payment is the first payment for a subscription
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record SuccessfulPayment(
        String currency,
        @SerializedName("total_amount") Integer totalAmount,
        @SerializedName("subscription_expiration_date") Integer subscriptionExpirationDate,
        @SerializedName("invoice_payload") String invoicePayload,
        @SerializedName("shipping_option_id") String shippingOptionId,
        @SerializedName("order_info") OrderInfo orderInfo,
        @SerializedName("telegram_payment_charge_id") String telegramPaymentChargeId,
        @SerializedName("provider_payment_charge_id") String providerPaymentChargeId,
        @SerializedName("is_recurring") Boolean isRecurring,
        @SerializedName("is_first_recurring") Boolean isFirstRecurring
) {}