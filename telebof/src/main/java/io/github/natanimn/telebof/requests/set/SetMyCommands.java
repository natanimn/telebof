package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotCommand;
import io.github.natanimn.telebof.types.bot.BotCommandScope;

import java.util.List;

/**
 * SetMyCommands class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
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
        add("commands", List.of(commands));
    }

    /**
     * Optional
     * @param bot_command_scope A JSON-serialized object, describing scope of users for which the commands are relevant.
     *                          Defaults to {@link io.github.natanimn.telebof.types.bot.BotCommandScopeDefault}
     * @return {@link SetMyCommands}
     */
    public SetMyCommands scope(BotCommandScope bot_command_scope) {
        return add("scope", bot_command_scope);
    }

    /**
     * Optional
     * @param language_code A two-letter ISO 639-1 language code.
     *                      If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     * @return {@link SetMyCommands}
     */
    public SetMyCommands languageCode(String language_code) {
        return add("language_code", language_code);
    }

}
