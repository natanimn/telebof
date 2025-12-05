package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.enums.MessageOriginType;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This class describes the origin of a message
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
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

    public MessageOriginType getType() {
        return type;
    }

    public MessageOrigin setType(MessageOriginType type) {
        this.type = type;
        return this;
    }

    public Integer getDate() {
        return date;
    }

    public MessageOrigin setDate(Integer date) {
        this.date = date;
        return this;
    }

    public User getSenderUser() {
        return senderUser;
    }

    public MessageOrigin setSenderUser(User senderUser) {
        this.senderUser = senderUser;
        return this;
    }

    public String getSenderUserName() {
        return senderUserName;
    }

    public MessageOrigin setSenderUserName(String senderUserName) {
        this.senderUserName = senderUserName;
        return this;
    }

    public Chat getSenderChat() {
        return senderChat;
    }

    public MessageOrigin setSenderChat(Chat senderChat) {
        this.senderChat = senderChat;
        return this;
    }

    public String getAuthorSignature() {
        return authorSignature;
    }

    public MessageOrigin setAuthorSignature(String authorSignature) {
        this.authorSignature = authorSignature;
        return this;
    }

    public Integer getMessageId() {
        return messageId;
    }

    public MessageOrigin setMessageId(Integer messageId) {
        this.messageId = messageId;
        return this;
    }
}