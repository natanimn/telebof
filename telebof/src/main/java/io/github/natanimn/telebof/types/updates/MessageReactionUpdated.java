package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.media_and_service.ReactionType;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import java.util.Objects;

/**
 * This object represents a change of a reaction on a message performed by a user.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class MessageReactionUpdated implements TelegramUpdate {
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

    public Chat getChat() {
        return chat;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public User getUser() {
        return user;
    }

    public Chat getActorChat() {
        return actorChat;
    }

    public int getDate() {
        return date;
    }

    public List<ReactionType> getOldReaction() {
        return oldReaction;
    }

    public List<ReactionType> getNewReaction() {
        return newReaction;
    }

    @Override
    public String toString() {
        return "MessageReactionUpdated{" +
                "chat=" + chat +
                ", messageId=" + messageId +
                ", user=" + user +
                ", actorChat=" + actorChat +
                ", date=" + date +
                ", oldReaction=" + oldReaction +
                ", newReaction=" + newReaction +
                '}';
    }
}