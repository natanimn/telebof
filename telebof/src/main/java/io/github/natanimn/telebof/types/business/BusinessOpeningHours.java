package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessOpeningHours {
    @SerializedName("time_zone_name")
    private String timeZoneName;

    @SerializedName("opening_hours")
    private List<BusinessOpeningHoursInterval> openingHours;

    /**
     * Gets the unique name of the time zone for which the opening hours are defined.
     * @return Unique name of the time zone for which the opening hours are defined
     */
    public String getTimeZoneName() {
        return timeZoneName;
    }

    /**
     * Gets the list of time intervals describing business opening hours.
     * @return List of time intervals describing business opening hours
     */
    public List<BusinessOpeningHoursInterval> getOpeningHours() {
        return openingHours;
    }
}