package io.github.natanimn.requests.get;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.bot.BotName;

/**
 * GetMyName class. Returns {@link BotName} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#getMyName()}
 */
public class GetMyName extends AbstractBaseRequest<GetMyName, BotName> {
    /**
     * Required
     * @param requestSender request sender
     */
    public GetMyName(RequestSender requestSender){
        super(requestSender, "getMyName", BotName.class);
    }

    /**
     * Optional
     * @param language_code A two-letter ISO 639-1 language code or an empty string
     * @return {@link GetMyName}
     */
    public GetMyName languageCode(String language_code){
        return add("language_code", language_code);
    }

}
