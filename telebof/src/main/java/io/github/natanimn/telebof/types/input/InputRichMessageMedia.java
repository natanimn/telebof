package io.github.natanimn.telebof.types.input;

import java.io.Serializable;

/**
 * Describes a media element embedded in an outgoing rich message.
 * @author Natanim
 * @since 2.2
 */
public class InputRichMessageMedia implements Serializable{

    private final String id;

    private final InputMedia media;

    /**
     * Required
     * @param id Unique identifier of the media used in a tg://photo?id=, tg://video?id=, or tg://audio?id= link. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @param media The media to be sent. Everything except the media itself and its properties is ignored.
     */
    public InputRichMessageMedia(String id, InputMediaAnimation media) {
        this.id = id;
        this.media = media;
    }

    /**
     * Required
     * @param id Unique identifier of the media used in a tg://photo?id=, tg://video?id=, or tg://audio?id= link. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @param media The media to be sent. Everything except the media itself and its properties is ignored.
     */
    public InputRichMessageMedia(String id, InputMediaAudio media) {
        this.id = id;
        this.media = media;
    }

    /**
     * Required
     * @param id Unique identifier of the media used in a tg://photo?id=, tg://video?id=, or tg://audio?id= link. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @param media The media to be sent. Everything except the media itself and its properties is ignored.
     */
    public InputRichMessageMedia(String id, InputMediaPhoto media) {
        this.id = id;
        this.media = media;
    }

    /**
     * Required
     * @param id Unique identifier of the media used in a tg://photo?id=, tg://video?id=, or tg://audio?id= link. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @param media The media to be sent. Everything except the media itself and its properties is ignored.
     */
    public InputRichMessageMedia(String id, InputMediaVideo media) {
        this.id = id;
        this.media = media;
    }

    /**
     * Required
     * @param id Unique identifier of the media used in a tg://photo?id=, tg://video?id=, or tg://audio?id= link. 1-64 characters, only A-Z, a-z, 0-9, _ and - are allowed.
     * @param media The media to be sent. Everything except the media itself and its properties is ignored.
     */
    public InputRichMessageMedia(String id, InputMediaVoiceNote media) {
        this.id = id;
        this.media = media;
    }
}
