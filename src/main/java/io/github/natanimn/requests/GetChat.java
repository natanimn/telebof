package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ChatFullInfo;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetChat extends AbstractBaseRequest<GetChat, ChatFullInfo> {
    public GetChat(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "getChat", ChatFullInfo.class);
    }

}
