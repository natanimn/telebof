package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.chat_and_user.ChatFullInfo;

/**
 * GetChat class. Returns {@link ChatFullInfo} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#getChat
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
