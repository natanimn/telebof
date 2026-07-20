package io.github.natanimn.telebof.types.input.rich_block;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.input.InputMediaVoiceNote;
import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A block with a voiceNote, corresponding to the HTML tag <audio>.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockVoiceNote implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "voice_note";

    @SerializedName("voice_note")
    private final InputMediaVoiceNote voiceNote;

    private RichBlockCaption caption;

    /**
     * Required
     * @param voiceNote The voice note. Caption is ignored.
     */
    public InputRichBlockVoiceNote(InputMediaVoiceNote voiceNote){
        this.voiceNote = voiceNote;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockVoiceNote}
     */
    public InputRichBlockVoiceNote setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
