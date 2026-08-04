package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Location;
import lombok.Getter;

/**
 * Contains information about the location of a Telegram Business account.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class BusinessLocation {
    /**
     * Address of the business
     */
    private String address;

    /**
     * Location of the business
     */
    private Location location;

}