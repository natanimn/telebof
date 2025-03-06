package io.github.natanimn.types;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BusinessOpeningHours implements Serializable {
    public String time_zone_name;
    public List<BusinessOpeningHoursInterval> opening_hours;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessOpeningHours that = (BusinessOpeningHours) object;
        return Objects.equals(time_zone_name, that.time_zone_name) && Objects.equals(opening_hours, that.opening_hours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(time_zone_name, opening_hours);
    }
}
