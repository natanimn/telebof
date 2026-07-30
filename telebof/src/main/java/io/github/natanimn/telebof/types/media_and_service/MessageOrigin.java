package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.MessageOriginType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This class describes the origin of a message
 * @author Natanim
 * @since 0.1
 */
@Getter
@Setter
@Accessors(chain = true)
public class MessageOrigin implements Serializable {
    /**
     * Type of the message origin
     */
    private MessageOriginType type;

    /**
     * Date the message was sent originally in Unix time
     */
    private Integer date;

    /**
     * User that sent the message originally
     */
    @SerializedName("sender_user")
    private User senderUser;

    /**
     * Name of the user that sent the message originally
     */
    @SerializedName("sender_user_name")
    private String senderUserName;

    /**
     * Chat that sent the message originally
     */
    @SerializedName("sender_chat")
    private Chat senderChat;

    /**
     * For messages originally sent by an anonymous chat administrator, original message author signature, or Signature of the original post author
     */
    @SerializedName("author_signature")
    private String authorSignature;

    /**
     * Unique message identifier inside the chat
     */
    @SerializedName("message_id")
    private Integer messageId;
}