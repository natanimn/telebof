package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a location message to be sent as the result of an inline query.
 * @param latitude Latitude of the location in degrees
 * @param longitude Longitude of the location in degrees
 * @param horizontalAccuracy Optional. The radius of uncertainty for the location, measured in meters; 0-1500
 * @param livePeriod Optional. Period in seconds during which the location can be updated, should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
 * @param heading Optional. For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
 * @param proximityAlertRadius Optional. For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters. Must be between 1 and 100000 if specified.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record InputLocationMessageContent(
        Double latitude,
        Double longitude,
        @SerializedName("horizontal_accuracy") Double horizontalAccuracy,
        @SerializedName("live_period") Integer livePeriod,
        Integer heading,
        @SerializedName("proximity_alert_radius") Integer proximityAlertRadius
) implements InputMessageContent {

    /**
     * Creates a new InputLocationMessageContent builder
     * @param latitude Latitude of the location in degrees
     * @param longitude Longitude of the location in degrees
     */
    public static InputLocationMessageContentBuilder builder(double latitude, double longitude) {
        return new InputLocationMessageContentBuilder(latitude, longitude);
    }

    /**
     * Builder class for InputLocationMessageContent
     */
    public static class InputLocationMessageContentBuilder {
        private final double latitude;
        private final double longitude;
        private Double horizontalAccuracy;
        private Integer livePeriod;
        private Integer heading;
        private Integer proximityAlertRadius;

        public InputLocationMessageContentBuilder(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public InputLocationMessageContentBuilder horizontalAccuracy(double horizontalAccuracy) {
            this.horizontalAccuracy = horizontalAccuracy;
            return this;
        }

        public InputLocationMessageContentBuilder livePeriod(Integer livePeriod) {
            this.livePeriod = livePeriod;
            return this;
        }

        public InputLocationMessageContentBuilder heading(Integer heading) {
            this.heading = heading;
            return this;
        }

        public InputLocationMessageContentBuilder proximityAlertRadius(Integer proximityAlertRadius) {
            this.proximityAlertRadius = proximityAlertRadius;
            return this;
        }

        public InputLocationMessageContent build() {
            return new InputLocationMessageContent(
                    latitude, longitude, horizontalAccuracy, livePeriod, heading, proximityAlertRadius
            );
        }
    }
}