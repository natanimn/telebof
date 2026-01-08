package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * TransferBusinessAccountStars class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#transferBusinessAccountStars
 */
public class TransferBusinessAccountStars extends AbstractBaseRequest<TransferBusinessAccountStars, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param starCount star count
     * @param api api
     */
    public TransferBusinessAccountStars(String businessConnectionId, short starCount, Api api){
        super(api, "transferBusinessAccountStars", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("star_count", starCount);

    }
}
