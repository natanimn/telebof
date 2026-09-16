package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;

/**
 * This object represents a venue.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Venue implements JsonFormatter {
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

}