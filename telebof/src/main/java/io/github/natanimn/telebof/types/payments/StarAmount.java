package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * Describes an amount of Telegram Stars.
 * @param amount Integer amount of Telegram Stars, rounded to 0; can be negative
 * @param nanostarAmount Optional. The number of 1/1000000000 shares of Telegram Stars; from -999999999 to 999999999; can be negative if and only if amount is non-positive
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StarAmount(
        Integer amount,
        @SerializedName("nanostar_amount") Integer nanostarAmount
) {}
