package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A superscript text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextSuperscript implements RichText {
    /**
     * Type of the rich text, always “superscript”
     */
    private final String type = "superscript";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextSuperscript(String text){
        this.text = new RichTextImpl(text, type);
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextSuperscript(RichText text){
        this.text = text;
    }
}
