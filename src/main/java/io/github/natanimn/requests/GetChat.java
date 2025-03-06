package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.ChatFullInfo;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetChat extends AbstractBaseRequest<GetChat, ChatFullInfo> {
    public GetChat(Object chatId, RequestSender requestSender) {
        super(chatId, requestSender, "getChat", ChatFullInfo.class);
    }

}
