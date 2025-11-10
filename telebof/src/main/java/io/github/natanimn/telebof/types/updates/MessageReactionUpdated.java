package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a change of a reaction on a message performed by a user.
 * @param chat The chat containing the message the user reacted to
 * @param messageId Unique identifier of the message inside the chat
 * @param user The user that changed the reaction, if the user isn't anonymous
 * @param actorChat The chat on behalf of which the reaction was changed, if the user is anonymous
 * @param date Date of the change in Unix time
 * @param oldReaction Previous list of reaction types that were set by the user
 * @param newReaction New list of reaction types that have been set by the user
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record MessageReactionUpdated(
        Chat chat,
        @SerializedName("message_id") Integer messageId,
        User user,
        @SerializedName("actor_chat") Chat actorChat,
        int date,
        @SerializedName("old_reaction") List<ReactionType> oldReaction,
        @SerializedName("new_reaction") List<ReactionType> newReaction
) implements TelegramUpdate {}