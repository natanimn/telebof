package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;


/**
 * Natanim Negash 
 *  3 March 2025
 */
public class LabeledPrice implements Serializable {
    private String label;
    private Integer amount;

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
