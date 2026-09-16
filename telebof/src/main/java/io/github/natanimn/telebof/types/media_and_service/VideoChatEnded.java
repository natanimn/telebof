package io.github.natanimn.telebof.types.media_and_service;

import lombok.Getter;

/**
 * This object represents a service message about a video chat ended in the chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class VideoChatEnded {
    /**
     * Video chat duration in seconds
     */
    private Integer duration;

}