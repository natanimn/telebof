package io.github.natanimn.types.bot;

import java.io.Serializable;


/**
 * This object represents a bot command.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public class BotCommand implements Serializable {
    /**
     * Text of the command; 1-32 characters.
     * Can contain only lowercase English letters, digits and underscores.
     */
    public String command;

    /**
     * Description of the command; 1-256 characters.
     */
    public String description;

    /***
     * Initialize bot command
     * @param command Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and underscores.
     * @param description Description of the command; 1-256 characters.
     */
    public BotCommand(String command, String description) {
        this.command = command;
        this.description = description;
    }

}
