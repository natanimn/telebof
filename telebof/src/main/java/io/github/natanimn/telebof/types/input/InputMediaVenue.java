package io.github.natanimn.telebof.types.input;

import com.google.gson.annotations.SerializedName;

import java.io.File;
import java.io.Serializable;
import java.util.List;

/**
 * Represents a venue to be sent.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class InputMediaVenue implements Serializable, InputPollMedia, InputPollOptionMedia {
    public final String type = "venue";

    private final double latitude;
    private final double longitude;
    private final String title;
    private final String address;

    @SerializedName("foursquare_id")
    private String foursquareId;

    @SerializedName("foursquare_type")
    private String foursquareType;

    /**
     * Required
     * @param latitude Latitude of the location
     * @param longitude Longitude of the location
     * @param title Name of the venue
     * @param address Address of the venue
     */
    public InputMediaVenue(double latitude, double longitude, String title, String address) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    public InputMediaVenue setFoursquareId(String foursquareId) {
        this.foursquareId = foursquareId;
        return this;
    }

    public InputMediaVenue setFoursquareType(String foursquareType) {
        this.foursquareType = foursquareType;
        return this;
    }


    @Override
    public boolean hasFile() {
        return false;
    }

    @Override
    public List<File> getFiles() {
        return List.of();
    }
}
