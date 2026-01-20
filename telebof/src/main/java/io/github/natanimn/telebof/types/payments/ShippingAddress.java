package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This class represents a shipping address.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ShippingAddress implements Serializable {
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

    public String getCountryCode() {
        return countryCode;
    }

    public String getState() {
        return state;
    }

    public String getCity() {
        return city;
    }

    public String getStreetLine1() {
        return streetLine1;
    }

    public String getStreetLine2() {
        return streetLine2;
    }

    public String getPostCode() {
        return postCode;
    }
}