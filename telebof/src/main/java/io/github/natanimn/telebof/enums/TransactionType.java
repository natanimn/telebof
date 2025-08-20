package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes field {@link io.github.natanimn.telebof.types.payments.TransactionPartner#transaction_type}
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public enum TransactionType {
    @SerializedName("invoice_payment")
    INVOICE_PAYMENT,

    @SerializedName("paid_media_payment")
    PAID_MEDIA_PAYMENT,

    @SerializedName("gift_purchase")
    GIFT_PURCHASE,

    @SerializedName("premium_purchase")
    PREMIUM_PURCHASE,

    @SerializedName("business_account_transfer")
    BUSINESS_ACCOUNT_TRANSFER
}
