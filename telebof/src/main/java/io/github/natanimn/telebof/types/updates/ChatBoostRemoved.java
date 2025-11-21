package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.ChatBoostSource;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * This object represents a boost removed from a chat.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatBoostRemoved implements TelegramUpdate {
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

    public Chat getChat() {
        return chat;
    }

    public String getBoostId() {
        return boostId;
    }

    public Integer getRemovedDate() {
        return removedDate;
    }

    public ChatBoostSource getSource() {
        return source;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatBoostRemoved that = (ChatBoostRemoved) object;
        return Objects.equals(chat, that.chat) &&
                Objects.equals(boostId, that.boostId) &&
                Objects.equals(removedDate, that.removedDate) &&
                Objects.equals(source, that.source);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, boostId, removedDate, source);
    }

    @Override
    public String toString() {
        return "ChatBoostRemoved{" +
                "chat=" + chat +
                ", boostId='" + boostId + '\'' +
                ", removedDate=" + removedDate +
                ", source=" + source +
                '}';
    }
}