package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ShippingAddress implements Serializable {
    public String country_code, state, city, street_line1, street_line2, post_code;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ShippingAddress that = (ShippingAddress) object;
        return Objects.equals(country_code, that.country_code) && Objects.equals(state, that.state) &&
                Objects.equals(city, that.city) && Objects.equals(street_line1, that.street_line1) &&
                Objects.equals(street_line2, that.street_line2) && Objects.equals(post_code, that.post_code);
    }

    @Override
    public int hashCode() {
        return Objects.hash(country_code, state, city, street_line1, street_line2, post_code);
    }
}
