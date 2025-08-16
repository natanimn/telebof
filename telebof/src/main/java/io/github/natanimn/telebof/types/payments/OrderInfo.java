package io.github.natanimn.telebof.types.payments;

/**
 * This class represents information about an order.
 * @author Natanim Negash
 * @since 3 March 2025
 * @version 0.7
 */
public class OrderInfo {
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

}
