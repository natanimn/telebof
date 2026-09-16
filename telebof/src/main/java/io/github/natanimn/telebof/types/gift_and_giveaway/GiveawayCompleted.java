package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a service message about the completion of a giveaway without public winners.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class GiveawayCompleted {
    /**
     * Number of winners in the giveaway
     */
    @SerializedName("winner_count")
    private Integer winnerCount;

    /**
     * Optional. Number of undistributed prizes
     */
    @SerializedName("unclaimed_prize_count")
    private Integer unclaimedPrizeCount;

    /**
     * Optional. Message with the giveaway that was completed, if it wasn't deleted
     */
    @SerializedName("giveaway_message")
    private Message giveawayMessage;

    /**
     * Optional. True, if the giveaway is a Telegram Star giveaway. Otherwise, currently, the giveaway is a Telegram Premium giveaway.
     */
    @SerializedName("is_star_giveaway")
    private Boolean isStarGiveaway;

}