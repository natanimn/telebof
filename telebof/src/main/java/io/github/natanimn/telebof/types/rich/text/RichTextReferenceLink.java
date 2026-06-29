package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A link to a reference.
 * @author Natanim
 * @since 2.1
 */
public class RichTextReferenceLink implements RichText {
    /**
     * Type of the rich text, always “reference_link”
     */
    private final String type = "reference_link";

    private final RichText text;

    @SerializedName("reference_name")
    private final String referenceName;

    /**
     * Required
     * @param text The link text
     * @param referenceName The name of the reference
     */
    public RichTextReferenceLink(String text, String referenceName){
        this.text = new RichTextImpl(text, type);
        this.referenceName = referenceName;
    }

    /**
     * Required
     * @param text The link text
     * @param referenceName The name of the reference
     */
    public RichTextReferenceLink(RichText text, String referenceName){
        this.text = text;
        this.referenceName = referenceName;
    }
}
