package io.github.natanimn.telebof.types.input.rich_block;

/**
 * A block with a “Thinking…” placeholder, corresponding to the custom HTML tag <tg-thinking>.
 * The block may be used only in sendRichMessageDraft, therefore it can't be received in messages.
 * See <a href="https://t.me/addemoji/AIActions">...</a> for examples of custom emoji that are recommended for usage in the block.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockThinking implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "thinking";

    private final String text;

    /**
     * Required
     * @param text Text of the block.
     *             See <a href="https://t.me/addemoji/AIActions">...</a> for examples of custom emoji that are recommended for usage in the block.
     */
    public InputRichBlockThinking(String text){
        this.text = text;
    }
}
