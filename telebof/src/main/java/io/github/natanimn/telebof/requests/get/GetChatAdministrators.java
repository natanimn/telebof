package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.ChatMember;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetChatAdministrators class. Returns an array of {@link ChatMember} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 2.0.0
 * @see BotContext#getChatAdministrators
 */
public class GetChatAdministrators extends AbstractBaseRequest<GetChatAdministrators, List<ChatMember>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, ChatMember.class).getType();

    /**
     * Required
     * @param chatId chat id
     * @param api api
     */
    public GetChatAdministrators(Object chatId, Api api){
        super(chatId, api, "getChatAdministrators", responseType);
    }

    /**
     * Optional
     * @param returnBots Pass True to additionally receive all bots that are administrators of the chat.
     *                   By default, bots other than the current bot are omitted.
     * @return {@link GetChatAdministrators}
     */
    public GetChatAdministrators returnBots(Boolean returnBots){
        return add("return_bots", returnBots);
    }

}
