package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Location;

/**
 * Contains information about the location of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessLocation {
    private String address;
    private Location location;

    /**
     * Gets the address of the business.
     * @return Address of the business
     */
    public String getAddress() {
        return address;
    }

    /**
     * Gets the location of the business.
     * @return Location of the business
     */
    public Location getLocation() {
        return location;
    }
}