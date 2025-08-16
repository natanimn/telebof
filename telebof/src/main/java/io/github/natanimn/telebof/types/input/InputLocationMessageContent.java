package io.github.natanimn.telebof.types.input;


/**
 * Represents the content of a location message to be sent as the result of an inline query.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
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
     * @param horizontal_accuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent horizontalAccuracy(double horizontal_accuracy) {
        this.horizontal_accuracy = horizontal_accuracy;
        return this;
    }

    /**
     * Optional
     * @param live_period Period in seconds during which the location can be updated, should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent livePeriod(int live_period) {
        this.live_period = live_period;
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
     * @param proximity_alert_radius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters.
     *                               Must be between 1 and 100000 if specified.
     * @return {@link InputLocationMessageContent}
     */
    public InputLocationMessageContent proximityAlertRadius(int proximity_alert_radius) {
        this.proximity_alert_radius = proximity_alert_radius;
        return this;
    }
}
