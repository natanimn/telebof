package io.github.natanimn.telebof.types.gift_and_giveaway;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/**
 * This object describes the types of gifts that can be gifted to a user or a chat.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 */
public class AcceptedGiftTypes implements Serializable {
    /**
     * True, if unlimited regular gifts are accepted
     */
    @SerializedName("unlimited_gifts")
    private Boolean unlimitedGifts;

    /**
     * True, if limited regular gifts are accepted
     */
    @SerializedName("limited_gifts")
    private Boolean limitedGifts;

    /**
     * True, if unique gifts or gifts that can be upgraded to unique for free are accepted
     */
    @SerializedName("unique_gifts")
    private Boolean uniqueGifts;

    /**
     * True, if a Telegram Premium subscription is accepted
     */
    @SerializedName("premium_subscription")
    private Boolean premiumSubscription;

    public Boolean getUnlimitedGifts() {
        return unlimitedGifts;
    }

    public AcceptedGiftTypes setUnlimitedGifts(Boolean unlimitedGifts) {
        this.unlimitedGifts = unlimitedGifts;
        return this;
    }

    public Boolean getLimitedGifts() {
        return limitedGifts;
    }

    public AcceptedGiftTypes setLimitedGifts(Boolean limitedGifts) {
        this.limitedGifts = limitedGifts;
        return this;
    }

    public Boolean getUniqueGifts() {
        return uniqueGifts;
    }

    public AcceptedGiftTypes setUniqueGifts(Boolean uniqueGifts) {
        this.uniqueGifts = uniqueGifts;
        return this;
    }

    public Boolean getPremiumSubscription() {
        return premiumSubscription;
    }

    public AcceptedGiftTypes setPremiumSubscription(Boolean premiumSubscription) {
        this.premiumSubscription = premiumSubscription;
        return this;
    }
}