package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A slideshow, corresponding to the custom HTML tag <tg-slideshow>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockSlideshow implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "slideshow";

    private final InputRichBlock[] blocks;

    private RichBlockCaption caption;

    /**
     * Required
     * @param blocks Elements of the collage
     */
    public InputRichBlockSlideshow(InputRichBlock[] blocks){
        this.blocks = blocks;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockSlideshow}
     */
    public InputRichBlockSlideshow setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
