package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.Chat;

/**
 * This object represents a story.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Story {
    /**
     * Chat that posted the story
     */
    public Chat chat;

    /**
     * Unique identifier for the story in the chat
     */
    public Integer id;
}
