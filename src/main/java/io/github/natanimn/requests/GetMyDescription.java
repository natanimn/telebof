package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.bot.BotDescription;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetMyDescription extends AbstractBaseRequest<GetMyDescription, BotDescription> {
    public GetMyDescription(RequestSender requestSender) {
        super(requestSender, "getMyDescription", BotDescription.class);
    }

}
