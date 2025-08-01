package io.github.natanimn.requests;

import io.github.natanimn.types.bot.BotName;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetMyName extends AbstractBaseRequest<GetMyName, BotName> {
    public GetMyName(RequestSender requestSender){
        super(requestSender, "getMyName", BotName.class);
    }

}
