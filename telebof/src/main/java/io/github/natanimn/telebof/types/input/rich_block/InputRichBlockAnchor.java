package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A block with an anchor, corresponding to the HTML tag <a> with the attribute name.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockAnchor implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "anchor";

    private final String name;

    /**
     * Required
     * @param name name of the anchor
     */
    public InputRichBlockAnchor(String name){
        this.name = name;
    }
}
