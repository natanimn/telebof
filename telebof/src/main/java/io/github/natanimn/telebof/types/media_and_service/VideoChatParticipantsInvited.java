package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;
import java.util.List;

/**
 * This object represents a service message about new members invited to a video chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class VideoChatParticipantsInvited {
    /**
     * New members that were invited to the video chat
     */
    private List<User> users;

    public List<User> getUsers() {
        return users;
    }
}