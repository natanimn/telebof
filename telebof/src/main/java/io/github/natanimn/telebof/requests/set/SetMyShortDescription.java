package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * SetMyShortDescription class. Returns True on success.
 * @author Natanim
 * @version 1.4.0
 */
public class SetMyShortDescription extends AbstractBaseRequest<SetMyShortDescription, Boolean> {
    public SetMyShortDescription(Api api){
        super(api, "setMyShortDescription");
    }

    /**
     * Optional
     * @param shortDescription New short description for the bot; 0-120 characters. Pass an empty string to remove the dedicated short description for the given language.
     * @return {@link SetMyShortDescription}
     */
    public SetMyShortDescription shortDescription(String shortDescription){
        add("short_description", shortDescription);
        return this;
    }

    /**
     * Optional
     * @param languageCode A two-letter ISO 639-1 language code. If empty, the short description will be applied to all users for whose language there is no dedicated short description.
     * @return {@link SetMyShortDescription}
     */
    public SetMyShortDescription languageCode(String languageCode){
        add("language_code", languageCode);
        return this;
    }
}
