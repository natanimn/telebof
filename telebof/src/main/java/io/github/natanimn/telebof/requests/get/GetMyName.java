package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotName;

/**
 * GetMyName class. Returns {@link BotName} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getMyName()
 */
public class GetMyName extends AbstractBaseRequest<GetMyName, BotName> {
    /**
     * Required
     * @param api api
     */
    public GetMyName(Api api){
        super(api, "getMyName", BotName.class);
    }

    /**
     * Optional
     * @param languageCode A two-letter ISO 639-1 language code or an empty string
     * @return {@link GetMyName}
     */
    public GetMyName languageCode(String languageCode){
        return add("language_code", languageCode);
    }

}
