package io.github.natanimn.requests;

import io.github.natanimn.types.BotCommand;
import io.github.natanimn.types.BotCommandScope;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

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
