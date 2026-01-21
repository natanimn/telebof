package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.media_and_service.LocationAddress;

/**
 * Describes a story area pointing to a location. Currently, a story can have up to 10 location areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class StoryAreaTypeLocation implements StoryAreaType {
    /**
     * Location latitude in degrees
     */
    private Double latitude;

    /**
     * Location longitude in degrees
     */
    private Double longitude;

    /**
     * Optional. Address of the location
     */
    private LocationAddress address;

    public StoryAreaTypeLocation(){}
    /**
     * Required
     * @param latitude Location latitude in degrees
     * @param longitude Location longitude in degrees
     */
    public StoryAreaTypeLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    /**
     * @param address Address of the location
     * @return this
     */
    public StoryAreaTypeLocation setAddress(LocationAddress address) {
        this.address = address;
        return this;
    }

    public Double getLatitude() {
        return latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public LocationAddress getAddress() {
        return address;
    }

    public String type() {
        return "location";
    }
}