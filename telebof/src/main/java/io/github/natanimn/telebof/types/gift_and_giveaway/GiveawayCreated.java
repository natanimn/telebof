package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about the creation of a scheduled giveaway.
 * @param prizeStarCount Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record GiveawayCreated(
        @SerializedName("prize_star_count") Integer prizeStarCount
) {}