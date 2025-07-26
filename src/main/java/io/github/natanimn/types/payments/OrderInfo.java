package io.github.natanimn.types.payments;

import java.io.Serializable;
import java.util.Objects;

/**
 * This class represents information about an order.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.7
 */
public class OrderInfo implements Serializable {
    /**
     * User's name
     */
    public String name;

    /**
     * User's phone number
     */
    public String phone_number;

    /**
     * User's email
     */
    public String email;

    /**
     * User's shipping address
     */
    public ShippingAddress shipping_address;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        OrderInfo orderInfo = (OrderInfo) object;
        return  Objects.equals(name, orderInfo.name) &&
                Objects.equals(phone_number, orderInfo.phone_number) &&
                Objects.equals(email, orderInfo.email) &&
                Objects.equals(shipping_address, orderInfo.shipping_address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone_number, email, shipping_address);
    }
}
