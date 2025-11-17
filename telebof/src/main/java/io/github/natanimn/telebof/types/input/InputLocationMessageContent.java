package io.github.natanimn.telebof.types.input;


/**
 * Represents the content of a location message to be sent as the result of an inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputLocationMessageContent implements InputMessageContent {
    private double latitude, longitude, horizontal_accuracy;
    private Integer live_period, heading, proximity_alert_radius;

    /**
     * Required
     * @param latitude Latitude of the location in degrees
     * @param longitude Longitude of the location in degrees
     */
    public InputLocationMessageContent(double latitude, double longitude){
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Optional
     * @param horizontalAccuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent horizontalAccuracy(double horizontalAccuracy) {
        this.horizontal_accuracy = horizontalAccuracy;
        return this;
    }

    /**
     * Optional
     * @param livePeriod Period in seconds during which the location can be updated, should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent livePeriod(int livePeriod) {
        this.live_period = livePeriod;
        return this;
    }

    /**
     * Optional
     * @param heading For live locations, a direction in which the user is moving, in degrees. Must be between 1 and 360 if specified.
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent heading(int heading) {
        this.heading = heading;
        return this;
    }

    /**
     * Optional
     * @param proximityAlertRadius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters.
     *                               Must be between 1 and 100000 if specified.
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent proximityAlertRadius(int proximityAlertRadius) {
        this.proximity_alert_radius = proximityAlertRadius;
        return this;
    }
}
