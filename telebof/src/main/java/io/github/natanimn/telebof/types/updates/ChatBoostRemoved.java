package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.ChatBoostSource;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a boost removed from a chat.
 * @param chat Chat which was boosted
 * @param boostId Unique identifier of the boost
 * @param removedDate Point in time (Unix timestamp) when the boost was removed
 * @param source Source of the removed boost
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatBoostRemoved(
        Chat chat,
        @SerializedName("boost_id") String boostId,
        @SerializedName("removed_date") Integer removedDate,
        ChatBoostSource source
) implements TelegramUpdate {}