package io.github.natanimn.telebof.types.gift_and_giveaway;

import java.io.Serializable;

/**
 * This object describes the types of gifts that can be gifted to a user or a chat.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 */
public class AcceptedGiftTypes implements Serializable {
    /**
     * True, if unlimited regular gifts are accepted
     */
    public Boolean unlimited_gifts;

    /**
     * True, if limited regular gifts are accepted
     */
    public Boolean limited_gifts;

    /**
     * True, if unique gifts or gifts that can be upgraded to unique for free are accepted
     */
    public Boolean unique_gifts;

    /**
     * True, if a Telegram Premium subscription is accepted
     */
    public Boolean premium_subscription;


    public void setUnlimitedGifts(Boolean unlimited_gifts) {
        this.unlimited_gifts = unlimited_gifts;
    }

    public void setLimitedGifts(Boolean limited_gifts) {
        this.limited_gifts = limited_gifts;
    }

    public void setUniqueGifts(Boolean unique_gifts) {
        this.unique_gifts = unique_gifts;
    }

    public void setPremiumSubscription(Boolean premium_subscription) {
        this.premium_subscription = premium_subscription;
    }

}
