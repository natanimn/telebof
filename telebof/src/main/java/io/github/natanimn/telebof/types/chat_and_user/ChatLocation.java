package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.Location;
import lombok.Getter;

/**
 * Represents a location to which a chat is connected.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatLocation {
    /**
     * The location to which the supergroup is connected. Can't be a live location.
     */
    private Location location;

    /**
     * Location address; 1-64 characters, as defined by the chat owner
     */
    private String address;

}