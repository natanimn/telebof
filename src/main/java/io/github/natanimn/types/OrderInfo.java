package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class OrderInfo implements Serializable {
    public String name, phone_number, email;
    public ShippingAddress shipping_address;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        OrderInfo orderInfo = (OrderInfo) object;
        return Objects.equals(name, orderInfo.name) && Objects.equals(phone_number, orderInfo.phone_number) &&
                Objects.equals(email, orderInfo.email) && Objects.equals(shipping_address, orderInfo.shipping_address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone_number, email, shipping_address);
    }
}
