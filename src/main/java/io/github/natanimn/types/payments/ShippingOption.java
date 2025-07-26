package io.github.natanimn.types.payments;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ShippingOption implements Serializable {
    private String id, title;
    private List<LabeledPrice> prices;

    public ShippingOption(String id, String title, List<LabeledPrice> prices){
        this.id = id;
        this.title = title;
        this.prices = prices;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ShippingOption that = (ShippingOption) object;
        return Objects.equals(id, that.id) && Objects.equals(title, that.title) && Objects.equals(prices, that.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, prices);
    }
}
