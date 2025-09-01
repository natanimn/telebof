package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.payments.StarAmount;

/**
 * GetMyStarBalance class. Returns {@link StarAmount} on success.
 * @author Natanim
 * @since 1 September 2025
 * @version 1.1.0
 * @see BotContext#getMyStarBalance
 */
public class GetMyStarBalance extends AbstractBaseRequest<GetMyStarBalance, StarAmount> {

    /**
     * Constructor for getting the bot's Telegram Stars balance.
     * @param api api
     */
    public GetMyStarBalance(Api api) {
        super(api, "getMyStarBalance", StarAmount.class);
    }
}