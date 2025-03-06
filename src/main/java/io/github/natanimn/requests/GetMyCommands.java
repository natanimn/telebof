package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.types.BotCommand;
import io.github.natanimn.types.BotCommandScope;
import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetMyCommands extends AbstractBaseRequest<GetMyCommands, List<BotCommand> > {

    private static final Type responseType = TypeToken.getParameterized(List.class, BotCommand.class).getType();

    public GetMyCommands(RequestSender requestSender) {
        super(requestSender, "getMyCommands", responseType);
    }

    public GetMyCommands scope(BotCommandScope botCommandScope) {
        return add("scope", botCommandScope);
    }

    public GetMyCommands languageCode(String languageCode) {
        return add("language_code", languageCode);
    }

}
