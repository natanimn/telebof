package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A collage, corresponding to the custom HTML tag <tg-collage>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockCollage implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "collage";

    private final InputRichBlock[] blocks;

    private RichBlockCaption caption;

    /**
     * Required
     * @param blocks Elements of the collage
     */
    public InputRichBlockCollage(InputRichBlock[] blocks){
        this.blocks = blocks;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockCollage}
     */
    public InputRichBlockCollage setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
