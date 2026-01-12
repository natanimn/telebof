package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotCommand;
import io.github.natanimn.telebof.types.bot.BotCommandScope;

/**
 * SetMyCommands class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#setMyCommands
 */
public class SetMyCommands extends AbstractBaseRequest<SetMyCommands, Boolean> {
    /**
     * Required
     * @param commands commands
     * @param api api
     */
    public SetMyCommands(BotCommand[] commands, Api api) {
        super(api, "setMyCommands");
        add("commands", commands);
    }

    /**
     * Optional
     * @param scope A JSON-serialized object, describing scope of users for which the commands are relevant.
     *                          Defaults to {@link io.github.natanimn.telebof.types.bot.BotCommandScopeDefault}
     * @return {@link SetMyCommands}
     */
    public SetMyCommands scope(BotCommandScope scope) {
        return add("scope", scope);
    }

    /**
     * Optional
     * @param languageCode A two-letter ISO 639-1 language code.
     *                      If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     * @return {@link SetMyCommands}
     */
    public SetMyCommands languageCode(String languageCode) {
        return add("language_code", languageCode);
    }

}
