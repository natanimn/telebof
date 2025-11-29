package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a message about a scheduled giveaway.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class Giveaway {
    /**
     * The list of chats which the user must join to participate in the giveaway
     */
    private List<Chat> chats;

    /**
     * Point in time (Unix timestamp) when winners of the giveaway will be selected
     */
    @SerializedName("winners_selection_date")
    private Integer winnersSelectionDate;

    /**
     * The number of users which are supposed to be selected as winners of the giveaway
     */
    @SerializedName("winner_count")
    private Integer winnerCount;

    /**
     * Optional. True, if only users who join the chats after the giveaway started should be eligible to win
     */
    @SerializedName("only_new_members")
    private Boolean onlyNewMembers;

    /**
     * Optional. True, if the list of giveaway winners will be visible to everyone
     */
    @SerializedName("has_public_winners")
    private Boolean hasPublicWinners;

    /**
     * Optional. Description of additional giveaway prize
     */
    @SerializedName("prize_description")
    private String prizeDescription;

    /**
     * Optional. A list of two-letter ISO 3166-1 alpha-2 country codes indicating the countries from which eligible users for the giveaway must come. If empty, then all users can participate in the giveaway. Users with a phone number that was bought on Fragment can always participate in giveaways.
     */
    @SerializedName("country_codes")
    private List<String> countryCodes;

    /**
     * Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for; for Telegram Premium giveaways only
     */
    @SerializedName("premium_subscription_month_count")
    private Integer premiumSubscriptionMonthCount;

    /**
     * Optional. The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    @SerializedName("prize_star_count")
    private Integer prizeStarCount;

    public List<Chat> getChats() {
        return chats;
    }

    public Integer getWinnersSelectionDate() {
        return winnersSelectionDate;
    }

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public Boolean getOnlyNewMembers() {
        return onlyNewMembers;
    }

    public Boolean getHasPublicWinners() {
        return hasPublicWinners;
    }

    public String getPrizeDescription() {
        return prizeDescription;
    }

    public List<String> getCountryCodes() {
        return countryCodes;
    }

    public Integer getPremiumSubscriptionMonthCount() {
        return premiumSubscriptionMonthCount;
    }

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }
}