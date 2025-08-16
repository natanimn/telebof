package io.github.natanimn.telebof.types.chat_and_user;

import java.util.Objects;
import io.github.natanimn.telebof.Util;
import io.github.natanimn.telebof.BotContext;

/**
 * This object represents a Telegram user or bot.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class User {
    /**
     * Unique identifier for this user or bot.
     */
    public Long id;

    /**
     * True, if this user is a bot
     */
    public Boolean is_bot;

    /**
     * User's or bot's first name
     */
    public String first_name;

    /**
     * Optional. User's or bot's last name
     */
    public String last_name;

    /**
     * Optional.<a href="https://en.wikipedia.org/wiki/IETF_language_tag">IETF language tag </a> of the user's language
     */
    public String language_code;

    /**
     * Optional. User's or bot's username
     */
    public String username;

    /**
     * Optional. True, if this user is a Telegram Premium user
     */
    public Boolean is_premium;

    /**
     * Optional. True, if this user added the bot to the attachment menu
     */
    public Boolean added_to_attachment_menu;

    /**
     * Optional. True, if the bot can be invited to groups. Returned only in {@link BotContext#getMe}.
     */
    public Boolean can_join_groups;

    /**
     * Optional. True, if privacy mode is disabled for the bot. Returned only in getMe.
     */
    public Boolean can_read_all_group_messages;

    /**
     * Optional. True, if the bot supports inline queries. Returned only in {@link BotContext#getMe}.
     */
    public Boolean supports_inline_queries;

    /**
     * Optional. True, if the bot can be connected to a Telegram Business account to receive its messages. Returned only in {@link BotContext#getMe}.
     */
    public Boolean can_connect_to_business;

    /**
     * Optional. True, if the bot has a main Web App. Returned only in {@link BotContext#getMe}.
     */
    public Boolean has_main_web_app;


    public String mention(){
        // Do not forget to set parseMode to ParseMode.HTML
        String name = Util.escapeHtml(first_name + (last_name != null ? last_name : ""));
        return String.format("<a href='tg://user?id=%d'>%s</a>", id, name);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        User user = (User) object;
        return id == user.id && Objects.equals(is_bot, user.is_bot) && Objects.equals(is_premium, user.is_premium) &&
                Objects.equals(added_to_attachment_menu, user.added_to_attachment_menu) &&
                Objects.equals(can_join_groups, user.can_join_groups) &&
                Objects.equals(can_read_all_group_messages, user.can_read_all_group_messages) &&
                Objects.equals(supports_inline_queries, user.supports_inline_queries) &&
                Objects.equals(can_connect_to_business, user.can_connect_to_business) &&
                Objects.equals(first_name, user.first_name) && Objects.equals(last_name, user.last_name) &&
                Objects.equals(language_code, user.language_code) && Objects.equals(username, user.username) &&
                Objects.equals(has_main_web_app, user.has_main_web_app);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, is_bot, is_premium, added_to_attachment_menu, can_join_groups,
                can_read_all_group_messages, supports_inline_queries, can_connect_to_business, first_name, last_name,
                language_code, username, has_main_web_app);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", is_bot=" + is_bot +
                ", is_premium=" + is_premium +
                ", added_to_attachment_menu=" + added_to_attachment_menu +
                ", can_join_groups=" + can_join_groups +
                ", has_main_web_app=" + has_main_web_app +
                ", can_read_all_group_messages=" + can_read_all_group_messages +
                ", supports_inline_queries=" + supports_inline_queries +
                ", can_connect_to_business=" + can_connect_to_business +
                ", first_name='" + first_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", language_code='" + language_code + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}


