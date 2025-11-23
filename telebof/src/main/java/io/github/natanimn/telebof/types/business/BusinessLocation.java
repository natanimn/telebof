package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Location;

/**
 * Contains information about the location of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessLocation {
    /**
     * Address of the business
     */
    private String address;

    /**
     * Location of the business
     */
    private Location location;

    public String getAddress() {
        return address;
    }

    public Location getLocation() {
        return location;
    }
}