package io.github.natanimn.types.gift_and_giveaway;

import io.github.natanimn.types.chat_and_user.User;
import io.github.natanimn.types.chat_and_user.Chat;

import java.util.List;
import java.util.Objects;

/**
 * This object represents a message about the completion of a giveaway with public winners.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class GiveawayWinners {
    /**
     * The chat that created the giveaway
     */
    public Chat chat;

    /**
     * Identifier of the message with the giveaway in the chat
     */
    public Integer giveaway_message_id;

    /**
     * Point in time (Unix timestamp) when winners of the giveaway were selected
     */
    public Integer winners_selection_date;

    /**
     * Total number of winners in the giveaway
     */
    public Integer winner_count;

    /**
     * List of up to 100 winners of the giveaway
     */
    public List<User> winners;

    /**
     * Optional. The number of other chats the user had to join in order to be eligible for the giveaway
     */
    public Integer additional_chat_count;

    /**
     * Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for;
     * for Telegram Premium giveaways only
     */
    public Integer premium_subscription_month_count;

    /**
     * Optional. Number of undistributed prizes
     */
    public Integer unclaimed_prize_count;

    /**
     * Optional. The number of Telegram Stars that were split between giveaway winners; for Telegram Star giveaways only
     */
    public Integer prize_star_count;

    /**
     * Optional. True, if only users who had joined the chats after the giveaway started were eligible to win
     */
    public Boolean only_new_members;

    /**
     * Optional. True, if the giveaway was canceled because the payment for it was refunded
     */
    public Boolean was_refunded;

    /**
     * Optional. Description of additional giveaway prize
     */
    public String prize_description;

}
