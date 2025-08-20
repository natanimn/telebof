package io.github.natanimn.telebof.types.media_and_service;

import java.io.Serializable;

/**
 * Describes the physical address of a location.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class LocationAddress implements Serializable {
    private String country_code, state, city, street;

    /**
     * Required
     * @param country_code The two-letter ISO 3166-1 alpha-2 country code of the country where the location is located
     */
    public LocationAddress(String country_code){
        this.country_code = country_code;
    }

    /**
     * Optional
     * @param state State of the location
     * @return {@link LocationAddress}
     */
    public LocationAddress state(String state){
        this.state = state;
        return this;
    }

    /**
     * Optional
     * @param city City of the location
     * @return {@link LocationAddress}
     */
    public LocationAddress city(String city){
        this.city = city;
        return this;
    }

    /**
     * Optional
     * @param street Street address of the location
     * @return {@link LocationAddress}
     */
    public LocationAddress street(String street){
        this.street = street;
        return this;
    }

}
