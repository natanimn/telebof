package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.telebof.types.chat_and_user.ChatMember;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * This object represents changes in the status of a chat member.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ChatMemberUpdated implements TelegramUpdate, JsonFormatter {
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

}