package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Describes the paid media added to a message.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class PaidMediaInfo {
    /**
     * The number of Telegram Stars that must be paid to buy access to the media
     */
    @SerializedName("star_count")
    private Integer starCount;

    /**
     * Information about the paid media
     */
    @SerializedName("paid_media")
    private List<PaidMedia> paidMedia;

    public Integer getStarCount() {
        return starCount;
    }

    public List<PaidMedia> getPaidMedia() {
        return paidMedia;
    }
}