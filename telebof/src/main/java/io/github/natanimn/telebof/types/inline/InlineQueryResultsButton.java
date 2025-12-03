package io.github.natanimn.telebof.types.inline;

import io.github.natanimn.telebof.types.web.WebAppInfo;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object represents a button to be shown above inline query results. You must use exactly one of the optional fields.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class InlineQueryResultsButton implements Serializable {
    private String text;
    @SerializedName("start_parameter")
    private String startParameter;
    @SerializedName("web_app_info")
    private WebAppInfo webAppInfo;

    /**
     * Required
     * @param text Label text on the button
     */
    public InlineQueryResultsButton(String text){
        this.text = text;
    }

    /**
     * Optional
     * @param webAppInfo Description of the Web App that will be launched when the user presses the button.
     *                     The Web App will be able to switch back to the inline mode using the method switchInlineQuery inside the Web App.
     * @return {@link InlineQueryResultsButton}
     */
    public InlineQueryResultsButton setWebAppInfo(WebAppInfo webAppInfo){
        this.webAppInfo = webAppInfo;
        return this;
    }

    /**
     * Optional
     * @param startParameter <a href="https://core.telegram.org/bots/features#deep-linking">Deep-linking parameter</a> for the /start message sent to the bot when a user presses the button.
     *                         1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @return {@link InlineQueryResultsButton}
     */
    public InlineQueryResultsButton setStartParameter(String startParameter){
        this.startParameter = startParameter;
        return this;
    }
}