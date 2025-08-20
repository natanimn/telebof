package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * TransferGift class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#transferGift
 */
public class TransferGift extends AbstractBaseRequest<TransferGift, Boolean> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param owned_gift_id Unique identifier of the regular gift that should be transferred
     * @param new_owner_chat_id Unique identifier of the chat which will own the gift
     * @param api api
     */
    public TransferGift(String business_connection_id, String owned_gift_id, long new_owner_chat_id, Api api) {
        super(api, "transferGift", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("owned_gift_id", owned_gift_id);
        add("new_owner_chat_id", new_owner_chat_id);
    }

    /**
     * Optional
     * @param star_count The amount of Telegram Stars that will be paid for the transfer from the business account balance
     * @return {@link TransferGift}
     */
    public TransferGift starCount(Integer star_count) {
        return add("star_count", star_count);
    }
}