package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetMyDescription class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setMyDescription()
 */
public class SetMyDescription extends AbstractBaseRequest<SetMyDescription, Boolean> {
    /**
     * Required
     * @param api api
     */
    public SetMyDescription(Api api){
        super(api, "setMyDescription");


    }

    /**
     * Optional
     * @param description New bot description; 0-512 characters.
     *                    Pass an empty string to remove the dedicated description for the given language.
     * @return {@link SetMyDescription}
     */
    public SetMyDescription description(String description){
        return add("description", description);
    }

    /**
     * Optional
     * @param language_code A two-letter ISO 639-1 language code.
     *                      If empty, the description will be applied to all users for whose language there is no dedicated description.
     * @return {@link SetMyDescription}
     */
    public SetMyDescription languageCode(String language_code){
        return add("language_code", language_code);
    }
}
