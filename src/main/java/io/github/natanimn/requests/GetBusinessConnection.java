package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.BusinessConnection;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetBusinessConnection extends AbstractBaseRequest<GetBusinessConnection, BusinessConnection> {
    public GetBusinessConnection(String business_connection_id, RequestSender requestSender){
        super(requestSender, "getBusinessConnection", BusinessConnection.class);
    }

}
