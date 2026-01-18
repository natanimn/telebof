package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a venue message to be sent as the result of an inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputVenueMessageContent {
    private Double latitude;
    private Double longitude;
    private String title;
    private String address;

    @SerializedName("foursquare_id")
    private String foursquareId;

    @SerializedName("foursquare_type")
    private String foursquareType;

    @SerializedName("google_place_id")
    private String googlePlaceId;

    @SerializedName("google_place_type")
    private String googlePlaceType;

    /**
     * Required
     * @param latitude Latitude of the venue in degrees
     * @param longitude Longitude of the venue in degrees
     * @param title Name of the venue
     * @param address Address of the venue
     */
    public InputVenueMessageContent(Double latitude, Double longitude, String title, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    /**
     * Optional.
     * @param foursquareId Foursquare identifier of the venue, if known
     */
    public InputVenueMessageContent setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    /**
     * Optional.
     * @param foursquareType Foursquare type of the venue, if known. (For example, "arts_entertainment/default", "arts_entertainment/aquarium" or "food/icecream".)
     */
    public InputVenueMessageContent setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }

    /**
     * Optional.
     * @param googlePlaceId Google Places identifier of the venue
     */
    public InputVenueMessageContent setGooglePlaceId(String googlePlaceId) {
        this.googlePlaceId = googlePlaceId;
        return this;
    }

    /**
     * Optional.
     * @param googlePlaceType Google Places type of the venue.
     */
    public InputVenueMessageContent setGooglePlaceType(String googlePlaceType) {
        this.googlePlaceType = googlePlaceType;
        return this;
    }
}