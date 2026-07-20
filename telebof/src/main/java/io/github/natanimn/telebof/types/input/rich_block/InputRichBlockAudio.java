package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.input.InputMediaAudio;
import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A block with a music file, corresponding to the HTML tag <audio>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockAudio implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "audio";

    private final InputMediaAudio audio;

    private RichBlockCaption caption;

    /**
     * Required
     * @param audio The audio. Caption is ignored.
     */
    public InputRichBlockAudio(InputMediaAudio audio){
        this.audio = audio;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockAudio}
     */
    public InputRichBlockAudio setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
