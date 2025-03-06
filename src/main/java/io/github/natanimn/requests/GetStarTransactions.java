package io.github.natanimn.requests;

import io.github.natanimn.types.StarTransactions;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
