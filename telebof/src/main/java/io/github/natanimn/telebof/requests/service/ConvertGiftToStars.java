package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * ConvertGiftToStars class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#convertGiftToStars
 */
public class ConvertGiftToStars extends AbstractBaseRequest<ConvertGiftToStars, Boolean> {
    /**
     * Required
     * @param business_connection_id Unique identifier of the business connection
     * @param owned_gift_id Unique identifier of the regular gift that should be converted to Telegram Stars
     * @param api api
     */
    public ConvertGiftToStars(String business_connection_id, String owned_gift_id, Api api) {
        super(api, "convertGiftToStars", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("owned_gift_id", owned_gift_id);
    }
}