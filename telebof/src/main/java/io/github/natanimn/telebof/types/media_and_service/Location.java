package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a point on the map.
 * @param longitude Longitude as defined by the sender
 * @param latitude Latitude as defined by the sender
 * @param horizontalAccuracy Optional. The radius of uncertainty for the location, measured in meters; 0-1500
 * @param livePeriod Optional. Time relative to the message sending date, during which the location can be updated; in seconds. For active live locations only.
 * @param heading Optional. The direction in which user is moving, in degrees; 1-360. For active live locations only.
 * @param proximityAlertRadius Optional. The maximum distance for proximity alerts about approaching another chat member, in meters. For sent live locations only.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Location(
        Double longitude,
        Double latitude,
        @SerializedName("horizontal_accuracy") Double horizontalAccuracy,
        @SerializedName("live_period") Integer livePeriod,
        Integer heading,
        @SerializedName("proximity_alert_radius") Integer proximityAlertRadius
) {}