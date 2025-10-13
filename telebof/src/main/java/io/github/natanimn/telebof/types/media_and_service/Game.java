package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.BotContext;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a game. Use BotFather to create and edit games, their short names will act as unique identifiers.
 * @param title Title of the game
 * @param description Description of the game
 * @param photo Photo that will be displayed in the game message in chats.
 * @param text Optional. Brief description of the game or high scores included in the game message. Can be automatically edited to include current high scores for the game when the bot calls {@link BotContext#setGameScore}, or manually edited using {@link BotContext#editMessageText}. 0-4096 characters.
 * @param textEntities Optional. Special entities that appear in text, such as usernames, URLs, bot commands, etc.
 * @param animation Optional. Animation that will be displayed in the game message in chats. Upload via @BotFather
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Game(
        String title,
        String description,
        List<PhotoSize> photo,
        String text,
        @SerializedName("text_entities") List<MessageEntity> textEntities,
        Animation animation
) {}