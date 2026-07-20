package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.input.InputMediaAnimation;
import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A block with an animation, corresponding to the HTML tag <video>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockAnimation implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "animation";

    private final InputMediaAnimation animation;

    private RichBlockCaption caption;

    /**
     * Required
     * @param animation The animation. Caption is ignored.
     */
    public InputRichBlockAnimation(InputMediaAnimation animation){
        this.animation = animation;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockAnimation}
     */
    public InputRichBlockAnimation setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
