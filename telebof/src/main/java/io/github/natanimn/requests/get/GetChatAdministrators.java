package io.github.natanimn.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatMember;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetChatAdministrators class. Returns an array of {@link ChatMember} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getChatAdministrators}
 */
public class GetChatAdministrators extends AbstractBaseRequest<GetChatAdministrators, List<ChatMember>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, ChatMember.class).getType();

    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public GetChatAdministrators(Object chat_id, RequestSender requestSender){
        super(chat_id, requestSender, "getChatAdministrators", responseType);
    }

}
