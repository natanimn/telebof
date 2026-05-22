package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotAccessSettings;
import io.github.natanimn.telebof.BotContext;

/**
 * GetManagedBotAccessSettings class. Returns {@link GetManagedBotAccessSettings} on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 * @see BotContext#getManagedBotAccessSettings(long)
 */
public class GetManagedBotAccessSettings extends AbstractBaseRequest<GetManagedBotAccessSettings, BotAccessSettings>{
    public GetManagedBotAccessSettings(long userId, Api api){
        super(api, "getManagedBotAccessSettings", BotAccessSettings.class);
        add("user_id", userId);
    }
}
