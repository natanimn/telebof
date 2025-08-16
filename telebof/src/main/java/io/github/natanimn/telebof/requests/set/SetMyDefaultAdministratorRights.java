package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.chat_and_user.ChatAdministratorRights;

/**
 * SetMyDefaultAdministratorRights class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setMyDefaultAdministratorRights
 */
public class SetMyDefaultAdministratorRights extends AbstractBaseRequest<SetMyDefaultAdministratorRights, Boolean> {
    /**
     * Required
     * @param requestSender request sender
     */
    public SetMyDefaultAdministratorRights(RequestSender requestSender) {
        super(requestSender, "srtMyDefaultAdministratorRights");
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
     * @param for_channel Pass True to change the default administrator rights of the bot in channels.
     *                    Otherwise, the default administrator rights of the bot for groups and supergroups will be changed.
     * @return {@link SetMyDefaultAdministratorRights}
     */
    public SetMyDefaultAdministratorRights forChannel(boolean for_channel) {
        return add("for_channel", for_channel);
    }

}
