package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

/**
 * Represents the content of a location message to be sent as the result of an inline query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InputLocationMessageContent implements InputMessageContent {
    private Double latitude;
    private Double longitude;

    @SerializedName("horizontal_accuracy")
    private Double horizontalAccuracy;

    @SerializedName("live_period")
    private Integer livePeriod;

    private Integer heading;

    @SerializedName("proximity_alert_radius")
    private Integer proximityAlertRadius;

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
     * Optional.
     * @param horizontalAccuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return this
     */
    public InputLocationMessageContent setHorizontalAccuracy(Double horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
        return this;
    }

    /**
     * Optional.
     * @param livePeriod Period in seconds during which the location can be updated,
     *                   should be between 60 and 86400, or 0x7FFFFFFF for live locations that can be edited indefinitely.
     * @return this
     */
    public InputLocationMessageContent setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    /**
     * Optional.
     * @param heading For live locations, a direction in which the user is moving, in degrees.
     *                Must be between 1 and 360 if specified.
     * @return this
     */
    public InputLocationMessageContent setHeading(Integer heading) {
        this.heading = heading;
        return this;
    }

    /**
     * Optional.
     * @param proximityAlertRadius For live locations, a maximum distance for proximity alerts about approaching another chat member, in meters.
     *                             Must be between 1 and 100000 if specified
     * @return this
     */
    public InputLocationMessageContent setProximityAlertRadius(Integer proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
        return this;
    }
}