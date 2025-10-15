package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.MessageOriginType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This class describes the origin of a message
 * @param type Type of the message origin,
 * @param date Date the message was sent originally in Unix time
 * @param senderUser User that sent the message originally
 * @param senderUserName Name of the user that sent the message originally
 * @param senderChat Chat that sent the message originally
 * @param authorSignature For messages originally sent by an anonymous chat administrator, original message author signature, or Signature of the original post author
 * @param messageId Unique message identifier inside the chat
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record MessageOrigin(
        MessageOriginType type,
        Integer date,
        @SerializedName("sender_user") User senderUser,
        @SerializedName("sender_user_name") String senderUserName,
        @SerializedName("sender_chat") Chat senderChat,
        @SerializedName("author_signature") String authorSignature,
        @SerializedName("message_id") Integer messageId
) implements Serializable {}