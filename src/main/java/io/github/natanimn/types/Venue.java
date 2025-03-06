package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Venue implements Serializable {
    public String title, address, foursquare_id, foursquare_type, google_place_id, google_place_type;
    public Location location;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Venue venue = (Venue) object;
        return Objects.equals(title, venue.title) && Objects.equals(address, venue.address) &&
                Objects.equals(foursquare_id, venue.foursquare_id) &&
                Objects.equals(foursquare_type, venue.foursquare_type) &&
                Objects.equals(google_place_id, venue.google_place_id) &&
                Objects.equals(google_place_type, venue.google_place_type) &&
                Objects.equals(location, venue.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, address, foursquare_id, foursquare_type, google_place_id, google_place_type, location);
    }
}
