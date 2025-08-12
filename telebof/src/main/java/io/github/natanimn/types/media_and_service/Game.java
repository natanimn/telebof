package io.github.natanimn.types.media_and_service;

import java.util.List;

/**
 * This object represents a game. Use BotFather to create and edit games, their short names will act as unique identifiers.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Game {
    /**
     * Title of the game
     */
    public String title;

    /**
     * Description of the game
     */
    public String description;

    /**
     * Photo that will be displayed in the game message in chats.
     */
    public List<PhotoSize> photo;

    /**
     * Optional. Brief description of the game or high scores included in the game message.
     * Can be automatically edited to include current high scores for the game when the bot calls {@link io.github.natanimn.BotContext#setGameScore},
     * or manually edited using {@link io.github.natanimn.BotContext#editMessageText}. 0-4096 characters.
     */
    public String text;

    /**
     * Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
     */
    public List<MessageEntity> text_entities;

    /**
     * Optional. Animation that will be displayed in the game message in chats. Upload via @BotFather
     */
    public Animation animation;
}
