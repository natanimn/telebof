package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A text covered by a spoiler.
 * @author Natanim
 * @since 2.1
 */
public class RichTextSpoiler implements RichText {
    /**
     * Type of the rich text, always “spoiler”
     */
    private final String type = "spoiler";

    private final RichText text;

    /**
     * Required
     * @param text The text
     */
    public RichTextSpoiler(String text){
        this.text = new RichTextImpl(text, type);
    }

    /**
     * Required
     * @param text The text
     */
    public RichTextSpoiler(RichText text){
        this.text = text;
    }

}
