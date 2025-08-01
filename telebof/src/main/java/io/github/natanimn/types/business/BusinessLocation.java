package io.github.natanimn.types.business;

import io.github.natanimn.types.media_and_service.Location;
import java.util.Objects;

/**
 * Contains information about the location of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BusinessLocation{
    /**
     * Address of the business
     */
    public String address;

    /**
     * Location of the business
     */
    public Location location;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessLocation that = (BusinessLocation) object;
        return Objects.equals(address, that.address) && Objects.equals(location, that.location);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, location);
    }
}
