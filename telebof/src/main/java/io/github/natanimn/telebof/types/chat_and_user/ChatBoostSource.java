package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object describes the source of a chat boost.
 * @param source Source of the boost, one of “premium”, "gift_code", "giveaway"
 * @param giveawayMessageId Identifier of a message in the chat with the giveaway; the message could have been deleted already.
 *                          May be 0 if the message isn't sent yet.
 * @param prizeStarCount The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
 * @param user User
 * @param isUnclaimed True, if the giveaway was completed, but there was no user to win the prize
 * @author Natanim
 * @since 3 March 2025
 * @version 1.2.4
 */
public record ChatBoostSource(
    String source,

    @SerializedName("giveaway_message_id")
    Integer giveawayMessageId,

    @SerializedName("prize_star_count")
    Integer prizeStarCount,

    User user,

    @SerializedName("is_unclaimed")
    Boolean isUnclaimed
){ }
