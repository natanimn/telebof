package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object contains basic information about an invoice.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Invoice {
    /**
     * Product name
     */
    public String title;

    /**
     * Product description
     */
    public String description;

    /**
     * Unique bot deep-linking parameter that can be used to generate this invoice
     */
    public String start_parameter;

    /**
     * Three-letter ISO 4217 <a href="https://core.telegram.org/bots/payments#supported-currencies">currency code</a>, or “XTR” for payments in Telegram Stars
     */
    public String currency;

    /**
     * Total price in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145.
     *  See the exp parameter in <a href="https://core.telegram.org/bots/payments/currencies.json">currencies.json</a>, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    public Integer total_amount;
}
