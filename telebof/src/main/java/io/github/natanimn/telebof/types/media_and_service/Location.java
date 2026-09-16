package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * This object represents a point on the map.
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class Location implements JsonFormatter {
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

}