package io.github.natanimn.types.updates;

import io.github.natanimn.types.chat_and_user.Chat;
import io.github.natanimn.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.types.chat_and_user.ChatMember;
import io.github.natanimn.types.chat_and_user.User;

import java.util.Objects;

/**
 * This object represents changes in the status of a chat member.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class ChatMemberUpdated implements TelegramUpdate {
    /**
     Chat the user belongs to
     */
    public Chat chat;

    /**
     * Performer of the action, which resulted in the change
     */
    public User from;

    /**
     * Date the change was done in Unix time
     */
    public Integer date;

    /**
     * Previous information about the chat member
     */
    public ChatMember old_chat_member;

    /**
     * New information about the chat member
     */
    public ChatMember new_chat_member;

    /**
     * Chat invite link, which was used by the user to join the chat; for joining by invite link events only.
     */
    public ChatInviteLink invite_link;

    /**
     * True, if the user joined the chat after sending a direct join request without using an invite link and being approved by an administrator
     */
    public Boolean via_chat_folder_invite_link;

    /**
     * True, if the user joined the chat via a chat folder invite link
     */
    public Boolean via_join_request;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatMemberUpdated that = (ChatMemberUpdated) object;
        return  Objects.equals(chat, that.chat) &&
                Objects.equals(from, that.from) &&
                Objects.equals(date, that.date) &&
                Objects.equals(old_chat_member, that.old_chat_member) &&
                Objects.equals(new_chat_member, that.new_chat_member) &&
                Objects.equals(invite_link, that.invite_link) &&
                Objects.equals(via_chat_folder_invite_link, that.via_chat_folder_invite_link) &&
                Objects.equals(via_join_request, that.via_join_request);
    }

    @Override
    public int hashCode() {
        return Objects.hash(
                chat,
                from,
                date,
                old_chat_member,
                new_chat_member,
                invite_link,
                via_chat_folder_invite_link,
                via_join_request
        );
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
