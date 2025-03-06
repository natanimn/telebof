package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class InputVenueMessageContent implements InputMedia, Serializable {
    private double latitude, longitude;
    private String address, title, foursquare_id, foursquare_type, google_place_id, google_place_type;

    public InputVenueMessageContent(double latitude, double longitude, String title, String address){
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }
    public InputVenueMessageContent foursquareId(String foursquareId) {
        this.foursquare_id = foursquareId;
        return this;
    }

    public InputVenueMessageContent foursquareType(String foursquareType) {
        this.foursquare_type = foursquareType;
        return this;
    }

    public InputVenueMessageContent googlePlaceId(String googlePlaceId) {
        this.google_place_id = googlePlaceId;
        return this;
    }

    public InputVenueMessageContent googlePlaceType(String googlePlaceType) {
        this.google_place_type = googlePlaceType;
        return this;
    }

    @Override
    public boolean isFile() {
        return false;
    }

    @Override
    public InputFile getInputFile() {
        return null;
    }

    @Override
    public boolean hasThumbnailFile() {
        return false;
    }

    @Override
    public InputFile getThumbnailFile() {
        return null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InputVenueMessageContent that = (InputVenueMessageContent) object;
        return Double.compare(latitude, that.latitude) == 0 && Double.compare(longitude, that.longitude) == 0 &&
                Objects.equals(address, that.address) && Objects.equals(title, that.title) &&
                Objects.equals(foursquare_id, that.foursquare_id) &&
                Objects.equals(foursquare_type, that.foursquare_type) &&
                Objects.equals(google_place_id, that.google_place_id) &&
                Objects.equals(google_place_type, that.google_place_type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(latitude, longitude, address, title, foursquare_id, foursquare_type, google_place_id, google_place_type);
    }
}
