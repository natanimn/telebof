package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Represents a join request sent to a chat.
 * @author Natanim
 * @since  3 March 2025
 * @version 1.3.0
 */
public class ChatJoinRequest implements TelegramUpdate {
    /**
     * Chat to which the request was sent
     */
    private Chat chat;

    /**
     * User that sent the join request
     */
    private User from;

    /**
     * Identifier of a private chat with the user who sent the join request.
     */
    @SerializedName("user_chat_id")
    private Long userChatId;

    /**
     * Date the request was sent in Unix time
     */
    private Integer date;

    /**
     * Bio of the user.
     */
    private String bio;

    /**
     * Chat invite link that was used by the user to send the join request
     */
    @SerializedName("invite_link")
    private ChatInviteLink inviteLink;

    public Chat getChat() {
        return chat;
    }

    public User getFrom() {
        return from;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public String getBio() {
        return bio;
    }

    public ChatInviteLink getInviteLink() {
        return inviteLink;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatJoinRequest that = (ChatJoinRequest) object;
        return Objects.equals(chat, that.chat) &&
                Objects.equals(from, that.from) &&
                Objects.equals(userChatId, that.userChatId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(bio, that.bio) &&
                Objects.equals(inviteLink, that.inviteLink);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, from, userChatId, date, bio, inviteLink);
    }

    @Override
    public String toString() {
        return "ChatJoinRequest{" +
                "chat=" + chat +
                ", from=" + from +
                ", userChatId=" + userChatId +
                ", date=" + date +
                ", bio='" + bio + '\'' +
                ", inviteLink=" + inviteLink +
                '}';
    }
}