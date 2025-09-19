package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * This object contains information about a chat that was shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestChat} button.
 * @param requestId Identifier of the request
 * @param chatId Identifier of the shared chat.
 * @param title Optional. Title of the chat, if the title was requested by the bot.
 * @param username Optional. Username of the chat, if the username was requested by the bot and available.
 * @param photo Optional. Available sizes of the chat photo, if the photo was requested by the bot
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record ChatShared(
        @SerializedName("request_id") Integer requestId,
        @SerializedName("chat_id") Long chatId,
        String title,
        String username,
        List<PhotoSize> photo
) { }