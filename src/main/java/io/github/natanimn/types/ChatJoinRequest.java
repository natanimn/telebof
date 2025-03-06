package io.github.natanimn.types;

import java.io.Serializable;
import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ChatJoinRequest implements Serializable {
    public Chat chat;
    public User from;
    public Long user_chat_id;
    public Integer date;
    public String bio;
    public ChatInviteLink invite_link;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatJoinRequest that = (ChatJoinRequest) object;
        return Objects.equals(chat, that.chat) &&
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
