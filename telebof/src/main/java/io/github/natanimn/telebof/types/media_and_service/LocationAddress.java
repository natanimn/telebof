package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * Describes the physical address of a location.
 * @param countryCode The two-letter ISO 3166-1 alpha-2 country code of the country where the location is located
 * @param state Optional. State of the location
 * @param city Optional. City of the location
 * @param street Optional. Street address of the location
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record LocationAddress(
        @SerializedName("country_code") String countryCode,
        String state,
        String city,
        String street
) implements Serializable {

    /**
     * Creates a new LocationAddress builder
     * @param countryCode The two-letter ISO 3166-1 alpha-2 country code of the country where the location is located
     */
    public static LocationAddressBuilder builder(String countryCode) {
        return new LocationAddressBuilder(countryCode);
    }

    /**
     * Builder class for LocationAddress
     */
    public static class LocationAddressBuilder {
        private final String countryCode;
        private String state;
        private String city;
        private String street;

        public LocationAddressBuilder(String countryCode) {
            this.countryCode = countryCode;
        }

        public LocationAddressBuilder state(String state) {
            this.state = state;
            return this;
        }

        public LocationAddressBuilder city(String city) {
            this.city = city;
            return this;
        }

        public LocationAddressBuilder street(String street) {
            this.street = street;
            return this;
        }

        public LocationAddress build() {
            return new LocationAddress(
                    countryCode,
                    state,
                    city,
                    street
            );
        }
    }
}