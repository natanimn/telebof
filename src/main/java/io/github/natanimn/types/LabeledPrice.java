package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;


/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
