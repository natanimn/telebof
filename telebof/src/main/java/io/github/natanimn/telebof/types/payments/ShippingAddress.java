package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;

import java.io.Serializable;

/**
 * This class represents a shipping address.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ShippingAddress implements Serializable, JsonFormatter {
    /**
     * Two-letter ISO 3166-1 alpha-2 country code
     */
    @SerializedName("country_code")
    private String countryCode;

    /**
     * State, if applicable
     */
    private String state;

    /**
     * City
     */
    private String city;

    /**
     * First line for the address
     */
    @SerializedName("street_line1")
    private String streetLine1;

    /**
     * Second line for the address
     */
    @SerializedName("street_line2")
    private String streetLine2;

    /**
     * Address of post code
     */
    @SerializedName("post_code")
    private String postCode;

    public ShippingAddress(){}

    public ShippingAddress(String countryCode, String state, String city, String streetLine1, String streetLine2, String postCode) {
        this.countryCode = countryCode;
        this.state = state;
        this.city = city;
        this.streetLine1 = streetLine1;
        this.streetLine2 = streetLine2;
        this.postCode = postCode;
    }

}