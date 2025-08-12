package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.updates.BusinessConnection;

/**
 * GetBusinessConnection class. Returns {@link BusinessConnection} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getBusinessConnection}
 */
public class GetBusinessConnection extends AbstractBaseRequest<GetBusinessConnection, BusinessConnection> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param requestSender request sender
     */
    public GetBusinessConnection(String business_connection_id, RequestSender requestSender){
        super(requestSender, "getBusinessConnection", BusinessConnection.class);
    }

}
