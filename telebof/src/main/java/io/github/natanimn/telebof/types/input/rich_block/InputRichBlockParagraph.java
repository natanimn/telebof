package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A text paragraph, corresponding to the HTML tag <p>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockParagraph implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "paragraph";

    private final String text;

    /**
     * Required
     * @param text Text of the block
     */
    public InputRichBlockParagraph(String text){
        this.text = text;
    }
}
