package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.Gifts;

/**
 * GetAvailableGifts class. Returns {@link Gifts} on success.
 * @author Natanim
 * @since July 25, 2025
 * @version 0.6
 * @see BotContext#getAvailableGifts
 */
public class GetAvailableGifts extends AbstractBaseRequest<GetAvailableGifts, Gifts> {
    /**
     * Requireed
     * @param rs api
     */
    public GetAvailableGifts(Api rs){
        super(rs, "getAvailableGifts");
    }
}
