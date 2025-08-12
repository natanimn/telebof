package io.github.natanimn.types.keyboard;

import io.github.natanimn.types.chat_and_user.ChatAdministratorRights;

import java.io.Serializable;

/**
 * This object defines the criteria used to request a suitable chat.
 * Information about the selected chat will be shared with the bot when the corresponding button is pressed.
 * The bot will be granted requested rights in the chat if appropriate.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 * @since <a href="https://core.telegram.org/bots/features#chat-and-user-selection">More about requesting chats ».</a>
 */
public class KeyboardButtonRequestChat implements Serializable {
    private ChatAdministratorRights user_administrator_rights, bot_administrator_rights;
    private Boolean bot_is_member, chat_is_forum, chat_has_username, chat_is_created, chat_is_channel, request_name,
    request_title, request_username, request_photo;
    private Integer request_id;

    /**
     * Required
     * @param request_id Signed 32-bit identifier of the request, which will be received back in the {@link io.github.natanimn.types.chat_and_user.ChatShared} object.
     *                   Must be unique within the message
     * @param chat_is_channel Pass True to request a channel chat, pass False to request a group or a supergroup chat.
     */
    public KeyboardButtonRequestChat(int request_id, boolean chat_is_channel) {
        this.request_id = request_id;
        this.chat_is_channel = chat_is_channel;

    }

    /**
     * Optional
     * @param chat_is_forum Pass True to request a forum supergroup, pass False to request a non-forum chat.
     *                      If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat chatIsForum(boolean chat_is_forum) {
        this.chat_is_forum = chat_is_forum;
        return this;
    }

    /**
     * Optional
     * @param chat_has_username Pass True to request a supergroup or a channel with a username, pass False to request a chat without a username.
     *                          If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat chatHasUsername(boolean chat_has_username) {
        this.chat_has_username = chat_has_username;
        return this;
    }

    /**
     * Optional
     * @param chat_is_created Pass True to request a chat owned by the user. Otherwise, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat chatIsCreated(boolean chat_is_created) {
        this.chat_is_created = chat_is_created;
        return this;
    }

    /**
     * Optional
     * @param user_administrator_rights A JSON-serialized object listing the required administrator rights of the user in the chat.
     *                                  The rights must be a superset of bot_administrator_rights.
     *                                  If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat userAdministratorRights(ChatAdministratorRights user_administrator_rights) {
        this.user_administrator_rights = user_administrator_rights;
        return this;
    }

    /**
     * Optional
     * @param bot_administrator_rights A JSON-serialized object listing the required administrator rights of the bot in the chat.
     *                                 The rights must be a subset of {@link #userAdministratorRights(ChatAdministratorRights)}. If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat botAdministratorRights(ChatAdministratorRights bot_administrator_rights) {
        this.bot_administrator_rights = bot_administrator_rights;
        return this;
    }

    /**
     * Optional
     * @param bot_is_member Pass True to request a chat with the bot as a member. Otherwise, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat botIsMember(boolean bot_is_member) {
        this.bot_is_member = bot_is_member;
        return this;
    }

    /**
     * Optional
     * @param request_title Pass True to request the chat's title
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat requestTitle(boolean request_title){
        this.request_title = request_title;
        return this;
    }

    /**
     * Optional
     * @param request_username Pass True to request the chat's username
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat requestUsername(boolean request_username){
        this.request_username = request_username;
        return this;
    }

    /**
     * Optional
     * @param request_photo Pass True to request the chat's photo
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat requestPhoto(boolean request_photo){
        this.request_photo = request_photo;
        return this;
    }

}
