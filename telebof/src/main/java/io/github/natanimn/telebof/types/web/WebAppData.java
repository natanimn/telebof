package io.github.natanimn.telebof.types.web;

/**
 * Describes data sent from a <a href="https://core.telegram.org/bots/webapps">Web App</a> to the bot.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class WebAppData {
    /**
     * The data. Be aware that a bad client can send arbitrary data in this field.
     */
    public String data;

    /**
     * Text of the web_app keyboard button from which the Web App was opened. Be aware that a bad client can send arbitrary data in this field.
     */
    public String button_text;
}
