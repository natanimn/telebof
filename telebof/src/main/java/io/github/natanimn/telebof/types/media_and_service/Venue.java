package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents a venue.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Venue {
    /**
     * Name of the venue
     */
    public String title;

    /**
     * Address of the venue
     */
    public String address;

    /**
     * Optional. Foursquare identifier of the venue
     */
    public String foursquare_id;

    /**
     * Optional. Foursquare type of the venue. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     */
    public String foursquare_type;

    /**
     * Optional. Google Places identifier of the venue
     */
    public String google_place_id;

    /**
     * Optional. Google Places type of the venue. (See <a href="https://developers.google.com/places/web-service/supported_types">supported types.</a>)
     */
    public String google_place_type;

    /**
     * Venue location. Can't be a live location
     */
    public Location location;
}
