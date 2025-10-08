package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.updates.Message;
import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about the completion of a giveaway without public winners.
 * @param winnerCount Number of winners in the giveaway
 * @param unclaimedPrizeCount Optional. Number of undistributed prizes
 * @param giveawayMessage Optional. Message with the giveaway that was completed, if it wasn't deleted
 * @param isStarGiveaway Optional. True, if the giveaway is a Telegram Star giveaway. Otherwise, currently, the giveaway is a Telegram Premium giveaway.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record GiveawayCompleted(
        @SerializedName("winner_count") Integer winnerCount,
        @SerializedName("unclaimed_prize_count") Integer unclaimedPrizeCount,
        @SerializedName("giveaway_message") Message giveawayMessage,
        @SerializedName("is_star_giveaway") Boolean isStarGiveaway
) {}