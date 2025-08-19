package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.payments.StarAmount;

/**
 * GetBusinessAccountStarBalance class. Returns {@link StarAmount} on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#getBusinessAccountStarBalance
 */
public class GetBusinessAccountStarBalance extends AbstractBaseRequest<GetBusinessAccountStarBalance, StarAmount> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param api api
     */
    public GetBusinessAccountStarBalance(String business_connection_id, Api api){
        super(api, "getBusinessAccountStarBalance", StarAmount.class);
        add("business_connection_id", business_connection_id);
    }
}
