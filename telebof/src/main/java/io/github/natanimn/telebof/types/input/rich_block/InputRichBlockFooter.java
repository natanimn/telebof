package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A footer, corresponding to the HTML tag <footer>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockFooter implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "footer";

    private final String text;

    /**
     * Required
     * @param text Text of the block
     */
    public InputRichBlockFooter(String text){
        this.text = text;
    }
}
