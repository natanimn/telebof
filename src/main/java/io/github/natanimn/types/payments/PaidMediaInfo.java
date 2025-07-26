package io.github.natanimn.types.payments;

import java.util.List;

/**
 * Describes the paid media added to a message.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */
public class PaidMediaInfo {
    /**
     * The number of Telegram Stars that must be paid to buy access to the media
     */
    public Integer star_count;

    /**
     * Information about the paid media
     */
    public List<PaidMedia> paid_media;
}
