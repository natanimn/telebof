package io.github.natanimn.telebof.types.rich.block;

import io.github.natanimn.telebof.types.rich.RichText;
import io.github.natanimn.telebof.types.rich.RichTextImpl;
import io.github.natanimn.telebof.types.rich.RichBlock;

/**
 * A section heading, corresponding to the HTML tags <h1>, <h2>, <h3>, <h4>, <h5>, or <h6>.
 * @author Natanim
 * @since 2.1
 */
public class RichBlockSectionHeading implements RichBlock {
    /**
     * Type of the block, always “heading”
     */
    private final String type = "heading";


    private final RichText text;

    private final int size;

    /**
     * Required
     * @param text Text of the block
     * @param size Relative size of the text font; 1-6, 1 is the largest, 6 is the smallest
     */
    public RichBlockSectionHeading(RichText text, int size){
        this.text = text;
        this.size = size;
    }

    /**
     * Required
     * @param text Text of the block
     * @param size Relative size of the text font; 1-6, 1 is the largest, 6 is the smallest
     */
    public RichBlockSectionHeading(String text, int size){
        this.text = new RichTextImpl(type, text);
        this.size = size;
    }

}
