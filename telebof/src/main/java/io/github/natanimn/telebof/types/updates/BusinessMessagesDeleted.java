package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import lombok.Getter;

import java.util.List;

/**
 * This object is received when messages are deleted from a connected business account.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class BusinessMessagesDeleted implements TelegramUpdate, JsonFormatter {
    /**
     * Unique identifier of the business connection
     */
    @SerializedName("business_connection_id")
    private String businessConnectionId;

    /**
     * Information about a chat in the business account. The bot may not have access to the chat or the corresponding user.
     */
    private Chat chat;

    /**
     * The list of identifiers of deleted messages in the chat of the business account
     */
    @SerializedName("message_ids")
    private List<Integer> messageIds;
}