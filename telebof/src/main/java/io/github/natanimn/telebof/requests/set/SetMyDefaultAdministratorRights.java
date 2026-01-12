package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatAdministratorRights;

/**
 * SetMyDefaultAdministratorRights class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setMyDefaultAdministratorRights
 */
public class SetMyDefaultAdministratorRights extends AbstractBaseRequest<SetMyDefaultAdministratorRights, Boolean> {
    /**
     * Required
     * @param api api
     */
    public SetMyDefaultAdministratorRights(Api api) {
        super(api, "srtMyDefaultAdministratorRights");
    }

    /**
     * Optional
     * @param rights A JSON-serialized object describing new default administrator rights.
     *               If not specified, the default administrator rights will be cleared.
     * @return {@link SetMyDefaultAdministratorRights}
     */
    public SetMyDefaultAdministratorRights rights(ChatAdministratorRights rights) {
        return add("rights", rights);
    }

    /**
     * Optional
     * @param forChannel Pass True to change the default administrator rights of the bot in channels.
     *                    Otherwise, the default administrator rights of the bot for groups and supergroups will be changed.
     * @return {@link SetMyDefaultAdministratorRights}
     */
    public SetMyDefaultAdministratorRights forChannel(Boolean forChannel) {
        return add("for_channel", forChannel);
    }

}
