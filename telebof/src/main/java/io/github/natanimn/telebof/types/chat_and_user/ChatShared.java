package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object contains information about a chat that was shared with the bot using a {@link io.github.natanimn.telebof.types.keyboard.KeyboardButtonRequestChat} button.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatShared {
    /**
     * Identifier of the request
     */
    @SerializedName("request_id")
    private Integer requestId;

    /**
     * Identifier of the shared chat.
     */
    @SerializedName("chat_id")
    private Long chatId;

    /**
     * Optional. Title of the chat, if the title was requested by the bot.
     */
    private String title;

    /**
     * Optional. Username of the chat, if the username was requested by the bot and available.
     */
    private String username;

    /**
     * Optional. Available sizes of the chat photo, if the photo was requested by the bot
     */
    private List<PhotoSize> photo;

    public Integer getRequestId() {
        return requestId;
    }

    public Long getChatId() {
        return chatId;
    }

    public String getTitle() {
        return title;
    }

    public String getUsername() {
        return username;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }
}