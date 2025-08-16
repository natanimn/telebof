package io.github.natanimn.telebof.types.payments;

import java.io.Serializable;
import java.util.Objects;

/**
 * This class represents a shipping address.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ShippingAddress implements Serializable {
    /**
     * Two-letter <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a> country code
     */
    public String country_code;

    /**
     * State, if applicable
     */
    public String state;

    /**
     * City
     */
    public String city;

    /**
     * First line for the address
     */
    public String street_line1;

    /**
     * Second line for the address
     */
    public String street_line2;

    /**
     * Address of post code
     */
    public String post_code;

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
