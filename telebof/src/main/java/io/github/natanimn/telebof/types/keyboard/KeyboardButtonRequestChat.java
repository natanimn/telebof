package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.chat_and_user.ChatAdministratorRights;

import java.io.Serializable;

/**
 * This object defines the criteria used to request a suitable chat.
 * Information about the selected chat will be shared with the bot when the corresponding button is pressed.
 * The bot will be granted requested rights in the chat if appropriate.
 * @author Natanim 
 * @since 3 March 2025
 * @version 1.3.0
 * @since <a href="https://core.telegram.org/bots/features#chat-and-user-selection">More about requesting chats ».</a>
 */
public class KeyboardButtonRequestChat implements Serializable {

    @SerializedName("user_administrator_rights")
    private ChatAdministratorRights userAdministratorRights;

    @SerializedName("bot_administrator_rights")
    private ChatAdministratorRights botAdministratorRights;

    @SerializedName("bot_is_member")
    private Boolean botIsMember;

    @SerializedName("chat_is_forum")
    private Boolean chatIsForum;

    @SerializedName("chat_has_username")
    private Boolean chatHasUsername;

    @SerializedName("chat_is_created")
    private Boolean chatIsCreated;

    @SerializedName("chat_is_channel")
    private Boolean chatIsChannel;

    @SerializedName("request_name")
    private Boolean requestName;

    @SerializedName("request_title")
    private Boolean requestTitle;

    @SerializedName("request_username")
    private Boolean requestUsername;

    @SerializedName("request_photo")
    private Boolean requestPhoto;

    @SerializedName("request_id")
    private Long requestId;

    /**
     * Required
     * @param requestId Signed 32-bit identifier of the request, which will be received back in the {@link io.github.natanimn.telebof.types.chat_and_user.ChatShared} object.
     *                   Must be unique within the message
     * @param chatIsChannel Pass True to request a channel chat, pass False to request a group or a supergroup chat.
     */
    public KeyboardButtonRequestChat(Long requestId, boolean chatIsChannel) {
        this.requestId = requestId;
        this.chatIsCreated = chatIsChannel;

    }

    /**
     * Optional
     * @param chatIsForum Pass True to request a forum supergroup, pass False to request a non-forum chat.
     *                      If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setChatIsForum(boolean chatIsForum) {
        this.chatIsForum = chatIsForum;
        return this;
    }

    /**
     * Optional
     * @param chatHasUsername Pass True to request a supergroup or a channel with a username, pass False to request a chat without a username.
     *                          If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setChatHasUsername(boolean chatHasUsername) {
        this.chatHasUsername = chatHasUsername;
        return this;
    }

    /**
     * Optional
     * @param chatIsCreated Pass True to request a chat owned by the user. Otherwise, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setChatIsCreated(boolean chatIsCreated) {
        this.chatIsCreated = chatIsCreated;
        return this;
    }

    /**
     * Optional
     * @param userAdministratorRights A JSON-serialized object listing the required administrator rights of the user in the chat.
     *                                  The rights must be a superset of bot_administrator_rights.
     *                                  If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setUserAdministratorRights(ChatAdministratorRights userAdministratorRights) {
        this.userAdministratorRights = userAdministratorRights;
        return this;
    }

    /**
     * Optional
     * @param botAdministratorRights A JSON-serialized object listing the required administrator rights of the bot in the chat.
     *                                 The rights must be a subset of {@link #setUserAdministratorRights(ChatAdministratorRights)}. If not specified, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setBotAdministratorRights(ChatAdministratorRights botAdministratorRights) {
        this.botAdministratorRights = botAdministratorRights;
        return this;
    }

    /**
     * Optional
     * @param botIsMember Pass True to request a chat with the bot as a member. Otherwise, no additional restrictions are applied.
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setBotIsMember(boolean botIsMember) {
        this.botIsMember = botIsMember;
        return this;
    }

    /**
     * Optional
     * @param requestTitle Pass True to request the chat's title
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setRequestTitle(boolean requestTitle){
        this.requestTitle = requestTitle;
        return this;
    }

    /**
     * Optional
     * @param requestUsername Pass True to request the chat's username
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setRequestUsername(boolean requestUsername){
        this.requestUsername = requestUsername;
        return this;
    }

    /**
     * Optional
     * @param requestPhoto Pass True to request the chat's photo
     * @return {@link KeyboardButtonRequestChat}
     */
    public KeyboardButtonRequestChat setRequestPhoto(boolean requestPhoto){
        this.requestPhoto = requestPhoto;
        return this;
    }

}
