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

    /**
     * True, if transfers of unique gifts from channels are accepted
     */
    @SerializedName("gifts_from_channels")
    private Boolean giftsFromChannels;

    public AcceptedGiftTypes(){}

    public AcceptedGiftTypes(Boolean unlimitedGifts, Boolean limitedGifts, Boolean uniqueGifts, Boolean premiumSubscription, Boolean giftsFromChannels) {
        this.unlimitedGifts = unlimitedGifts;
        this.limitedGifts = limitedGifts;
        this.uniqueGifts = uniqueGifts;
        this.premiumSubscription = premiumSubscription;
        this.giftsFromChannels = giftsFromChannels;
    }

    public Boolean getUnlimitedGifts() {
        return unlimitedGifts;
    }

    public Boolean getLimitedGifts() {
        return limitedGifts;
    }

    public Boolean getUniqueGifts() {
        return uniqueGifts;
    }

    public Boolean getPremiumSubscription() {
        return premiumSubscription;
    }

    public Boolean getGiftsFromChannels() {
        return giftsFromChannels;
    }
}