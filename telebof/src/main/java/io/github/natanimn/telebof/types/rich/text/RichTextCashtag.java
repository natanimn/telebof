package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A cashtag.
 * @author Natanim
 * @since 2.1
 */
public class RichTextCashtag implements RichText {
    /**
     * Type of the rich text, always “cashtag”
     */
    private final String type = "cashtag";

    private final RichText text;
    private final String cashtag;

    /**
     * Required
     * @param text The text
     * @param cashtag The cashtag
     */
    public RichTextCashtag(String text, String cashtag){
        this.text = new RichTextImpl(text, type);
        this.cashtag = cashtag;
    }

    /**
     * Required
     * @param text The text
     * @param cashtag The cashtag
     */
    public RichTextCashtag(RichText text, String cashtag){
        this.text = text;
        this.cashtag = cashtag;
    }
}
