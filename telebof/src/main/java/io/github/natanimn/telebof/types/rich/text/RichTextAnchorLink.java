package io.github.natanimn.telebof.types.rich.text;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;

/**
 * A link to an anchor.
 * @author Natanim
 * @since 2.1
 */
public class RichTextAnchorLink implements RichText {
    /**
     * Type of the rich text, always “anchor_link”
     */
    private final String type = "anchor_link";

    private final RichText text;

    @SerializedName("anchor_name")
    private final String anchorName;

    /**
     * Required
     * @param text The link text
     * @param anchorName The name of the anchor. If the name is empty, then the link brings back to the top of the message.
     */
    public RichTextAnchorLink(String text, String anchorName){
        this.text = new RichTextImpl(text, type);
        this.anchorName = anchorName;
    }

    /**
     * Required
     * @param text The link text
     * @param anchorName The name of the anchor. If the name is empty, then the link brings back to the top of the message.
     */
    public RichTextAnchorLink(RichText text, String anchorName){
        this.text = text;
        this.anchorName = anchorName;
    }
}
