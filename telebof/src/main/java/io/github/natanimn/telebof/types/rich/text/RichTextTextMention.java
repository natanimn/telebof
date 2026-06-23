package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A mention of a Telegram user by their identifier.
 * @author Natanim
 * @since 2.1
 */
public class RichTextTextMention implements RichText {
    /**
     * Type of the rich text, always “text_mention”
     */
    private final String type = "text_mention";

    private final RichText text;

    private final User user;

    /**
     * Required
     * @param text The text
     * @param user The mentioned user
     */
    public RichTextTextMention(String text, User user){
        this.text = new RichTextImpl(text, type);
        this.user = user;
    }

    /**
     * Required
     * @param text The text
     * @param user The mentioned user
     */
    public RichTextTextMention(RichText text, User user){
        this.text = text;
        this.user = user;
    }
}
