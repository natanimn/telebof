package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A strikethrough text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextStrikethrough implements RichText {
    /**
     * Type of the rich text, always “strikethrough”
     */
    private final String type = "strikethrough";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextStrikethrough(RichText text){
        this.text = text;
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextStrikethrough(String text){
        this.text = new RichTextImpl(type, text);
    }
}
