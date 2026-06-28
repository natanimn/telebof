package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;

/**
 * An anchor.
 * @author Natanim
 * @since 2.1
 */
public class RichTextAnchor implements RichText {
    /**
     * Type of the rich text, always “anchor”
     */
    private final String type = "anchor";

    private final String name;

    /**
     * Required
     * @param name The name of the anchor
     */
    public RichTextAnchor(String name){
        this.name = name;
    }
}
