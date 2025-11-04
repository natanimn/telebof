package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a venue message to be sent as the result of an inline query.
 * @param latitude Latitude of the venue in degrees
 * @param longitude Longitude of the venue in degrees
 * @param title Name of the venue
 * @param address Address of the venue
 * @param foursquareId Optional. Foursquare identifier of the venue, if known
 * @param foursquareType Optional. Foursquare type of the venue, if known. (For example, "arts_entertainment/default", "arts_entertainment/aquarium" or "food/icecream".)
 * @param googlePlaceId Optional. Google Places identifier of the venue
 * @param googlePlaceType Optional. Google Places type of the venue.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputVenueMessageContent(
        Double latitude,
        Double longitude,
        String title,
        String address,
        @SerializedName("foursquare_id") String foursquareId,
        @SerializedName("foursquare_type") String foursquareType,
        @SerializedName("google_place_id") String googlePlaceId,
        @SerializedName("google_place_type") String googlePlaceType
) implements InputMessageContent {

    /**
     * Creates a new InputVenueMessageContent builder
     * @param latitude Latitude of the venue in degrees
     * @param longitude Longitude of the venue in degrees
     * @param title Name of the venue
     * @param address Address of the venue
     */
    public static InputVenueMessageContentBuilder builder(double latitude, double longitude, String title, String address) {
        return new InputVenueMessageContentBuilder(latitude, longitude, title, address);
    }

    /**
     * Builder class for InputVenueMessageContent
     */
    public static class InputVenueMessageContentBuilder {
        private final double latitude;
        private final double longitude;
        private final String title;
        private final String address;
        private String foursquareId;
        private String foursquareType;
        private String googlePlaceId;
        private String googlePlaceType;

        public InputVenueMessageContentBuilder(double latitude, double longitude, String title, String address) {
            this.latitude = latitude;
            this.longitude = longitude;
            this.title = title;
            this.address = address;
        }

        public InputVenueMessageContentBuilder foursquareId(String foursquareId) {
            this.foursquareId = foursquareId;
            return this;
        }

        public InputVenueMessageContentBuilder foursquareType(String foursquareType) {
            this.foursquareType = foursquareType;
            return this;
        }

        public InputVenueMessageContentBuilder googlePlaceId(String googlePlaceId) {
            this.googlePlaceId = googlePlaceId;
            return this;
        }

        public InputVenueMessageContentBuilder googlePlaceType(String googlePlaceType) {
            this.googlePlaceType = googlePlaceType;
            return this;
        }

        public InputVenueMessageContent build() {
            return new InputVenueMessageContent(
                    latitude, longitude, title, address,
                    foursquareId, foursquareType, googlePlaceId, googlePlaceType
            );
        }
    }
}