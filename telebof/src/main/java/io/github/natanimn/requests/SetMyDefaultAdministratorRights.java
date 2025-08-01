package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.ChatAdministratorRights;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetMyDefaultAdministratorRights extends AbstractBaseRequest<SetMyDefaultAdministratorRights, Boolean> {

    public SetMyDefaultAdministratorRights(RequestSender requestSender) {
        super(requestSender, "srtMyDefaultAdministratorRights");
    }

    public SetMyDefaultAdministratorRights rights(ChatAdministratorRights rights) {
        return add("rights", rights);
    }

    public SetMyDefaultAdministratorRights forChannel(boolean forChannel) {
        return add("for_channel", forChannel);
    }

}
