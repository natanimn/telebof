package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.input.InputMediaPhoto;
import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A block with a photo, corresponding to the HTML tag <img>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockPhoto implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "photo";

    private final InputMediaPhoto photo;

    private RichBlockCaption caption;

    /**
     * Required
     * @param photo The photo. Caption is ignored.
     */
    public InputRichBlockPhoto(InputMediaPhoto photo){
        this.photo = photo;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockPhoto}
     */
    public InputRichBlockPhoto setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
