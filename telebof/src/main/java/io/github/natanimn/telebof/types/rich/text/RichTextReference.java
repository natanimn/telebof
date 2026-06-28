package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A reference.
 * @author Natanim
 * @since 2.1
 */
public class RichTextReference implements RichText {
    /**
     * Type of the rich text, always “reference”
     */
    private final String type = "reference";

    private final RichText text;
    private final String name;

    /**
     * Required
     * @param text Text of the reference
     * @param name The name of the reference
     */
    public RichTextReference(String text, String name){
        this.text = new RichTextImpl(text, type);
        this.name = name;
    }

    /**
     * Required
     * @param text Text of the reference
     * @param name The name of the reference
     */
    public RichTextReference(RichText text, String name){
        this.text = text;
        this.name = name;
    }
}
