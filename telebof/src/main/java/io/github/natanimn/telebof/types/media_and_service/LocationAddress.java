package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Describes the physical address of a location.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
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

    public String getCountryCode() {
        return countryCode;
    }

    public LocationAddress setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }

    public String getState() {
        return state;
    }

    public LocationAddress setState(String state) {
        this.state = state;
        return this;
    }

    public String getCity() {
        return city;
    }

    public LocationAddress setCity(String city) {
        this.city = city;
        return this;
    }

    public String getStreet() {
        return street;
    }

    public LocationAddress setStreet(String street) {
        this.street = street;
        return this;
    }
}