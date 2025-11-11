package io.github.natanimn.telebof.types.web;

import com.google.gson.annotations.SerializedName;

/**
 * Describes data sent from a <a href="https://core.telegram.org/bots/webapps">Web App</a> to the bot.
 *
 * @param data The data. Be aware that a bad client can send arbitrary data in this field.
 * @param buttonText Text of the web_app keyboard button from which the Web App was opened. Be aware that a bad client can send arbitrary data in this field.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record WebAppData(
        String data,
        @SerializedName("button_text") String buttonText
) {}