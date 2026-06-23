package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A subscript text.
 * @author Natanim
 * @since 2.1
 */
public class RichTextSubscript implements RichText {
    /**
     * Type of the rich text, always “subscript”
     */
    private final String type = "subscript";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextSubscript(String text){
        this.text = new RichTextImpl(text, type);
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextSubscript(RichText text){
        this.text = text;
    }
}
