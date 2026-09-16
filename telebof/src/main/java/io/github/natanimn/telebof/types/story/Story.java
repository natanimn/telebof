package io.github.natanimn.telebof.types.story;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import lombok.Getter;

/**
 * This object represents a story.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Story {
    /**
     * Chat that posted the story
     */
    private Chat chat;

    /**
     * Unique identifier for the story in the chat
     */
    private Integer id;

}