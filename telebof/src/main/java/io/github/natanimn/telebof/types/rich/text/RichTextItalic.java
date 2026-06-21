package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * An italicized text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextItalic implements RichText {
    /**
     * Type of the rich text, always “italic”
     */
    private final String type = "italic";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextItalic(RichText text){
        this.text = text;
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextItalic(String text){
        this.text = new RichTextImpl(type, text);
    }
}
