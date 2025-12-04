package io.github.natanimn.telebof.types.payments;

import java.io.Serializable;

/**
 * This object represents a portion of the price for goods or services.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class LabeledPrice implements Serializable {
    /**
     * Portion label
     */
    private final String label;

    /**
     * Price of the product in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    private final Integer amount;

    public LabeledPrice(String label, Integer amount) {
        this.label = label;
        this.amount = amount;
    }

    public String getLabel() {
        return label;
    }

    public Integer getAmount() {
        return amount;
    }
}