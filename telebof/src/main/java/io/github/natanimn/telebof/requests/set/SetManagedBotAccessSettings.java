package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.BotContext;

/**
 * SetManagedBotAccessSettings class. Returns True on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 * @see BotContext#setManagedBotAccessSettings
 */
public class SetManagedBotAccessSettings extends AbstractBaseRequest<SetManagedBotAccessSettings, Boolean>{
    public SetManagedBotAccessSettings(long userId, boolean isAccessRestricted, Api api){
        super(api, "setManagedBotAccessSettings");
        add("user_id", userId);
        add("is_access_restricted", isAccessRestricted);
    }

    /**
     * Optional
     * @param addedUserIds A JSON-serialized list of up to 10 identifiers of users who will have access to the bot in addition to its owner. Ignored if is_access_restricted is false.
     * @return {@link SetManagedBotAccessSettings}
     */
    public SetManagedBotAccessSettings addedUserIds(Long[] addedUserIds){
        return add("added_user_ids", addedUserIds);
    }
}
