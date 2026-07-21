package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

/**
 * This object represents a bot command.
 * @author Natanim
 * @since 0.1
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

    @SerializedName("is_ephemeral")
    private Boolean isEphemeral;

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

    public Boolean getIsEphemeral() {
        return isEphemeral;
    }

    /**
     * Optional
     * @param ephemeral True, if the command sends an ephemeral message, which can be seen only by the sender of the message and the bot
     */
    public BotCommand setIsEphemeral(Boolean ephemeral) {
        isEphemeral = ephemeral;
        return this;
    }
}