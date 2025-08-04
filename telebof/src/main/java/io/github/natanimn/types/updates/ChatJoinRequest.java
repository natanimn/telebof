package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.Chat;
import io.github.natanimn.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.types.chat_and_user.User;

import java.util.Objects;

/**
 * Represents a join request sent to a chat.
 * @author Natanim
 * @since  3 March 2025
 * @version 0.7
 */
public class ChatJoinRequest {
    /**
     * Chat to which the request was sent
     */
    public Chat chat;

    /**
     * User that sent the join request
     */
    public User from;

    /**
     * Identifier of a private chat with the user who sent the join request.
     */
    public Long user_chat_id;

    /**
     * Date the request was sent in Unix time
     */
    public Integer date;

    /**
     * Bio of the user.
     */
    public String bio;

    /**
     * Chat invite link that was used by the user to send the join request
     */
    public ChatInviteLink invite_link;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatJoinRequest that = (ChatJoinRequest) object;
        return  Objects.equals(chat, that.chat) &&
                Objects.equals(from, that.from) &&
                Objects.equals(user_chat_id, that.user_chat_id) &&
                Objects.equals(date, that.date) &&
                Objects.equals(bio, that.bio) &&
                Objects.equals(invite_link, that.invite_link);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, from, user_chat_id, date, bio, invite_link);
    }

    @Override
    public String toString() {
        return "ChatJoinRequest{" +
                "chat=" + chat +
                ", from=" + from +
                ", user_chat_id=" + user_chat_id +
                ", date=" + date +
                ", bio='" + bio + '\'' +
                ", invite_link=" + invite_link +
                '}';
    }
}
