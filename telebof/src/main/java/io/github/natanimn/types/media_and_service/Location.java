package io.github.natanimn.types.media_and_service;


/**
 * This object represents a point on the map.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class Location {
    /**
     * Longitude as defined by the sender
     */
    public Double longitude;

    /**
     * Latitude as defined by the sender
     */
    public Double latitude;

    /**
     * Optional. The radius of uncertainty for the location, measured in meters; 0-1500
     */
    public Double horizontal_accuracy;

    /**
     * Optional. Time relative to the message sending date, during which the location can be updated; in seconds.
     * For active live locations only.
     */
    public Integer live_period;

    /**
     * Optional. The direction in which user is moving, in degrees; 1-360. For active live locations only.
     */
    public Integer heading;

    /**
     * Optional. The maximum distance for proximity alerts about approaching another chat member, in meters.
     * For sent live locations only.
     */
    public Integer proximity_alert_radius;
}
