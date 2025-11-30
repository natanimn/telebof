package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a message about the completion of a giveaway with public winners.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class GiveawayWinners {
    /**
     * The chat that created the giveaway
     */
    private Chat chat;

    /**
     * Identifier of the message with the giveaway in the chat
     */
    @SerializedName("giveaway_message_id")
    private Integer giveawayMessageId;

    /**
     * Point in time (Unix timestamp) when winners of the giveaway were selected
     */
    @SerializedName("winners_selection_date")
    private Integer winnersSelectionDate;

    /**
     * Total number of winners in the giveaway
     */
    @SerializedName("winner_count")
    private Integer winnerCount;

    /**
     * List of up to 100 winners of the giveaway
     */
    private List<User> winners;

    /**
     * Optional. The number of other chats the user had to join in order to be eligible for the giveaway
     */
    @SerializedName("additional_chat_count")
    private Integer additionalChatCount;

    /**
     * Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for; for Telegram Premium giveaways only
     */
    @SerializedName("premium_subscription_month_count")
    private Integer premiumSubscriptionMonthCount;

    /**
     * Optional. Number of undistributed prizes
     */
    @SerializedName("unclaimed_prize_count")
    private Integer unclaimedPrizeCount;

    /**
     * Optional. The number of Telegram Stars that were split between giveaway winners; for Telegram Star giveaways only
     */
    @SerializedName("prize_star_count")
    private Integer prizeStarCount;

    /**
     * Optional. True, if only users who had joined the chats after the giveaway started were eligible to win
     */
    @SerializedName("only_new_members")
    private Boolean onlyNewMembers;

    /**
     * Optional. True, if the giveaway was canceled because the payment for it was refunded
     */
    @SerializedName("was_refunded")
    private Boolean wasRefunded;

    /**
     * Optional. Description of additional giveaway prize
     */
    @SerializedName("prize_description")
    private String prizeDescription;

    public Chat getChat() {
        return chat;
    }

    public Integer getGiveawayMessageId() {
        return giveawayMessageId;
    }

    public Integer getWinnersSelectionDate() {
        return winnersSelectionDate;
    }

    public Integer getWinnerCount() {
        return winnerCount;
    }

    public List<User> getWinners() {
        return winners;
    }

    public Integer getAdditionalChatCount() {
        return additionalChatCount;
    }

    public Integer getPremiumSubscriptionMonthCount() {
        return premiumSubscriptionMonthCount;
    }

    public Integer getUnclaimedPrizeCount() {
        return unclaimedPrizeCount;
    }

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public Boolean getOnlyNewMembers() {
        return onlyNewMembers;
    }

    public Boolean getWasRefunded() {
        return wasRefunded;
    }

    public String getPrizeDescription() {
        return prizeDescription;
    }
}