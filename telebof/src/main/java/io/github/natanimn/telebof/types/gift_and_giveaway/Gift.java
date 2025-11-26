package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.media_and_service.Sticker;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a gift that can be sent by the bot.
 * @author Natnim
 * @since July 25, 2025
 * @version 1.3.0
 */
public class Gift {
    /**
     * Unique identifier of the gift
     */
    private String id;

    /**
     * The sticker that represents the gift
     */
    private Sticker sticker;

    /**
     * The number of Telegram Stars that must be paid to send the sticker
     */
    @SerializedName("star_count")
    private Integer starCount;

    /**
     * The number of Telegram Stars that must be paid to upgrade the gift to a unique one
     */
    @SerializedName("upgrade_star_count")
    private Integer upgradeStarCount;

    /**
     * The total number of the gifts of this type that can be sent; for limited gifts only
     */
    @SerializedName("total_count")
    private Integer totalCount;

    /**
     * The number of remaining gifts of this type that can be sent; for limited gifts only
     */
    @SerializedName("remaining_count")
    private Integer remainingCount;

    /**
     * Optional. Information about the chat that published the gift
     */
    @SerializedName("publisher_chat")
    private Chat publisherChat;

    public String getId() {
        return id;
    }

    public Sticker getSticker() {
        return sticker;
    }

    public Integer getStarCount() {
        return starCount;
    }

    public Integer getUpgradeStarCount() {
        return upgradeStarCount;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public Integer getRemainingCount() {
        return remainingCount;
    }

    public Chat getPublisherChat() {
        return publisherChat;
    }
}