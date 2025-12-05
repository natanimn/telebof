package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * Contains the list of gifts received and owned by a user or a chat.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class OwnedGifts {
    /**
     * The total number of gifts owned by the user or the chat
     */
    @SerializedName("total_count")
    private Integer totalCount;

    /**
     * The list of gifts
     */
    private List<OwnedGift> gifts;

    /**
     * Optional. Offset for the next request. If empty, then there are no more results
     */
    @SerializedName("next_offset")
    private String nextOffset;

    public Integer getTotalCount() {
        return totalCount;
    }

    public List<OwnedGift> getGifts() {
        return gifts;
    }

    public String getNextOffset() {
        return nextOffset;
    }
}