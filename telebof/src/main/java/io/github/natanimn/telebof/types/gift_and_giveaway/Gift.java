package io.github.natanimn.telebof.types.gift_and_giveaway;

import io.github.natanimn.telebof.types.chat_and_user.Chat;
import io.github.natanimn.telebof.types.media_and_service.Sticker;
import com.google.gson.annotations.SerializedName;

/**
 * This class represents a gift that can be sent by the bot.
 * @author Natnim
 * @since July 25, 2025
 * @version 1.4.0
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

    /**
     * Optional. True, if the gift can only be purchased by Telegram Premium subscribers
     */
    @SerializedName("is_premium")
    private Boolean isPremium;

    /**
     * Optional. True, if the gift can be used (after being upgraded) to customize a user's appearance
     */
    @SerializedName("has_colors")
    private Boolean hasColors;

    /**
     * Optional. The total number of gifts of this type that can be sent by the bot; for limited gifts only
     */
    @SerializedName("personal_total_count")
    private Integer personalTotalCount;

    /**
     * Optional. The number of remaining gifts of this type that can be sent by the bot; for limited gifts only
     */
    @SerializedName("personal_remaining_count")
    private Integer personalRemainingCount;

    /**
     * Optional. Background of the gift
     */
    private GiftBackground background;

    /**
     * Optional. The total number of different unique gifts that can be obtained by upgrading the gift
     */
    @SerializedName("unique_gift_variant_count")
    private Integer uniqueGiftVariantCount;

    /**
     * Optional. True, if the gift was used to craft another gift and isn't available anymore
     */
    @SerializedName("is_burned")
    private Boolean isBurned;

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

    public Boolean getHasColors() {
        return hasColors;
    }

    public Boolean getIsPremium() {
        return isPremium;
    }

    public Integer getRemainingCount() {
        return remainingCount;
    }

    public Chat getPublisherChat() {
        return publisherChat;
    }

    public Integer getPersonalTotalCount() {
        return personalTotalCount;
    }

    public Integer getPersonalRemainingCount() {
        return personalRemainingCount;
    }

    public GiftBackground getBackground() {
        return background;
    }

    public Integer getUniqueGiftVariantCount() {
        return uniqueGiftVariantCount;
    }

    public Boolean getIsBurned() {
        return isBurned;
    }
}