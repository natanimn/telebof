package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

import java.util.List;

/**
 * This object describes the access settings of a bot.
 * @author Natanim
 * @since 2.0.0
 */
@Getter
public class BotAccessSettings {
    /**
     * True, if only selected users can access the bot. The bot's owner can always access it.
     */
    @SerializedName("is_access_restricted")
    private Boolean isAccessRestricted;

    /**
     * Optional. The list of other users who have access to the bot if the access is restricted
     */
    @SerializedName("added_users")
    private List<User> addedUsers;

}
