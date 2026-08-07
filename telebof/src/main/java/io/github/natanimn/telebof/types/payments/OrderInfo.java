package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This class represents information about an order.
 * @author Natanim
 * @since 0.1
 * @version 1.3.0
 */
@Getter
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

}