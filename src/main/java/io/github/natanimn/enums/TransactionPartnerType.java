package io.github.natanimn.enums;
import com.google.gson.annotations.SerializedName;
import io.github.natanimn.types.payments.TransactionPartner;

/**
 * This enum represents one of {@link TransactionPartner} type
 * @author Natanim
 * @since 26 July 2025
 * @version 0.7
 */
public enum TransactionPartnerType {
    @SerializedName("user")
    USER,

    @SerializedName("chat")
    CHAT,

    @SerializedName("affiliate_program")
    AFFILIATE_PROGRAM,

    @SerializedName("fragment")
    FRAGMENT,

    @SerializedName("telegram_ads")
    TELEGRAM_ADS,

    @SerializedName("telegram_api")
    TELEGRAM_API,

    @SerializedName("other")
    OTHER
}
