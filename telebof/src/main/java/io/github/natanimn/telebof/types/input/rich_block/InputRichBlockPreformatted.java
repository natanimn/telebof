package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A preformatted text block, corresponding to the nested HTML tags <pre> and <code>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockPreformatted implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "pre";

    private final String text;

    private String language;

    /**
     * Required
     * @param text Text of the block
     */
    public InputRichBlockPreformatted(String text){
        this.text = text;
    }

    /**
     * Optional
     * @param language The programming language of the text
     * @return {@link InputRichBlockPreformatted}
     */
    public InputRichBlockPreformatted setLanguage(String language) {
        this.language = language;
        return this;
    }
}
