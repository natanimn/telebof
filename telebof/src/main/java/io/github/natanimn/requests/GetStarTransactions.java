package io.github.natanimn.requests;

import io.github.natanimn.types.payments.StarTransactions;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetStarTransactions extends AbstractBaseRequest<GetStarTransactions, StarTransactions> {

    public GetStarTransactions(RequestSender requestSender){
      super(requestSender, "getStarTransactions", StarTransactions.class);
    }

    public GetStarTransactions offset(int offset){
        return add("offset", offset);
    }

    public GetStarTransactions limit(int limit){
        return add("limit", limit);
    }
}
