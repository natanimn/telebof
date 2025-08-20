package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * UpgradeGift class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#upgradeGift
 */
public class UpgradeGift extends AbstractBaseRequest<UpgradeGift, Boolean> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param owned_gift_id Unique identifier of the regular gift that should be upgraded to a unique one
     * @param api api
     */
    public UpgradeGift(String business_connection_id, String owned_gift_id, Api api) {
        super(api, "upgradeGift", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("owned_gift_id", owned_gift_id);
    }

    /**
     * Optional
     * @param keep_original_details Pass True to keep the original gift text, sender and receiver in the upgraded gift
     * @return {@link UpgradeGift}
     */
    public UpgradeGift keepOriginalDetails(Boolean keep_original_details) {
        return add("keep_original_details", keep_original_details);
    }

    /**
     * Optional
     * @param star_count The amount of Telegram Stars that will be paid for the upgrade from the business account balance
     * @return {@link UpgradeGift}
     */
    public UpgradeGift starCount(Integer star_count) {
        return add("star_count", star_count);
    }
}