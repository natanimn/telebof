package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.media_and_service.LocationAddress;

/**
 * Describes a story area pointing to a location. Currently, a story can have up to 10 location areas.
 * @param latitude Location latitude in degrees
 * @param longitude Location longitude in degrees
 * @param address Optional. Address of the location
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record StoryAreaTypeLocation(
        Double latitude,
        Double longitude,
        LocationAddress address
) implements StoryAreaType {
    public String type() {
        return "location";
    }

    /**
     * Creates a new StoryAreaTypeLocation builder
     * @param latitude Location latitude in degrees
     * @param longitude Location longitude in degrees
     */
    public static StoryAreaTypeLocationBuilder builder(double latitude, double longitude) {
        return new StoryAreaTypeLocationBuilder(latitude, longitude);
    }

    /**
     * Builder class for StoryAreaTypeLocation
     */
    public static class StoryAreaTypeLocationBuilder {
        private final double latitude;
        private final double longitude;
        private LocationAddress address;

        public StoryAreaTypeLocationBuilder(double latitude, double longitude) {
            this.latitude = latitude;
            this.longitude = longitude;
        }

        public StoryAreaTypeLocationBuilder address(LocationAddress address) {
            this.address = address;
            return this;
        }

        public StoryAreaTypeLocation build() {
            return new StoryAreaTypeLocation(latitude, longitude, address);
        }
    }
}