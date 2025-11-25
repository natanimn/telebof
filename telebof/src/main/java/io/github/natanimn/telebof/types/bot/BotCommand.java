package io.github.natanimn.telebof.types.bot;

import java.io.Serializable;

/**
 * This object represents a bot command.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class BotCommand implements Serializable {
    /**
     * Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and underscores.
     */
    private String command;

    /**
     * Description of the command; 1-256 characters.
     */
    private String description;

    public BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

    public String getCommand() {
        return command;
    }

    public String getDescription() {
        return description;
    }


}