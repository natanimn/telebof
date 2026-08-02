package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

import java.util.List;

/**
 * This object represents a service message about new members invited to a video chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class VideoChatParticipantsInvited {
    /**
     * New members that were invited to the video chat
     */
    private List<User> users;

}