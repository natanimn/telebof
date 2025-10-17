package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a venue.
 * @param title Name of the venue
 * @param address Address of the venue
 * @param foursquareId Optional. Foursquare identifier of the venue
 * @param foursquareType Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
 * @param googlePlaceId Optional. Google Places identifier of the venue
 * @param googlePlaceType Optional. Google Places type of the venue. (See supported types.)
 * @param location Venue location. Can't be a live location
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Venue(
        String title,
        String address,
        @SerializedName("foursquare_id") String foursquareId,
        @SerializedName("foursquare_type") String foursquareType,
        @SerializedName("google_place_id") String googlePlaceId,
        @SerializedName("google_place_type") String googlePlaceType,
        Location location
) {}