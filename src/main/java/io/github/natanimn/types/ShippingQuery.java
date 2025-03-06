package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class ShippingQuery implements Serializable {
    public String id;
    public User from;
    public String invoice_payload;
    public ShippingAddress shipping_address;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ShippingQuery that = (ShippingQuery) object;
        return Objects.equals(id, that.id) && Objects.equals(from, that.from) &&
                Objects.equals(invoice_payload, that.invoice_payload) &&
                Objects.equals(shipping_address, that.shipping_address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, from, invoice_payload, shipping_address);
    }

    @Override
    public String toString() {
        return "ShippingQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", invoice_payload='" + invoice_payload + '\'' +
                ", shipping_address=" + shipping_address +
                '}';
    }
}
