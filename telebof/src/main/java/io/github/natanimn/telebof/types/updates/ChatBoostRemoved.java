package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatBoostSource;
import lombok.Getter;

/**
 * This object represents a boost removed from a chat.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatBoostRemoved implements TelegramUpdate, JsonFormatter {
    /**
     * Chat which was boosted
     */
    private Chat chat;

    /**
     * Unique identifier of the boost
     */
    @SerializedName("boost_id")
    private String boostId;

    /**
     * Point in time (Unix timestamp) when the boost was removed
     */
    @SerializedName("removed_date")
    private Integer removedDate;

    /**
     * Source of the removed boost
     */
    private ChatBoostSource source;
}