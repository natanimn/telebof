package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a point on the map.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Location {
    /**
     * Longitude as defined by the sender
     */
    private Double longitude;

    /**
     * Latitude as defined by the sender
     */
    private Double latitude;

    /**
     * Optional. The radius of uncertainty for the location, measured in meters; 0-1500
     */
    @SerializedName("horizontal_accuracy")
    private Double horizontalAccuracy;

    /**
     * Optional. Time relative to the message sending date, during which the location can be updated; in seconds. For active live locations only.
     */
    @SerializedName("live_period")
    private Integer livePeriod;

    /**
     * Optional. The direction in which user is moving, in degrees; 1-360. For active live locations only.
     */
    private Integer heading;

    /**
     * Optional. The maximum distance for proximity alerts about approaching another chat member, in meters. For sent live locations only.
     */
    @SerializedName("proximity_alert_radius")
    private Integer proximityAlertRadius;

    public Double getLongitude() {
        return longitude;
    }

    public Location setLongitude(Double longitude) {
        this.longitude = longitude;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Location setLatitude(Double latitude) {
        this.latitude = latitude;
        return this;
    }

    public Double getHorizontalAccuracy() {
        return horizontalAccuracy;
    }

    public Location setHorizontalAccuracy(Double horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
        return this;
    }

    public Integer getLivePeriod() {
        return livePeriod;
    }

    public Location setLivePeriod(Integer livePeriod) {
        this.livePeriod = livePeriod;
        return this;
    }

    public Integer getHeading() {
        return heading;
    }

    public Location setHeading(Integer heading) {
        this.heading = heading;
        return this;
    }

    public Integer getProximityAlertRadius() {
        return proximityAlertRadius;
    }

    public Location setProximityAlertRadius(Integer proximityAlertRadius) {
        this.proximityAlertRadius = proximityAlertRadius;
        return this;
    }
}