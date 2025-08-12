package io.github.natanimn.requests.get;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.gift_and_giveaway.Gifts;

/**
 * GetAvailableGifts class. Returns {@link Gifts} on success.
 * @author Natanim
 * @since July 25, 2025
 * @version 0.6
 * @implNote {@link BotContext#getAvailableGifts}
 */
public class GetAvailableGifts extends AbstractBaseRequest<GetAvailableGifts, Gifts> {
    /**
     * Requireed
     * @param rs request sender
     */
    public GetAvailableGifts(RequestSender rs){
        super(rs, "getAvailableGifts");
    }
}
