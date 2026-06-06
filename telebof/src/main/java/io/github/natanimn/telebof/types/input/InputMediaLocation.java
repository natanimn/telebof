package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * Represents a location to be sent.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class InputMediaLocation implements Serializable, InputPollMedia, InputPollOptionMedia {
    private final String type = "location";

    private double latitude;
    private double longitude;

    @SerializedName("horizontal_accuracy")
    private Double horizontalAccuracy;

    /**
     * Required
     * @param latitude Latitude of the location
     * @param longitude Longitude of the location
     */
    public InputMediaLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * Optional
     * @param horizontalAccuracy The radius of uncertainty for the location, measured in meters; 0-1500
     * @return {@link InputMediaLocation}
     */
    public InputMediaLocation setHorizontalAccuracy(Double horizontalAccuracy) {
        this.horizontalAccuracy = horizontalAccuracy;
        return this;
    }
}
