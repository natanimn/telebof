package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.business.BusinessBotRights;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * Describes the connection of the bot with a business account.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class BusinessConnection implements TelegramUpdate, JsonFormatter {
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

}