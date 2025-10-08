package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Contains the list of gifts received and owned by a user or a chat.
 * @param totalCount The total number of gifts owned by the user or the chat
 * @param gifts The list of gifts
 * @param nextOffset Optional. Offset for the next request. If empty, then there are no more results
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public record OwnedGifts(
        @SerializedName("total_count") Integer totalCount,
        List<OwnedGift> gifts,
        @SerializedName("next_offset") String nextOffset
) {}