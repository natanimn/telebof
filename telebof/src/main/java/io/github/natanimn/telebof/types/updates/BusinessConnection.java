package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.business.BusinessBotRights;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * Describes the connection of the bot with a business account.
 * @param id Unique identifier of the business connection
 * @param user Business account user that created the business connection
 * @param userChatId Identifier of a private chat with the user who created the business connection
 * @param date Date the connection was established in Unix time
 * @param rights Optional. Rights of the business bot
 * @param isEnabled True, if the connection is active
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record BusinessConnection(
        String id,
        User user,
        @SerializedName("user_chat_id") Long userChatId,
        Integer date,
        BusinessBotRights rights,
        @SerializedName("is_enabled") Boolean isEnabled
) implements TelegramUpdate {}