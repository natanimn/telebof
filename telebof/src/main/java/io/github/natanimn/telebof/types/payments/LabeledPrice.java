package io.github.natanimn.telebof.types.payments;

import java.io.Serializable;
import java.util.Objects;


/**
 * This object represents a portion of the price for goods or services.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class LabeledPrice implements Serializable {
    private String label;
    private Integer amount;

    /**
     *
     * @param label Portion label
     * @param amount Price of the product in the smallest units of the currency (integer, not float/double).
     *               For example, for a price of US$ 1.45 pass amount = 145. See the exp parameter in currencies.json,
     *               it shows the number of digits past the decimal point for each currency (2 for the majority of currencies).
     */
    public LabeledPrice(String label, int amount){
        this.label = label;
        this.amount = amount;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        LabeledPrice that = (LabeledPrice) object;
        return Objects.equals(label, that.label) && Objects.equals(amount, that.amount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(label, amount);
    }
}
