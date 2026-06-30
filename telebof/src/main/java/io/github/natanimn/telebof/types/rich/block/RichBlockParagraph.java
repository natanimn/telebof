package io.github.natanimn.telebof.types.rich.block;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;
import io.github.natanimn.telebof.types.rich.RichBlock;

/**
 * A text paragraph, corresponding to the HTML tag <p>.
 * @author Natanim
 * @since 2.1
 */
public class RichBlockParagraph implements RichBlock {
    /**
     * Type of the block, always “paragraph”
     */
    private final String type = "paragraph";


    private final RichText text;

    /**
     * Required
     * @param text Text of the block
     */
    public RichBlockParagraph(RichText text){
        this.text = text;
    }

    /**
     * Required
     * @param text Text of the block
     */
    public RichBlockParagraph(String text){
        this.text = new RichTextImpl(type, text);
    }
}
