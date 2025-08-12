package io.github.natanimn.requests.get;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.payments.StarTransactions;

/**
 * GetStarTransactions class. Returns {@link StarTransactions} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#getStarTransactions()}
 */
public class GetStarTransactions extends AbstractBaseRequest<GetStarTransactions, StarTransactions> {
    /**
     * Required
     * @param requestSender request sender
     */
    public GetStarTransactions(RequestSender requestSender){
      super(requestSender, "getStarTransactions", StarTransactions.class);
    }

    /**
     * Optional
     * @param offset Number of transactions to skip in the response
     * @return {@link GetStarTransactions}
     */
    public GetStarTransactions offset(int offset){
        return add("offset", offset);
    }

    /**
     * Optional
     * @param limit The maximum number of transactions to be retrieved. Values between 1-100 are accepted. Defaults to 100.
     * @return {@link GetStarTransactions}
     */
    public GetStarTransactions limit(byte limit){
        return add("limit", limit);
    }
}
