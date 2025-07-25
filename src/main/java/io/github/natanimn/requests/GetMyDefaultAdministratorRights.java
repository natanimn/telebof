package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.ChatAdministratorRights;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetMyDefaultAdministratorRights extends AbstractBaseRequest<GetMyDefaultAdministratorRights, ChatAdministratorRights> {
    public GetMyDefaultAdministratorRights(RequestSender requestSender) {
        super(requestSender, "getMyDefaultAdministratorRights", ChatAdministratorRights.class);
    }

    public GetMyDefaultAdministratorRights forChannel(boolean forChannel) {
        return add("for_channel", forChannel);
    }

}
