package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.BotContext;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * This object represents a game. Use BotFather to create and edit games, their short names will act as unique identifiers.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Game {
    /**
     * Title of the game
     */
    private String title;

    /**
     * Description of the game
     */
    private String description;

    /**
     * Photo that will be displayed in the game message in chats.
     */
    private List<PhotoSize> photo;

    /**
     * Optional. Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls {@link BotContext#setGameScore}, or manually edited using {@link BotContext#editMessageText}. 0-4096 characters.
     */
    private String text;

    /**
     * Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
     */
    @SerializedName("text_entities")
    private List<MessageEntity> textEntities;

    /**
     * Optional. Animation that will be displayed in the game message in chats. Upload via @BotFather
     */
    private Animation animation;

}