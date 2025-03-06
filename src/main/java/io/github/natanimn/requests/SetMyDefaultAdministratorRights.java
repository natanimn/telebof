package io.github.natanimn.requests;

import io.github.natanimn.types.ChatAdministratorRights;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
