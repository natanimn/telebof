package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.Gifts;

/**
 * GetAvailableGifts class. Returns {@link Gifts} on success.
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 * @see BotContext#getAvailableGifts
 */
public class GetAvailableGifts extends AbstractBaseRequest<GetAvailableGifts, Gifts> {
    /**
     * Required
     * @param api api
     */
    public GetAvailableGifts(Api api){
        super(api, "getAvailableGifts");
    }
}
