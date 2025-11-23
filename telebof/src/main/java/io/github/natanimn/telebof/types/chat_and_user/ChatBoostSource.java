package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;

/**
 * This object describes the source of a chat boost.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ChatBoostSource {
    /**
     * Source of the boost, one of “premium”, "gift_code", "giveaway"
     */
    private String source;

    /**
     * Identifier of a message in the chat with the giveaway; the message could have been deleted already.
     * May be 0 if the message isn't sent yet.
     */
    @SerializedName("giveaway_message_id")
    private Integer giveawayMessageId;

    /**
     * The number of Telegram Stars to be split between giveaway winners; for Telegram Star giveaways only
     */
    @SerializedName("prize_star_count")
    private Integer prizeStarCount;

    /**
     * User
     */
    private User user;

    /**
     * True, if the giveaway was completed, but there was no user to win the prize
     */
    @SerializedName("is_unclaimed")
    private Boolean isUnclaimed;

    public String getSource() {
        return source;
    }

    public Integer getGiveawayMessageId() {
        return giveawayMessageId;
    }

    public Integer getPrizeStarCount() {
        return prizeStarCount;
    }

    public User getUser() {
        return user;
    }

    public Boolean getIsUnclaimed() {
        return isUnclaimed;
    }
}