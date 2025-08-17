package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetMyName class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#setMyName()
 */
public class SetMyName extends AbstractBaseRequest<SetMyName, Boolean> {
    /**
     * Required
     * @param api api
     */
    public SetMyName(Api api){
        super(api, "setMyName");

    }

    /**
     * Optional
     * @param name New bot name; 0-64 characters. Pass an empty string to remove the dedicated name for the given language.
     * @return {@link SetMyName}
     */
    public SetMyName name(String name){
        return add("name", name);
    }

    /**
     * Optional
     * @param language_code A two-letter ISO 639-1 language code. If empty, the name will be shown to all users for whose language there is no dedicated name.
     * @return {@link SetMyName}
     */
    public SetMyName languageCode(String language_code){
        return add("language_code", language_code);
    }
}
