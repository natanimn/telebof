package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

import java.util.List;

/**
 * Describes the paid media added to a message.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}