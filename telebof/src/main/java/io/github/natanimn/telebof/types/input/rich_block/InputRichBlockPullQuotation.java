package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A quotation with centered text, loosely corresponding to the HTML tag <aside>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockPullQuotation implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "pullquote";

    private final String text;

    private String credit;

    /**
     * Required
     * @param text Text of the block
     */
    public InputRichBlockPullQuotation(String text){
        this.text = text;
    }

    /**
     * Optional
     * @param credit Credit of the block
     * @return {@link InputRichBlockPullQuotation}
     */
    public InputRichBlockPullQuotation setCredit(String credit) {
        this.credit = credit;
        return this;
    }
}
