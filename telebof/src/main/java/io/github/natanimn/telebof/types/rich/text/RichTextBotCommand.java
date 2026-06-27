package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A bot command.
 * @author Natanim
 * @since 2.1
 */
public class RichTextBotCommand implements RichText {
    /**
     * Type of the rich text, always “bot_command”
     */
    private final String type = "bot_command";


    private final RichText text;

    @SerializedName("bot_command")
    private final String botCommand;

    /**
     * Required
     * @param text The text
     * @param botCommand The bot command
     */
    public RichTextBotCommand(String text, String botCommand){
        this.text = new RichTextImpl(text, type);
        this.botCommand = botCommand;
    }

    /**
     * Required
     * @param text The text
     * @param botCommand The bot command
     */
    public RichTextBotCommand(RichText text, String botCommand){
        this.text = text;
        this.botCommand = botCommand;
    }
}
