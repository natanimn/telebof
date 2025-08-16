package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.updates.Message;

/**
 * This object represents a service message about the completion of a giveaway without public winners.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class GiveawayCompleted {
    /**
     * Number of winners in the giveaway
     */
    public Integer winner_count;

    /**
     * Optional. Number of undistributed prizes
     */
    public Integer unclaimed_prize_count;

    /**
     * Optional. Message with the giveaway that was completed, if it wasn't deleted
     */
    public Message giveaway_message;

    /**
     * Optional. True, if the giveaway is a Telegram Star giveaway. Otherwise, currently, the giveaway is a Telegram Premium giveaway.
     */
    public Boolean is_star_giveaway;

}
