package io.github.natanimn.telebof.types.chat_and_user;

import io.github.natanimn.telebof.Util;
import io.github.natanimn.telebof.BotContext;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a Telegram user or bot.
 * @param id Unique identifier for this user or bot.
 * @param isBot True, if this user is a bot
 * @param firstName User's or bot's first name
 * @param lastName Optional. User's or bot's last name
 * @param languageCode Optional. IETF language tag of the user's language
 * @param username Optional. User's or bot's username
 * @param isPremium Optional. True, if this user is a Telegram Premium user
 * @param addedToAttachmentMenu Optional. True, if this user added the bot to the attachment menu
 * @param canJoinGroups Optional. True, if the bot can be invited to groups. Returned only in {@link BotContext#getMe}.
 * @param canReadAllGroupMessages Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
 * @param supportsInlineQueries Optional. True, if the bot supports inline queries. Returned only in {@link BotContext#getMe}.
 * @param canConnectToBusiness Optional. True, if the bot can be connected to a Telegram Business account to receive its messages. Returned only in {@link BotContext#getMe}.
 * @param hasMainWebApp Optional. True, if the bot has a main Web App. Returned only in {@link BotContext#getMe}.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record User(
        Long id,
        @SerializedName("is_bot") Boolean isBot,
        @SerializedName("first_name") String firstName,
        @SerializedName("last_name") String lastName,
        @SerializedName("language_code") String languageCode,
        String username,
        @SerializedName("is_premium") Boolean isPremium,
        @SerializedName("added_to_attachment_menu") Boolean addedToAttachmentMenu,
        @SerializedName("can_join_groups") Boolean canJoinGroups,
        @SerializedName("can_read_all_group_messages") Boolean canReadAllGroupMessages,
        @SerializedName("supports_inline_queries") Boolean supportsInlineQueries,
        @SerializedName("can_connect_to_business") Boolean canConnectToBusiness,
        @SerializedName("has_main_web_app") Boolean hasMainWebApp
) {

    public String mention() {
        // Do not forget to set parseMode to ParseMode.HTML
        String name = Util.escapeHtml(firstName + (lastName != null ? lastName : ""));
        return String.format("<a href='tg://user?id=%d'>%s</a>", id, name);
    }
}