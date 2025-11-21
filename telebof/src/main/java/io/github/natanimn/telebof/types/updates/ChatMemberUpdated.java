package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.telebof.types.chat_and_user.ChatMember;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * This object represents changes in the status of a chat member.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatMemberUpdated implements TelegramUpdate {
    /**
     * Chat the user belongs to
     */
    private Chat chat;

    /**
     * Performer of the action, which resulted in the change
     */
    private User from;

    /**
     * Date the change was done in Unix time
     */
    private Integer date;

    /**
     * Previous information about the chat member
     */
    @SerializedName("old_chat_member")
    private ChatMember oldChatMember;

    /**
     * New information about the chat member
     */
    @SerializedName("new_chat_member")
    private ChatMember newChatMember;

    /**
     * Chat invite link, which was used by the user to join the chat; for joining by invite link events only.
     */
    @SerializedName("invite_link")
    private ChatInviteLink inviteLink;

    /**
     * True, if the user joined the chat after sending a direct join request without using an invite link and being approved by an administrator
     */
    @SerializedName("via_chat_folder_invite_link")
    private Boolean viaChatFolderInviteLink;

    /**
     * True, if the user joined the chat via a chat folder invite link
     */
    @SerializedName("via_join_request")
    private Boolean viaJoinRequest;

    public Chat getChat() {
        return chat;
    }

    public User getFrom() {
        return from;
    }

    public Integer getDate() {
        return date;
    }

    public ChatMember getOldChatMember() {
        return oldChatMember;
    }

    public ChatMember getNewChatMember() {
        return newChatMember;
    }

    public ChatInviteLink getInviteLink() {
        return inviteLink;
    }

    public Boolean getViaChatFolderInviteLink() {
        return viaChatFolderInviteLink;
    }

    public Boolean getViaJoinRequest() {
        return viaJoinRequest;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        ChatMemberUpdated that = (ChatMemberUpdated) object;
        return Objects.equals(chat, that.chat) &&
                Objects.equals(from, that.from) &&
                Objects.equals(date, that.date) &&
                Objects.equals(oldChatMember, that.oldChatMember) &&
                Objects.equals(newChatMember, that.newChatMember) &&
                Objects.equals(inviteLink, that.inviteLink) &&
                Objects.equals(viaChatFolderInviteLink, that.viaChatFolderInviteLink) &&
                Objects.equals(viaJoinRequest, that.viaJoinRequest);
    }

    @Override
    public int hashCode() {
        return Objects.hash(chat, from, date, oldChatMember, newChatMember, inviteLink, viaChatFolderInviteLink, viaJoinRequest);
    }

    @Override
    public String toString() {
        return "ChatMemberUpdated{" +
                "chat=" + chat +
                ", from=" + from +
                ", date=" + date +
                ", oldChatMember=" + oldChatMember +
                ", newChatMember=" + newChatMember +
                ", inviteLink=" + inviteLink +
                ", viaChatFolderInviteLink=" + viaChatFolderInviteLink +
                ", viaJoinRequest=" + viaJoinRequest +
                '}';
    }
}