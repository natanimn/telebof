package io.github.natanimn.types.chat_and_user;

import io.github.natanimn.types.media_and_service.Location;


/**
 * Represents a location to which a chat is connected.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class ChatLocation {
    /**
     * The location to which the supergroup is connected. Can't be a live location.
     */
    public Location location;

    /**
     * Location address; 1-64 characters, as defined by the chat owner
     */
    public String address;

}
