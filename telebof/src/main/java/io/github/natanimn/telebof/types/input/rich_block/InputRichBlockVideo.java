package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.input.InputMediaVideo;
import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A block with a video, corresponding to the HTML tag <video>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockVideo implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "video";

    private final InputMediaVideo video;

    private RichBlockCaption caption;

    /**
     * Required
     * @param video The video. Caption is ignored.
     */
    public InputRichBlockVideo(InputMediaVideo video){
        this.video = video;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockVideo}
     */
    public InputRichBlockVideo setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
