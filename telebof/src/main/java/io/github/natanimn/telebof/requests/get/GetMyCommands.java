package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.bot.BotCommand;
import io.github.natanimn.telebof.types.bot.BotCommandScope;
import java.lang.reflect.Type;
import java.util.List;

/**
 * GetMyCommands class. Returns an Array of {@link BotCommand} objects. If commands aren't set, an empty list is returned.
 * @author Natanim
 * @since 3 March 2025
 * @see BotContext#getMyCommands
 */
public class GetMyCommands extends AbstractBaseRequest<GetMyCommands, List<BotCommand> > {

    private static final Type responseType = TypeToken.getParameterized(List.class, BotCommand.class).getType();

    /**
     * Required
     * @param requestSender request sender
     */
    public GetMyCommands(RequestSender requestSender) {
        super(requestSender, "getMyCommands", responseType);
    }

    /**
     * Optional
     * @param bot_command_scope A JSON-serialized object, describing scope of users. Defaults to {@link io.github.natanimn.telebof.types.bot.BotCommandScopeDefault}.
     * @return {@link GetMyCommands}
     */
    public GetMyCommands scope(BotCommandScope bot_command_scope) {
        return add("scope", bot_command_scope);
    }

    /**
     * Optional
     * @param language_code A two-letter ISO 639-1 language code or an empty string
     * @return {@link GetMyCommands}
     */
    public GetMyCommands languageCode(String language_code) {
        return add("language_code", language_code);
    }

}
