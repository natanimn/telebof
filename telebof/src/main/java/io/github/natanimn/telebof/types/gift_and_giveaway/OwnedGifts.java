package io.github.natanimn.telebof.types.gift_and_giveaway;

import java.util.List;

/**
 * Contains the list of gifts received and owned by a user or a chat.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class OwnedGifts {
    /**
     * The total number of gifts owned by the user or the chat
     */
    public Integer total_count;

    /**
     * The list of gifts
     */
    public List<OwnedGift> gifts;

    /**
     * Optional. Offset for the next request. If empty, then there are no more results
     */
    public String next_offset;
}
