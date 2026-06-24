package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A marked text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextMarked implements RichText {
    /**
     * Type of the rich text, always “marked”
     */
    private final String type = "marked";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextMarked(String text){
        this.text = new RichTextImpl(text, type);
    }

    public RichTextMarked(RichText text){
        this.text = text;
    }


}
