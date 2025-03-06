package io.github.natanimn.types;

import java.io.Serializable;


/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
