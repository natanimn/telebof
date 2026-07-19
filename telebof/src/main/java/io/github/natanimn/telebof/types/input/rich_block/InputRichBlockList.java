package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.input.InputRichBlockListItem;

/**
 * A list of blocks, corresponding to the HTML tag <ul> or <ol> with multiple nested tags <li>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockList implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "list";

    private final InputRichBlockListItem[] items;

    /**
     * Required
     * @param items items of the list
     */
    public InputRichBlockList(InputRichBlockListItem[] items){
        this.items = items;
    }
}
