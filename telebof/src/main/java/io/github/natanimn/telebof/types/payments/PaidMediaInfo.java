package io.github.natanimn.telebof.types.payments;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Describes the paid media added to a message.
 * @param starCount The number of Telegram Stars that must be paid to buy access to the media
 * @param paidMedia Information about the paid media
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record PaidMediaInfo(
        @SerializedName("star_count") Integer starCount,
        @SerializedName("paid_media") List<PaidMedia> paidMedia
) {}