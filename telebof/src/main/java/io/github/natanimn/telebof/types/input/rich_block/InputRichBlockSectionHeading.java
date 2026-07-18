package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A section heading, corresponding to the HTML tags <h1>, <h2>, <h3>, <h4>, <h5>, or <h6>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockSectionHeading implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "heading";

    private final String text;
    private final int size;

    /**
     * Required
     * @param text Text of the block
     * @param size Relative size of the text font; 1-6, 1 is the largest, 6 is the smallest
     */
    public InputRichBlockSectionHeading(String text, int size){
        this.text = text;
        this.size = size;
    }
}
