package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BusinessOpeningHoursInterval implements Serializable {
    public Integer opening_minute, closing_minute;

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
