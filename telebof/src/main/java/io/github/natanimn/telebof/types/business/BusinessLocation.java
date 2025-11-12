package io.github.natanimn.telebof.types.business;

import io.github.natanimn.telebof.types.media_and_service.Location;

/**
 * Contains information about the location of a Telegram Business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @param address Address of the business
 * @param location Location of the business
 */
public record BusinessLocation(String address, Location location){ }
