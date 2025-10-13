package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object contains basic information about an invoice.
 * @param title Product name
 * @param description Product description
 * @param startParameter Unique bot deep-linking parameter that can be used to generate this invoice
 * @param currency Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars
 * @param totalAmount Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Invoice(
        String title,
        String description,
        @SerializedName("start_parameter") String startParameter,
        String currency,
        @SerializedName("total_amount") Integer totalAmount
) {}