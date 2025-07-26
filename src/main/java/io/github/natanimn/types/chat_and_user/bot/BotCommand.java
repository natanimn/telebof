package io.github.natanimn.types.chat_and_user.bot;

import java.io.Serializable;


/**
 * Natanim Negash
 *  3 March 2025
 */
public class BotCommand implements Serializable {
    public String command, description;

    public BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public BotCommand command(String command) {
        this.command = command;
        return this;
    }

    public BotCommand description(String description) {
        this.description = description;
        return this;
    }

}
