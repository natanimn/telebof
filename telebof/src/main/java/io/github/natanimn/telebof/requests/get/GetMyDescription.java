package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotDescription;

/**
 * GetMyDescription class. Returns {@link BotDescription} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getMyDescription()
 */
public class GetMyDescription extends AbstractBaseRequest<GetMyDescription, BotDescription> {
    public GetMyDescription(Api api) {
        super(api, "getMyDescription", BotDescription.class);
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
