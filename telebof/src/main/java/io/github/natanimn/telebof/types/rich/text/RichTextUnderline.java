package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * An underline text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextUnderline implements RichText {
    /**
     * Type of the rich text, always “underline”
     */
    private final String type = "underline";


    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextUnderline(String text){
        this.text = new RichTextImpl(text, type);
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextUnderline(RichText text){
        this.text = text;
    }
}
