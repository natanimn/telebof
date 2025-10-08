package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.chat_and_user.Chat;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 * This object represents a message about the completion of a giveaway with public winners.
 * @param chat The chat that created the giveaway
 * @param giveawayMessageId Identifier of the message with the giveaway in the chat
 * @param winnersSelectionDate Point in time (Unix timestamp) when winners of the giveaway were selected
 * @param winnerCount Total number of winners in the giveaway
 * @param winners List of up to 100 winners of the giveaway
 * @param additionalChatCount Optional. The number of other chats the user had to join in order to be eligible for the giveaway
 * @param premiumSubscriptionMonthCount Optional. The number of months the Telegram Premium subscription won from the giveaway will be active for; for Telegram Premium giveaways only
 * @param unclaimedPrizeCount Optional. Number of undistributed prizes
 * @param prizeStarCount Optional. The number of Telegram Stars that were split between giveaway winners; for Telegram Star giveaways only
 * @param onlyNewMembers Optional. True, if only users who had joined the chats after the giveaway started were eligible to win
 * @param wasRefunded Optional. True, if the giveaway was canceled because the payment for it was refunded
 * @param prizeDescription Optional. Description of additional giveaway prize
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record GiveawayWinners(
        Chat chat,
        @SerializedName("giveaway_message_id") Integer giveawayMessageId,
        @SerializedName("winners_selection_date") Integer winnersSelectionDate,
        @SerializedName("winner_count") Integer winnerCount,
        List<User> winners,
        @SerializedName("additional_chat_count") Integer additionalChatCount,
        @SerializedName("premium_subscription_month_count") Integer premiumSubscriptionMonthCount,
        @SerializedName("unclaimed_prize_count") Integer unclaimedPrizeCount,
        @SerializedName("prize_star_count") Integer prizeStarCount,
        @SerializedName("only_new_members") Boolean onlyNewMembers,
        @SerializedName("was_refunded") Boolean wasRefunded,
        @SerializedName("prize_description") String prizeDescription
) {}