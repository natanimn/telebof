package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This class represents a shipping address.
 * @param countryCode Two-letter ISO 3166-1 alpha-2 country code
 * @param state State, if applicable
 * @param city City
 * @param streetLine1 First line for the address
 * @param streetLine2 Second line for the address
 * @param postCode Address of post code
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ShippingAddress(
        @SerializedName("country_code") String countryCode,
        String state,
        String city,
        @SerializedName("street_line1") String streetLine1,
        @SerializedName("street_line2") String streetLine2,
        @SerializedName("post_code") String postCode
) implements Serializable {}