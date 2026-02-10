package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotShortDescription;

/**
 * GetMyShortDescription class. Returns {@link BotShortDescription} on success.
 * @author Natanim
 * @version 1.4.0
 */
public class GetMyShortDescription extends AbstractBaseRequest<GetMyShortDescription, BotShortDescription> {
    public GetMyShortDescription(Api api){
        super(api, "getMyShortDescription", BotShortDescription.class);
    }

    public GetMyShortDescription languageCode(String languageCode){
        add("language_code", languageCode);
        return this;
    }
}
