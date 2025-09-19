package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.Location;

/**
 * Represents a location to which a chat is connected.
 * @param location The location to which the supergroup is connected. Can't be a live location.
 * @param address Location address; 1-64 characters, as defined by the chat owner
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record ChatLocation(Location location, String address) {}