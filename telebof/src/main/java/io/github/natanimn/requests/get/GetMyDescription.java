package io.github.natanimn.requests.get;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.bot.BotDescription;

/**
 * GetMyDescription class. Returns {@link BotDescription} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#getMyDescription()}
 */
public class GetMyDescription extends AbstractBaseRequest<GetMyDescription, BotDescription> {
    public GetMyDescription(RequestSender requestSender) {
        super(requestSender, "getMyDescription", BotDescription.class);
    }

    /**
     * Optional
     * @param language_code language_code
     * @return {@link GetMyDescription}
     */
    public GetMyDescription languageCode(String language_code){
        return add("language_code", language_code);
    }
}
