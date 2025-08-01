package io.github.natanimn.types.input;

import java.util.Objects;

/**
 * Represents the content of a venue message to be sent as the result of an inline query.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InputVenueMessageContent implements InputMessageContent{
    private double latitude, longitude;
    private String address, title, foursquare_id, foursquare_type, google_place_id, google_place_type;

    /**
     * Required
     * @param latitude Latitude of the venue in degrees
     * @param longitude Longitude of the venue in degrees
     * @param title Name of the venue
     * @param address Address of the venue
     */
    public InputVenueMessageContent(double latitude, double longitude, String title, String address){
        this.latitude = latitude;
        this.longitude = longitude;
        this.title = title;
        this.address = address;
    }

    /**
     * Optional
     * @param foursquare_id Foursquare identifier of the venue, if known
     * @return {@link InputVenueMessageContent}
     */
    public InputVenueMessageContent foursquareId(String foursquare_id) {
        this.foursquare_id = foursquare_id;
        return this;
    }

    /**
     * Optional
     * @param foursquare_type Foursquare type of the venue, if known. (For example, “arts_entertainment/default”, “arts_entertainment/aquarium” or “food/icecream”.)
     * @return {@link InputVenueMessageContent}
     */
    public InputVenueMessageContent foursquareType(String foursquare_type) {
        this.foursquare_type = foursquare_type;
        return this;
    }

    /**
     * Optional
     * @param google_place_id Google Places identifier of the venue
     * @return {@link InputVenueMessageContent}
     */
    public InputVenueMessageContent googlePlaceId(String google_place_id) {
        this.google_place_id = google_place_id;
        return this;
    }

    /**
     * Optional
     * @param google_place_type Google Places type of the venue.
     * @see <a href="https://developers.google.com/places/web-service/supported_types">Supported types</a>
     * @return {@link InputVenueMessageContent}
     */
    public InputVenueMessageContent googlePlaceType(String google_place_type) {
        this.google_place_type = google_place_type;
        return this;
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
