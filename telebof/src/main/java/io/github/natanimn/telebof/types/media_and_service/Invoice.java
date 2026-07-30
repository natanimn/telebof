package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object contains basic information about an invoice.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Invoice {
    /**
     * Product name
     */
    private String title;

    /**
     * Product description
     */
    private String description;

    /**
     * Unique bot deep-linking parameter that can be used to generate this invoice
     */
    @SerializedName("start_parameter")
    private String startParameter;

    /**
     * Three-letter ISO 4217 currency code, or “XTR” for payments in Telegram Stars
     */
    private String currency;

    /**
     * Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    @SerializedName("total_amount")
    private Integer totalAmount;

}