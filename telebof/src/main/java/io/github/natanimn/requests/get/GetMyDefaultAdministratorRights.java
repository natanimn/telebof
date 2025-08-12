package io.github.natanimn.requests.get;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatAdministratorRights;

/**
 * GetMyDefaultAdministratorRights class. Returns {@link ChatAdministratorRights} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#getMyDefaultAdministratorRights}
 */
public class GetMyDefaultAdministratorRights extends AbstractBaseRequest<GetMyDefaultAdministratorRights, ChatAdministratorRights> {
    /**
     * Required
     * @param requestSender request sender
     */
    public GetMyDefaultAdministratorRights(RequestSender requestSender) {
        super(requestSender, "getMyDefaultAdministratorRights", ChatAdministratorRights.class);
    }

    /**
     * Optional
     * @param for_channel Pass True to get default administrator rights of the bot in channels.
     *                    Otherwise, default administrator rights of the bot for groups and supergroups will be returned.
     * @return {@link GetMyDefaultAdministratorRights}
     */
    public GetMyDefaultAdministratorRights forChannel(boolean for_channel) {
        return add("for_channel", for_channel);
    }

}
