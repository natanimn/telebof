package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatAdministratorRights;

/**
 * GetMyDefaultAdministratorRights class. Returns {@link ChatAdministratorRights} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getMyDefaultAdministratorRights
 */
public class GetMyDefaultAdministratorRights extends AbstractBaseRequest<GetMyDefaultAdministratorRights, ChatAdministratorRights> {
    /**
     * Required
     * @param api api
     */
    public GetMyDefaultAdministratorRights(Api api) {
        super(api, "getMyDefaultAdministratorRights", ChatAdministratorRights.class);
    }

    /**
     * Optional
     * @param forChannel Pass True to get default administrator rights of the bot in channels.
     *                    Otherwise, default administrator rights of the bot for groups and supergroups will be returned.
     * @return {@link GetMyDefaultAdministratorRights}
     */
    public GetMyDefaultAdministratorRights forChannel(boolean forChannel) {
        return add("for_channel", forChannel);
    }

}
