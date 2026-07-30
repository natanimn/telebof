package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import io.github.natanimn.telebof.types.media_and_service.Video;
import lombok.Getter;

import java.util.List;

/**
 * This class describes paid media.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class PaidMedia {
    /**
     * Type of media
     */
    private String type;

    /**
     * Media width as defined by the sender
     */
    private Integer width;

    /**
     * Media height as defined by the sender
     */
    private Integer height;

    /**
     * Duration of the media in seconds as defined by the sender
     */
    private Integer duration;

    /**
     * The photo
     */
    private List<PhotoSize> photo;

    /**
     * The video
     */
    private Video video;

}