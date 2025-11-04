package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object is received when messages are deleted from a connected business account.
 * @param businessConnectionId Unique identifier of the business connection
 * @param chat Information about a chat in the business account. The bot may not have access to the chat or the corresponding user.
 * @param messageIds The list of identifiers of deleted messages in the chat of the business account
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record BusinessMessagesDeleted(
        @SerializedName("business_connection_id") String businessConnectionId,
        Chat chat,
        @SerializedName("message_ids") List<Integer> messageIds
) implements TelegramUpdate {}