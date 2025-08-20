package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.media_and_service.LocationAddress;

/**
 * Describes a story area pointing to a location. Currently, a story can have up to 10 location areas.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class StoryAreaTypeLocation implements StoryAreaType{
    private String type;
    private Double latitude, longitude;
    private LocationAddress address;

    /**
     * Required
     * @param latitude Location latitude in degrees
     * @param longitude Location longitude in degrees
     */
    public StoryAreaTypeLocation(double latitude, double longitude){
        this.type      = "location";
        this.latitude  = latitude;
        this.longitude = longitude;
    }

    /**
     * Optional
     * @param address Address of the location
     * @return {@link StoryAreaTypeLocation}
     */
    public StoryAreaTypeLocation address(LocationAddress address){
        this.address = address;
        return this;
    }
}
