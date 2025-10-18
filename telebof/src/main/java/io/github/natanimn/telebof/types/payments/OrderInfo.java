package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;

/**
 * This class represents information about an order.
 * @param name User's name
 * @param phoneNumber User's phone number
 * @param email User's email
 * @param shippingAddress User's shipping address
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record OrderInfo(
        String name,
        @SerializedName("phone_number") String phoneNumber,
        String email,
        @SerializedName("shipping_address") ShippingAddress shippingAddress
) {}