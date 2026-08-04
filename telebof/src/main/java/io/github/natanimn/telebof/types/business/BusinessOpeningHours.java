package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}