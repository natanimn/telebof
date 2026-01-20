package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.chat_and_user.Chat;

/**
 * This object represents a story.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Story {
    /**
     * Chat that posted the story
     */
    private Chat chat;

    /**
     * Unique identifier for the story in the chat
     */
    private Integer id;

    public Chat getChat() {
        return chat;
    }

    public Integer getId() {
        return id;
    }
}