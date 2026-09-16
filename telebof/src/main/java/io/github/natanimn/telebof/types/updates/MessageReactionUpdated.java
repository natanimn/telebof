package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import lombok.Getter;

import java.util.List;

/**
 * This object represents a change of a reaction on a message performed by a user.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class MessageReactionUpdated implements TelegramUpdate, JsonFormatter {
    /**
     * The chat containing the message the user reacted to
     */
    private Chat chat;

    /**
     * Unique identifier of the message inside the chat
     */
    @SerializedName("message_id")
    private Integer messageId;

    /**
     * The user that changed the reaction, if the user isn't anonymous
     */
    private User user;

    /**
     * The chat on behalf of which the reaction was changed, if the user is anonymous
     */
    @SerializedName("actor_chat")
    private Chat actorChat;

    /**
     * Date of the change in Unix time
     */
    private int date;

    /**
     * Previous list of reaction types that were set by the user
     */
    @SerializedName("old_reaction")
    private List<ReactionType> oldReaction;

    /**
     * New list of reaction types that have been set by the user
     */
    @SerializedName("new_reaction")
    private List<ReactionType> newReaction;
}