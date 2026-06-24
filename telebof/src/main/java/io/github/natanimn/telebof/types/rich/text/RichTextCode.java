package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A monowidth text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextCode implements RichText {
    /**
     * Type of the rich text, always “code”
     */
    private final String type = "code";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextCode(RichText text){
        this.text = text;
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextCode(String text){
        this.text = new RichTextImpl(type, text);
    }
}
