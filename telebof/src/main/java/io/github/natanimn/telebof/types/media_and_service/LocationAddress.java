package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * Describes the physical address of a location.
 * @author Natanim
 * @since 19 August 2025
 */
@Getter
@Setter
@Accessors(chain = true)
public class LocationAddress implements Serializable {
    /**
     * The two-letter ISO 3166-1 alpha-2 country code of the country where the location is located
     */
    @SerializedName("country_code")
    private String countryCode;

    /**
     * Optional. State of the location
     */
    private String state;

    /**
     * Optional. City of the location
     */
    private String city;

    /**
     * Optional. Street address of the location
     */
    private String street;
}