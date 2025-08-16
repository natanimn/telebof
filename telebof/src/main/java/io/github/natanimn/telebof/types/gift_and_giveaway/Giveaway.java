package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;

import java.util.List;

/**
 * This object represents a message about a scheduled giveaway.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class Giveaway {
    /**
     * The list of chats which the user must join to participate in the giveaway
     */
    public List<Chat> chats;

    /**
     * Point in time (Unix timestamp) when winners of the giveaway will be selected
     */
    public Integer winners_selection_date;

    /**
     * The number of users which are supposed to be selected as winners of the giveaway
     */
    public Integer winner_count;

    /**
     * Optional. True, if only users who join the chats after the giveaway started should be eligible to win
     */
    public Boolean only_new_members;

    /**
     * Optional. True, if the list of giveaway winners will be visible to everyone
     */
    public Boolean has_public_winners;

    /**
     * Optional. Description of additional giveaway prize
     */
    public String prize_description;

    /**
     * Optional.
     * A list of two-letter <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>  country codes indicating the countries from which eligible users for the giveaway must come.
     * If empty, then all users can participate in the giveaway.
     * Users with a phone number that was bought on Fragment can always participate in giveaways.
     */
    public List<String> country_codes;

    /**
     * Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for; for Telegram Premium giveaways only
     */
    public Integer premium_subscription_month_count;

    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    public Integer prize_star_count;
}
