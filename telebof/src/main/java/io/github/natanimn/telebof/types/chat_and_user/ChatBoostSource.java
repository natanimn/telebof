package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import lombok.Getter;

/**
 * This object describes the source of a chat boost.
 * @author Natanim
 * @since 0.1
 */
@Getter
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

}