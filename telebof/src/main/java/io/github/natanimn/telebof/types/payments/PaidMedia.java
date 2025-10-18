package io.github.natanimn.telebof.types.payments;

import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import io.github.natanimn.telebof.types.media_and_service.Video;
import java.util.List;

/**
 * This class describes paid media.
 * @param type Type of media
 * @param width Media width as defined by the sender
 * @param height Media height as defined by the sender
 * @param duration Duration of the media in seconds as defined by the sender
 * @param photo The photo
 * @param video The video
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PaidMedia(
        String type,
        Integer width,
        Integer height,
        Integer duration,
        List<PhotoSize> photo,
        Video video
) {}