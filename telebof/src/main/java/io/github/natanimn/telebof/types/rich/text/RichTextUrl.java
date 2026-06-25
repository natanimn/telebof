package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A text with a link.
 * @author Natanim
 * @since 2.1
 */
public class RichTextUrl implements RichText {
    /**
     * Type of the rich text, always “url”
     */
    private final String type = "url";

    private final RichText text;

    private final String url;

    /**
     * Required
     * @param text The text
     * @param url URL of the link
     */
    public RichTextUrl(String text, String url){
        this.text = new RichTextImpl(text, type);
        this.url = url;
    }

    /**
     * Required
     * @param text The text
     * @param url URL of the link
     */
    public RichTextUrl(RichText text, String url){
        this.text = text;
        this.url = url;
    }
}
