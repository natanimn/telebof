package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a venue.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Venue {
    /**
     * Name of the venue
     */
    private String title;

    /**
     * Address of the venue
     */
    private String address;

    /**
     * Optional. Foursquare identifier of the venue
     */
    @SerializedName("foursquare_id")
    private String foursquareId;

    /**
     * Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    @SerializedName("foursquare_type")
    private String foursquareType;

    /**
     * Optional. Google Places identifier of the venue
     */
    @SerializedName("google_place_id")
    private String googlePlaceId;

    /**
     * Optional. Google Places type of the venue. (See supported types.)
     */
    @SerializedName("google_place_type")
    private String googlePlaceType;

    /**
     * Venue location. Can't be a live location
     */
    private Location location;

    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public String getFoursquareId() {
        return foursquareId;
    }

    public String getFoursquareType() {
        return foursquareType;
    }

    public String getGooglePlaceId() {
        return googlePlaceId;
    }

    public String getGooglePlaceType() {
        return googlePlaceType;
    }

    public Location getLocation() {
        return location;
    }
}