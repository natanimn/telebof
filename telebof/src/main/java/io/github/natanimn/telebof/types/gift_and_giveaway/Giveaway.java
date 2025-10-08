package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a message about a scheduled giveaway.
 * @param chats The list of chats which the user must join to participate in the giveaway
 * @param winnersSelectionDate Point in time (Unix timestamp) when winners of the giveaway will be selected
 * @param winnerCount The number of users which are supposed to be selected as winners of the giveaway
 * @param onlyNewMembers Optional. True, if only users who join the chats after the giveaway started should be eligible to win
 * @param hasPublicWinners Optional. True, if the list of giveaway winners will be visible to everyone
 * @param prizeDescription Optional. Description of additional giveaway prize
 * @param countryCodes Optional. A list of two-letter ISO 3166-1 alpha-2 country codes indicating the countries from which eligible users for the giveaway must come. If empty, then all users can participate in the giveaway. Users with a phone number that was bought on Fragment can always participate in giveaways.
 * @param premiumSubscriptionMonthCount Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for; for Telegram Premium giveaways only
 * @param prizeStarCount Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Giveaway(
        List<Chat> chats,
        @SerializedName("winners_selection_date") Integer winnersSelectionDate,
        @SerializedName("winner_count") Integer winnerCount,
        @SerializedName("only_new_members") Boolean onlyNewMembers,
        @SerializedName("has_public_winners") Boolean hasPublicWinners,
        @SerializedName("prize_description") String prizeDescription,
        @SerializedName("country_codes") List<String> countryCodes,
        @SerializedName("premium_subscription_month_count") Integer premiumSubscriptionMonthCount,
        @SerializedName("prize_star_count") Integer prizeStarCount
) {}