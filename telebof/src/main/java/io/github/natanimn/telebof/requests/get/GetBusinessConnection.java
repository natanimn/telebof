package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.BusinessConnection;

/**
 * GetBusinessConnection class. Returns {@link BusinessConnection} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getBusinessConnection
 */
public class GetBusinessConnection extends AbstractBaseRequest<GetBusinessConnection, BusinessConnection> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param api api
     */
    public GetBusinessConnection(String business_connection_id, Api api){
        super(api, "getBusinessConnection", BusinessConnection.class);
    }

}
