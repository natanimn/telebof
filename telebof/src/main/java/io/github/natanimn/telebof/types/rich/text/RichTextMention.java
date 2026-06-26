package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A mention by a username.
 * @author Natanim
 * @since 2.1
 */
public class RichTextMention implements RichText {
    /**
     * Type of the rich text, always “mention”
     */
    private final String type = "mention";

    private final RichText text;

    private final String username;

    /**
     * Required
     * @param text The text
     * @param username The username
     */
    public RichTextMention(String text, String username){
        this.text = new RichTextImpl(text, type);
        this.username = username;
    }

    /**
     * Required
     * @param text The text
     * @param username The username
     */
    public RichTextMention(RichText text, String username){
        this.text = text;
        this.username = username;
    }
}
