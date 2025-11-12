package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

import java.util.List;
import java.util.Objects;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @param timeZoneName Unique name of the time zone for which the opening hours are defined
 * @param openingHours List of time intervals describing business opening hours
 */
public record BusinessOpeningHours(
     @SerializedName("time_zone_name")
     String timeZoneName,

     @SerializedName("opening_hours")
     List<BusinessOpeningHoursInterval> openingHours
){ }
