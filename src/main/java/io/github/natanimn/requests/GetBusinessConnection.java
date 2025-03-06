package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.BusinessConnection;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetBusinessConnection extends AbstractBaseRequest<GetBusinessConnection, BusinessConnection> {
    public GetBusinessConnection(String business_connection_id, RequestSender requestSender){
        super(requestSender, "getBusinessConnection", BusinessConnection.class);
    }

}
