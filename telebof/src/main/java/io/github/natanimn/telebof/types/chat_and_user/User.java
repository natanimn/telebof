package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.Util;
import io.github.natanimn.telebof.BotContext;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a Telegram user or bot.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class User {
    /**
     * Unique identifier for this user or bot.
     */
    private Long id;

    /**
     * True, if this user is a bot
     */
    @SerializedName("is_bot")
    private Boolean isBot;

    /**
     * User's or bot's first name
     */
    @SerializedName("first_name")
    private String firstName;

    /**
     * Optional. User's or bot's last name
     */
    @SerializedName("last_name")
    private String lastName;

    /**
     * Optional. IETF language tag of the user's language
     */
    @SerializedName("language_code")
    private String languageCode;

    /**
     * Optional. User's or bot's username
     */
    private String username;

    /**
     * Optional. True, if this user is a Telegram Premium user
     */
    @SerializedName("is_premium")
    private Boolean isPremium;

    /**
     * Optional. True, if this user added the bot to the attachment menu
     */
    @SerializedName("added_to_attachment_menu")
    private Boolean addedToAttachmentMenu;

    /**
     * Optional. True, if the bot can be invited to groups. Returned only in {@link BotContext#getMe}.
     */
    @SerializedName("can_join_groups")
    private Boolean canJoinGroups;

    /**
     * Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
     */
    @SerializedName("can_read_all_group_messages")
    private Boolean canReadAllGroupMessages;

    /**
     * Optional. True, if the bot supports inline queries. Returned only in {@link BotContext#getMe}.
     */
    @SerializedName("supports_inline_queries")
    private Boolean supportsInlineQueries;

    /**
     * Optional. True, if the bot can be connected to a Telegram Business account to receive its messages. Returned only in {@link BotContext#getMe}.
     */
    @SerializedName("can_connect_to_business")
    private Boolean canConnectToBusiness;

    /**
     * Optional. True, if the bot has a main Web App. Returned only in {@link BotContext#getMe}.
     */
    @SerializedName("has_main_web_app")
    private Boolean hasMainWebApp;

    /**
     * Optional. True, if the bot has forum topic mode enabled in private chats. Returned only in {@link BotContext#getMe()}.
     */
    @SerializedName("has_topics_enabled")
    private Boolean hasTopicsEnabled;

    public Long getId() {
        return id;
    }

    public Boolean getIsBot() {
        return isBot;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getLanguageCode() {
        return languageCode;
    }

    public String getUsername() {
        return username;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public Boolean getAddedToAttachmentMenu() {
        return addedToAttachmentMenu;
    }

    public Boolean getCanJoinGroups() {
        return canJoinGroups;
    }

    public Boolean getCanReadAllGroupMessages() {
        return canReadAllGroupMessages;
    }

    public Boolean getSupportsInlineQueries() {
        return supportsInlineQueries;
    }

    public Boolean getCanConnectToBusiness() {
        return canConnectToBusiness;
    }

    public Boolean getHasMainWebApp() {
        return hasMainWebApp;
    }

    public Boolean getHasTopicsEnabled() {
        return hasTopicsEnabled;
    }

    public String mention() {
        // Do not forget to set parseMode to ParseMode.HTML
        String name = Util.escapeHtml(firstName + (lastName != null ? lastName : ""));
        return String.format("<a href='tg://user?id=%d'>%s</a>", id, name);
    }
}