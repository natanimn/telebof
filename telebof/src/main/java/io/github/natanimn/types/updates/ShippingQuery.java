package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.payments.ShippingAddress;

import java.util.Objects;

/**
 * This class contains information about an incoming shipping query.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ShippingQuery{
    /**
     * Unique query identifier
     */
    public String id;

    /**
     * User who sent the query
     */
    public User from;

    /**
     * Bot-specified invoice payload
     */
    public String invoice_payload;

    /**
     * User specified shipping address
     */
    public ShippingAddress shipping_address;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ShippingQuery that = (ShippingQuery) object;
        return  Objects.equals(id, that.id) &&
                Objects.equals(from, that.from) &&
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
