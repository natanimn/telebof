package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * This class contains basic information about a refunded payment.
 * @param currency Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars. Currently, always “XTR”
 * @param totalAmount Total refunded price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45, total_amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies)
 * @param invoicePayload Bot-specified invoice payload
 * @param telegramPaymentChargeId Telegram payment identifier
 * @param providerPaymentChargeId Provider payment identifier
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record RefundedPayment(
        String currency,
        @SerializedName("total_amount") Integer totalAmount,
        @SerializedName("invoice_payload") String invoicePayload,
        @SerializedName("telegram_payment_charge_id") String telegramPaymentChargeId,
        @SerializedName("provider_payment_charge_id") String providerPaymentChargeId
) {}