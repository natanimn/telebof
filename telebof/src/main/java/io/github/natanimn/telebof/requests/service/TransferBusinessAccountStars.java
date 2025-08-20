package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * TransferBusinessAccountStars class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#transferBusinessAccountStars
 */
public class TransferBusinessAccountStars extends AbstractBaseRequest<TransferBusinessAccountStars, Boolean> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param star_count star count
     * @param api api
     */
    public TransferBusinessAccountStars(String business_connection_id, short star_count, Api api){
        super(api, "transferBusinessAccountStars", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("star_count", star_count);

    }
}
