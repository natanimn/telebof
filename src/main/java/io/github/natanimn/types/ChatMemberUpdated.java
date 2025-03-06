package io.github.natanimn.types;

import java.util.Objects;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ChatMemberUpdated {
    public Chat chat;
    public User from;
    public Integer date;
    public ChatMember old_chat_member, new_chat_member;
    public ChatInviteLink invite_link;
    public Boolean via_chat_folder_invite_link, via_join_request;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatMemberUpdated that = (ChatMemberUpdated) object;
        return Objects.equals(chat, that.chat) && Objects.equals(from, that.from) &&
                Objects.equals(date, that.date) && Objects.equals(old_chat_member, that.old_chat_member) &&
                Objects.equals(new_chat_member, that.new_chat_member) &&
                Objects.equals(invite_link, that.invite_link) &&
                Objects.equals(via_chat_folder_invite_link, that.via_chat_folder_invite_link) &&
                Objects.equals(via_join_request, that.via_join_request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, from, date, old_chat_member, new_chat_member, invite_link,
                via_chat_folder_invite_link, via_join_request);
    }

    @Override
    public String toString() {
        return "ChatMemberUpdated{" +
                "chat=" + chat +
                ", from=" + from +
                ", date=" + date +
                ", old_chat_member=" + old_chat_member +
                ", new_chat_member=" + new_chat_member +
                ", invite_link=" + invite_link +
                ", via_chat_folder_invite_link=" + via_chat_folder_invite_link +
                ", via_join_request=" + via_join_request +
                '}';
    }
}
