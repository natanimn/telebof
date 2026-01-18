package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents information about an order.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class OrderInfo {
    /**
     * User's name
     */
    private String name;

    /**
     * User's phone number
     */
    @SerializedName("phone_number")
    private String phoneNumber;

    /**
     * User's email
     */
    private String email;

    /**
     * User's shipping address
     */
    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }
}