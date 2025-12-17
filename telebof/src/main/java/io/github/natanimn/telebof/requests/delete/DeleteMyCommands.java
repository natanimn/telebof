package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.bot.BotCommandScope;

/**
 * DeleteMyCommands class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#deleteMyCommands
 */
public class DeleteMyCommands extends AbstractBaseRequest<DeleteMyCommands, Boolean> {
    /**
     * Required
     * @param api api
     */
    public DeleteMyCommands(Api api) {
        super(api, "deleteMyCommands");
    }

    /**
     * Optional
     * @param scope A JSON-serialized object, describing scope of users for which the commands are relevant.
     *                         Defaults to {@link io.github.natanimn.telebof.types.bot.BotCommandScopeDefault}.
     * @return {@link DeleteMyCommands}
     */
    public DeleteMyCommands scope(BotCommandScope scope) {
        return add("scope", scope);
    }

    /**
     * Optional
     * @param languageCode A two-letter ISO 639-1 language code.
     *                      If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     * @return {@link DeleteMyCommands}
     */
    public DeleteMyCommands languageCode(String languageCode) {
        return add("language_code", languageCode);
    }

}
