package io.github.natanimn.telebof.types.web;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * Describes data sent from a <a href="https://core.telegram.org/bots/webapps">Web App</a> to the bot.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}