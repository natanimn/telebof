package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A block quotation, corresponding to the HTML tag <blockquote>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockBlockQuotation implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "blockquote";

    private final InputRichBlock[] blocks;

    private String credit;

    /**
     * Required
     * @param blocks Content of the block
     */
    public InputRichBlockBlockQuotation(InputRichBlock[] blocks){
        this.blocks = blocks;
    }

    /**
     * Optional
     * @param credit Credit of the block
     * @return {@link InputRichBlockBlockQuotation}
     */
    public InputRichBlockBlockQuotation setCredit(String credit) {
        this.credit = credit;
        return this;
    }
}
