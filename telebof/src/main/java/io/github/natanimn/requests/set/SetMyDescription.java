package io.github.natanimn.requests.set;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

/**
 * SetMyDescription class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#setMyDescription()}
 */
public class SetMyDescription extends AbstractBaseRequest<SetMyDescription, Boolean> {
    /**
     * Required
     * @param requestSender request sender
     */
    public SetMyDescription(RequestSender requestSender){
        super(requestSender, "setMyDescription");


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
