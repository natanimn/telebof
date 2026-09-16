package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * This object represents a bot command.
 * @author Natanim
 * @since 0.1
 */
@Getter
@RequiredArgsConstructor
@Setter
@Accessors(chain = true)
public class BotCommand implements Serializable {
    /**
     * Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and underscores.
     */
    private final String command;

    /**
     * Description of the command; 1-256 characters.
     */
    private final String description;

    /**
     * Optional
     * True, if the command sends an ephemeral message, which can be seen only by the sender of the message and the bot
     */
    @SerializedName("is_ephemeral")
    private Boolean isEphemeral;

}