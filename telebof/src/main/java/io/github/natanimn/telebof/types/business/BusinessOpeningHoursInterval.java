package io.github.natanimn.telebof.types.business;

import java.util.Objects;

/**
 * Describes the opening hours of a business.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BusinessOpeningHoursInterval{
    /**
     * The minute's sequence number in a week, starting on Monday, marking the start of the time interval during which
     * the business is open; 0 - 7 * 24 * 60
     */
    public Integer opening_minute;

    /**
     * The minute's sequence number in a week, starting on Monday, marking the end of the time interval during which
     * the business is open; 0 - 8 * 24 * 60
     */
    public Integer closing_minute;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessOpeningHoursInterval that = (BusinessOpeningHoursInterval) object;
        return Objects.equals(opening_minute, that.opening_minute) && Objects.equals(closing_minute, that.closing_minute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(opening_minute, closing_minute);
    }
}
