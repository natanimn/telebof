package io.github.natanimn.requests.delete;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.bot.BotCommandScope;

/**
 * DeleteMyCommands class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#deleteMyCommands}
 */
public class DeleteMyCommands extends AbstractBaseRequest<DeleteMyCommands, Boolean> {
    /**
     * Required
     * @param requestSender request sender
     */
    public DeleteMyCommands(RequestSender requestSender) {
        super(requestSender, "deleteMyCommands");
    }

    /**
     * Optional
     * @param bot_command_scope A JSON-serialized object, describing scope of users for which the commands are relevant.
     *                         Defaults to {@link io.github.natanimn.types.bot.BotCommandScopeDefault}.
     * @return {@link DeleteMyCommands}
     */
    public DeleteMyCommands scope(BotCommandScope bot_command_scope) {
        return add("scope", bot_command_scope);
    }

    /**
     * Optional
     * @param language_code A two-letter ISO 639-1 language code.
     *                      If empty, commands will be applied to all users from the given scope, for whose language there are no dedicated commands
     * @return {@link DeleteMyCommands}
     */
    public DeleteMyCommands languageCode(String language_code) {
        return add("language_code", language_code);
    }

}
