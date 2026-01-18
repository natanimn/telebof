package io.github.natanimn.telebof.types.keyboard;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * This object represents a parameter of the inline keyboard button used to automatically authorize a user.
 * Serves as a great replacement for the <a href="https://core.telegram.org/widgets/login">Telegram Login Widget</a> when the user is coming from Telegram.
 * All the user needs to do is tap/click a button and confirm that they want to log in:
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class LoginUrl implements Serializable {
    private String url;

    @SerializedName("forward_text")
    private String forwardText;

    @SerializedName("bot_username")
    private String botUsername;

    @SerializedName("request_write_access")
    private Boolean requestWriteAccess;

    /**
     * Required
     * @param url An HTTPS URL to be opened with user authorization data added to the query string when the button is pressed.
     *            If the user refuses to provide authorization data, the original URL without information about the user will be opened.
     *            The data added is the same as described in <a href="https://core.telegram.org/widgets/login#receiving-authorization-data">Receiving authorization data.</a>
     * <br>
     * <b>NOTE:</b> You must always check the hash of the received data to verify the authentication and the integrity of the data as described in <a href="https://core.telegram.org/widgets/login#checking-authorization">Checking authorization.</a>
     */
    public LoginUrl(String url){
        this.url = url;
    }

    /**
     * Optional
     * @param forwardText New text of the button in forwarded messages.
     * @return {@link LoginUrl}
     */
    public LoginUrl setForwardText(String forwardText){
        this.forwardText = forwardText;
        return this;
    }

    /**
     * Optional
     * @param botUsername Username of a bot, which will be used for user authorization.
     *                     If not specified, the current bot's username will be assumed.
     *                     The url's domain must be the same as the domain linked with the bot.
     * @return {@link LoginUrl}
     * @see <a href="https://core.telegram.org/widgets/login#setting-up-a-bot">Setting up a bot for more details.</a>
     * @see <a href="https://core.telegram.org/widgets/login#linking-your-domain-to-the-bot">Linking your domain to the bot for more details.</a>
     */
    public LoginUrl setBotUsername(String botUsername){
        this.botUsername = botUsername;
        return this;
    }

    /**
     * Optional
     * @param requestWriteAccess Pass True to request the permission for your bot to send messages to the user.
     * @return {@link LoginUrl}
     */
    public LoginUrl setRequestWriteAccess(Boolean requestWriteAccess){
        this.requestWriteAccess = requestWriteAccess;
        return this;
    }

}
