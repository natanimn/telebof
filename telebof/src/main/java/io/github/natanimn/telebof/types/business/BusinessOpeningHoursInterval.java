package io.github.natanimn.telebof.types.business;

import com.google.gson.annotations.SerializedName;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessOpeningHoursInterval {
    @SerializedName("opening_minute")
    private Integer openingMinute;

    @SerializedName("closing_minute")
    private Integer closingMinute;

    /**
     * Gets the minute's sequence number in a week, starting on Monday, marking the start of the time interval during which the business is open.
     * @return The minute's sequence number in a week, starting on Monday, marking the start of the time interval during which the business is open; 0 - 7 * 24 * 60
     */
    public Integer getOpeningMinute() {
        return openingMinute;
    }

    /**
     * Gets the minute's sequence number in a week, starting on Monday, marking the end of the time interval during which the business is open.
     * @return The minute's sequence number in a week, starting on Monday, marking the end of the time interval during which the business is open; 0 - 8 * 24 * 60
     */
    public Integer getClosingMinute() {
        return closingMinute;
    }
}