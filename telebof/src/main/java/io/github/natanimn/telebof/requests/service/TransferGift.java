package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * TransferGift class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#transferGift
 */
public class TransferGift extends AbstractBaseRequest<TransferGift, Boolean> {
    /**
     * Required
     * @param businessConnectionId Unique identifier of the business connection
     * @param ownedGiftId Unique identifier of the regular gift that should be transferred
     * @param neOwnerChatId Unique identifier of the chat which will own the gift
     * @param api api
     */
    public TransferGift(String businessConnectionId, String ownedGiftId, long neOwnerChatId, Api api) {
        super(api, "transferGift", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("owned_gift_id", ownedGiftId);
        add("new_owner_chat_id", neOwnerChatId);
    }

    /**
     * Optional
     * @param starCount The amount of Telegram Stars that will be paid for the transfer from the business account balance
     * @return {@link TransferGift}
     */
    public TransferGift starCount(Integer starCount) {
        return add("star_count", starCount);
    }
}