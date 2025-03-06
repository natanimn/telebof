package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ChatAdministratorRights;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetMyDefaultAdministratorRights extends AbstractBaseRequest<GetMyDefaultAdministratorRights, ChatAdministratorRights> {
    public GetMyDefaultAdministratorRights(RequestSender requestSender) {
        super(requestSender, "getMyDefaultAdministratorRights", ChatAdministratorRights.class);
    }

    public GetMyDefaultAdministratorRights forChannel(boolean forChannel) {
        return add("for_channel", forChannel);
    }

}
