package io.github.natanimn.requests;

import io.github.natanimn.types.BotCommandScope;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class DeleteMyCommands extends AbstractBaseRequest<DeleteMyCommands, Boolean> {
    public DeleteMyCommands(RequestSender requestSender) {
        super(requestSender, "deleteMyCommands");
    }

    public DeleteMyCommands scope(BotCommandScope botCommandScope) {
        return add("scope", botCommandScope);
    }

    public DeleteMyCommands languageCode(String languageCode) {
        return add("language_code", languageCode);
    }

}
