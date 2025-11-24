package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.Location;

/**
 * Represents a location to which a chat is connected.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatLocation {
    /**
     * The location to which the supergroup is connected. Can't be a live location.
     */
    private Location location;

    /**
     * Location address; 1-64 characters, as defined by the chat owner
     */
    private String address;

    public Location getLocation() {
        return location;
    }

    public String getAddress() {
        return address;
    }
}