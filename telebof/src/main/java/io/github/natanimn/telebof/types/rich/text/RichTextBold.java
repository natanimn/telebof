package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A bold text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextBold implements RichText {
    /**
     * Type of the rich text, always “bold”
     */
    private final String type = "bold";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextBold(RichText text){
        this.text = text;
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextBold(String text){
        this.text = new RichTextImpl(type, text);
    }
}
