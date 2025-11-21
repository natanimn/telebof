package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.business.BusinessBotRights;
import io.github.natanimn.telebof.types.chat_and_user.User;
import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Describes the connection of the bot with a business account.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BusinessConnection implements TelegramUpdate {
    /**
     * Unique identifier of the business connection
     */
    private String id;

    /**
     * Business account user that created the business connection
     */
    private User user;

    /**
     * Identifier of a private chat with the user who created the business connection
     */
    @SerializedName("user_chat_id")
    private Long userChatId;

    /**
     * Date the connection was established in Unix time
     */
    private Integer date;

    /**
     * Optional. Rights of the business bot
     */
    private BusinessBotRights rights;

    /**
     * True, if the connection is active
     */
    @SerializedName("is_enabled")
    private Boolean isEnabled;

    public String getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public Long getUserChatId() {
        return userChatId;
    }

    public Integer getDate() {
        return date;
    }

    public BusinessBotRights getRights() {
        return rights;
    }

    public Boolean getIsEnabled() {
        return isEnabled;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        BusinessConnection that = (BusinessConnection) object;
        return Objects.equals(id, that.id) &&
                Objects.equals(user, that.user) &&
                Objects.equals(userChatId, that.userChatId) &&
                Objects.equals(date, that.date) &&
                Objects.equals(rights, that.rights) &&
                Objects.equals(isEnabled, that.isEnabled);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, userChatId, date, rights, isEnabled);
    }

    @Override
    public String toString() {
        return "BusinessConnection{" +
                "id='" + id + '\'' +
                ", user=" + user +
                ", userChatId=" + userChatId +
                ", date=" + date +
                ", rights=" + rights +
                ", isEnabled=" + isEnabled +
                '}';
    }
}