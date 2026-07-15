package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.chat_and_user.ChatInviteLink;
import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * Represents a join request sent to a chat.
 * @author Natanim
 * @since 0.1
 */
public class ChatJoinRequest implements TelegramUpdate {
    /**
     * Chat to which the request was sent
     */
    private Chat chat;

    /**
     * User that sent the join request
     */
    private User from;

    /**
     * Identifier of a private chat with the user who sent the join request.
     */
    @SerializedName("user_chat_id")
    private Long userChatId;

    /**
     * Date the request was sent in Unix time
     */
    private Integer date;

    /**
     * Bio of the user.
     */
    private String bio;

    /**
     * Chat invite link that was used by the user to send the join request
     */
    @SerializedName("invite_link")
    private ChatInviteLink inviteLink;

    /**
     * Optional. Identifier of the join request query; for bots assigned to process join request only.
     * If present, then the bot must call sendChatJoinRequestWebApp or directly call answerChatJoinRequestQuery within 10 seconds.
     */
    @SerializedName("query_id")
    private String queryId;

    public Chat getChat() {
        return chat;
    }

    public User getFrom() {
        return from;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public String getBio() {
        return bio;
    }

    public ChatInviteLink getInviteLink() {
        return inviteLink;
    }

    public String getQueryId() {
        return queryId;
    }
}