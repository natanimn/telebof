package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.telebof.types.chat_and_user.ChatMember;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents changes in the status of a chat member.
 * @param chat Chat the user belongs to
 * @param from Performer of the action, which resulted in the change
 * @param date Date the change was done in Unix time
 * @param oldChatMember Previous information about the chat member
 * @param newChatMember New information about the chat member
 * @param inviteLink Chat invite link, which was used by the user to join the chat; for joining by invite link events only.
 * @param viaChatFolderInviteLink True, if the user joined the chat after sending a direct join request without using an invite link and being approved by an administrator
 * @param viaJoinRequest True, if the user joined the chat via a chat folder invite link
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ChatMemberUpdated(
        Chat chat,
        User from,
        Integer date,
        @SerializedName("old_chat_member") ChatMember oldChatMember,
        @SerializedName("new_chat_member") ChatMember newChatMember,
        @SerializedName("invite_link") ChatInviteLink inviteLink,
        @SerializedName("via_chat_folder_invite_link") Boolean viaChatFolderInviteLink,
        @SerializedName("via_join_request") Boolean viaJoinRequest
) implements TelegramUpdate {}