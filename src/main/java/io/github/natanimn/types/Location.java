package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class Location implements Serializable {
    public Double longitude, latitude, horizontal_accuracy;
    public Integer live_period, heading, proximity_alert_radius;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Location location = (Location) object;
        return Objects.equals(longitude, location.longitude) && Objects.equals(latitude, location.latitude) &&
                Objects.equals(horizontal_accuracy, location.horizontal_accuracy) &&
                Objects.equals(live_period, location.live_period) && Objects.equals(heading, location.heading) &&
                Objects.equals(proximity_alert_radius, location.proximity_alert_radius);
    }

    @Override
    public int hashCode() {
        return Objects.hash(longitude, latitude, horizontal_accuracy, live_period, heading, proximity_alert_radius);
    }
}
