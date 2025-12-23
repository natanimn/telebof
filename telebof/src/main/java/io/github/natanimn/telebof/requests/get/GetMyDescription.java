package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotDescription;

/**
 * GetMyDescription class. Returns {@link BotDescription} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getMyDescription()
 */
public class GetMyDescription extends AbstractBaseRequest<GetMyDescription, BotDescription> {
    public GetMyDescription(Api api) {
        super(api, "getMyDescription", BotDescription.class);
    }

    /**
     * Optional
     * @param languageCode language_code
     * @return {@link GetMyDescription}
     */
    public GetMyDescription languageCode(String languageCode){
        return add("language_code", languageCode);
    }
}
