package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @param openingMinute The minute's sequence number in a week, starting on Monday, marking the start of the time interval during which the business is open; 0 - 7 * 24 * 60
 * @param closingMinute The minute's sequence number in a week, starting on Monday, marking the end of the time interval during which the business is open; 0 - 8 * 24 * 60
 */
public record BusinessOpeningHoursInterval(
    @SerializedName("opening_minute")
    Integer openingMinute,

    @SerializedName("closing_minute")
    Integer closingMinute
){}
