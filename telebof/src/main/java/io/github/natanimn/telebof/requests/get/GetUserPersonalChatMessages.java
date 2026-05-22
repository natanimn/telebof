package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.BotContext;

import java.util.List;
import java.lang.reflect.Type;
import com.google.gson.reflect.TypeToken;

/**
 * GetUserPersonalChatMessages class. Returns list of {@link Message} on success.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 * @see BotContext#getUserPersonalChatMessages
 */
public class GetUserPersonalChatMessages extends AbstractBaseRequest<GetUserPersonalChatMessages, List<Message>>{
    private static final Type responseType = TypeToken.getParameterized(List.class, Message.class).getType();

    public GetUserPersonalChatMessages(long userId, int limit, Api api){
        super(api, "getUserPersonalChatMessages", responseType);
        add("user_id", userId);
        add("limit", limit);
    }
}
