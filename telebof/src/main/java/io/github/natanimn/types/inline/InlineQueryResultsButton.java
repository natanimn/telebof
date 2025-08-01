package io.github.natanimn.types.inline;

import io.github.natanimn.types.web.WebAppInfo;

import java.io.Serializable;
import java.util.Objects;

/**
 * This object represents a button to be shown above inline query results. You must use exactly one of the optional fields.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class InlineQueryResultsButton implements Serializable {
    private String text;
    private String start_parameter;
    private WebAppInfo web_app_info;

    /**
     * Required
     * @param text Label text on the button
     */
    public InlineQueryResultsButton(String text){
        this.text = text;
    }

    /**
     * Optional
     * @param web_app_info Description of the Web App that will be launched when the user presses the button.
     *                     The Web App will be able to switch back to the inline mode using the method switchInlineQuery inside the Web App.
     * @return {@link InlineQueryResultsButton}
     */
    public InlineQueryResultsButton webAppInfo(WebAppInfo web_app_info){
        this.web_app_info = web_app_info;
        return this;
    }

    /**
     * Optional
     * @param start_parameter <a href="https://core.telegram.org/bots/features#deep-linking">Deep-linking parameter</a> for the /start message sent to the bot when a user presses the button.
     *                         1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @return {@link InlineQueryResultsButton}
     */
    public InlineQueryResultsButton startParameter(String start_parameter){
        this.start_parameter = start_parameter;
        return this;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        InlineQueryResultsButton that = (InlineQueryResultsButton) object;
        return Objects.equals(text, that.text) &&
                Objects.equals(start_parameter, that.start_parameter) &&
                Objects.equals(web_app_info, that.web_app_info);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, start_parameter, web_app_info);
    }
}
