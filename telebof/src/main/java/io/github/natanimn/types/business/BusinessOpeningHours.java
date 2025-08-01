package io.github.natanimn.types.business;

import java.util.List;
import java.util.Objects;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BusinessOpeningHours{
    /**
     * Unique name of the time zone for which the opening hours are defined
     */
    public String time_zone_name;

    /**
     * List of time intervals describing business opening hours
     */
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
