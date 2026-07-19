package io.github.natanimn.telebof.types.input.rich_block;

import com.google.gson.annotations.SerializedName;

/**
 * An expandable block for details disclosure, corresponding to the HTML tag <details>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockDetails implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "details";

    private final String summary;
    private final InputRichBlock[] blocks;

    @SerializedName("is_open")
    private Boolean isOpen;

    /**
     * Required
     * @param summary Always shown summary of the block
     * @param blocks Content of the block
     */
    public InputRichBlockDetails(String summary, InputRichBlock[] blocks){
        this.summary = summary;
        this.blocks = blocks;
    }

    /**
     * Optional
     * @param open Pass True if the content of the block is visible by default
     * @return {@link InputRichBlockBlockQuotation}
     */
    public InputRichBlockDetails setOpen(Boolean open) {
        this.isOpen = open;
        return this;
    }
}
