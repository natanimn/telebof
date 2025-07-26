package io.github.natanimn.requests;

import io.github.natanimn.types.chat_and_user.bot.BotCommand;
import io.github.natanimn.types.chat_and_user.bot.BotCommandScope;

import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class SetMyCommands extends AbstractBaseRequest<SetMyCommands, Boolean> {
    public SetMyCommands(BotCommand[] commands, RequestSender requestSender) {
        super(requestSender, "setMyCommands");
        add("commands", List.of(commands));
    }

    public SetMyCommands scope(BotCommandScope botCommandScope) {
        return add("scope", botCommandScope);
    }

    public SetMyCommands languageCode(String languageCode) {
        return add("language_code", languageCode);
    }

}
