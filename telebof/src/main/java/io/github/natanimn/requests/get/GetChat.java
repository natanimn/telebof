package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.ChatFullInfo;

/**
 * GetChat class. Returns {@link ChatFullInfo} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getChat}
 */
public class GetChat extends AbstractBaseRequest<GetChat, ChatFullInfo> {
    /**
     * Required
     * @param chat_id chat id
     * @param requestSender request sender
     */
    public GetChat(Object chat_id, RequestSender requestSender) {
        super(chat_id, requestSender, "getChat", ChatFullInfo.class);
    }

}
