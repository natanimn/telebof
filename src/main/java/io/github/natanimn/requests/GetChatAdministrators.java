package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.Util;
import io.github.natanimn.types.ChatMember;
import io.github.natanimn.types.Update;

import java.lang.reflect.Type;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetChatAdministrators extends AbstractBaseRequest<GetChatAdministrators, List<ChatMember>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, ChatMember.class).getType();
    public GetChatAdministrators(Object chatId, RequestSender requestSender){
        super(chatId, requestSender, "getChatAdministrators", responseType);
    }

}
