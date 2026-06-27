package io.github.natanimn.telebof.types.rich.text;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A hashtag.
 * @author Natanim
 * @since 2.1
 */
public class RichTextHashtag implements RichText {
    /**
     * Type of the rich text, always “hashtag”
     */
    private final String type = "hashtag";

    private final RichText text;
    private final String hashtag;

    /**
     * Required
     * @param text The text
     * @param hashtag The hashtag
     */
    public RichTextHashtag(String text, String hashtag){
        this.text = new RichTextImpl(text, type);
        this.hashtag = hashtag;
    }

    /**
     * Required
     * @param text The text
     * @param hashtag The hashtag
     */
    public RichTextHashtag(RichText text, String hashtag){
        this.text = text;
        this.hashtag = hashtag;
    }
}
