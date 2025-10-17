package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents a service message about a video chat ended in the chat.
 * @param duration Video chat duration in seconds
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record VideoChatEnded(
        Integer duration
) {}