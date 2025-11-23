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
    /**
     * Unique name of the time zone for which the opening hours are defined
     */
    @SerializedName("time_zone_name")
    private String timeZoneName;

    /**
     * List of time intervals describing business opening hours
     */
    @SerializedName("opening_hours")
    private List<BusinessOpeningHoursInterval> openingHours;

    public String getTimeZoneName() {
        return timeZoneName;
    }

    public List<BusinessOpeningHoursInterval> getOpeningHours() {
        return openingHours;
    }
}