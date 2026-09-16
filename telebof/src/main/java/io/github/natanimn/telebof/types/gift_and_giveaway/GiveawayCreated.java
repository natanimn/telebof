package io.github.natanimn.telebof.types.gift_and_giveaway;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object represents a service message about the creation of a scheduled giveaway.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class GiveawayCreated {
    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    @SerializedName("prize_star_count")
    private Integer prizeStarCount;

}