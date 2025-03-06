package io.github.natanimn.requests;

import io.github.natanimn.types.BotCommandScope;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
