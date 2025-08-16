package io.github.natanimn.telebof.types.gift_and_giveaway;


/**
 * This object represents a service message about the creation of a scheduled giveaway.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class GiveawayCreated {
    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    public Integer prize_star_count;
}
