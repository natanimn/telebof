package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * UpgradeGift class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#upgradeGift
 */
public class UpgradeGift extends AbstractBaseRequest<UpgradeGift, Boolean> {
    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection
     * @param ownedGiftId Unique identifier of the regular gift that should be upgraded to a unique one
     * @param api api
     */
    public UpgradeGift(String businessConnectionId, String ownedGiftId, Api api) {
        super(api, "upgradeGift", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("owned_gift_id", ownedGiftId);
    }

    /**
     * Optional
     * @param keepOriginalDetails Pass True to keep the original gift text, sender and receiver in the upgraded gift
     * @return {@link UpgradeGift}
     */
    public UpgradeGift keepOriginalDetails(Boolean keepOriginalDetails) {
        return add("keep_original_details", keepOriginalDetails);
    }

    /**
     * Optional
     * @param starCount The amount of Telegram Stars that will be paid for the upgrade from the business account balance
     * @return {@link UpgradeGift}
     */
    public UpgradeGift starCount(Integer starCount) {
        return add("star_count", starCount);
    }
}