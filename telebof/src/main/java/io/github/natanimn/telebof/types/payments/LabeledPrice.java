package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.io.Serializable;

/**
 * This object represents a portion of the price for goods or services.
 * @author Natanim
 * @since 0.1
 */
@Getter
@RequiredArgsConstructor
public class LabeledPrice implements Serializable, JsonFormatter {
    /**
     * Portion label
     */
    private final String label;

    /**
     * Price of the product in the smallest units of the currency (integer, not float/double). For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json, it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    private final Integer amount;
}