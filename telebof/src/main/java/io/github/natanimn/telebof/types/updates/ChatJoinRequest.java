package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

/**
 * Represents a join request sent to a chat.
 * @param chat Chat to which the request was sent
 * @param from User that sent the join request
 * @param userChatId Identifier of a private chat with the user who sent the join request.
 * @param date Date the request was sent in Unix time
 * @param bio Bio of the user.
 * @param inviteLink Chat invite link that was used by the user to send the join request
 * @author Natanim
 * @since  3 March 2025
 * @version 1.3.0
 */
public record ChatJoinRequest(
        Chat chat,
        User from,
        @SerializedName("user_chat_id") Long userChatId,
        Integer date,
        String bio,
        @SerializedName("invite_link") ChatInviteLink inviteLink
) implements TelegramUpdate {}