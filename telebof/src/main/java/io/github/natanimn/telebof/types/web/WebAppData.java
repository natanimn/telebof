package io.github.natanimn.telebof.types.web;

import com.google.gson.annotations.SerializedName;

/**
 * Describes data sent from a <a href="https://core.telegram.org/bots/webapps">Web App</a> to the bot.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class WebAppData {
    /**
     * The data. Be aware that a bad client can send arbitrary data in this field.
     */
    private String data;

    /**
     * Text of the web_app keyboard button from which the Web App was opened. Be aware that a bad client can send arbitrary data in this field.
     */
    @SerializedName("button_text")
    private String buttonText;

    public String getData() {
        return data;
    }

    public String getButtonText() {
        return buttonText;
    }
}