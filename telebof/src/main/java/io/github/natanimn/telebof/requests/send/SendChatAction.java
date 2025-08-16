package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.enums.ChatAction;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.BotContext;

/**
 * SendChatAction class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#sendChatAction
 */
public class SendChatAction extends AbstractBaseRequest<SendChatAction, Boolean> {

    /**
     * Required
     * @param chat_id chat id
     * @param action action
     * @param requestSender request sender
     */
    public SendChatAction(Object chat_id, ChatAction action, RequestSender requestSender) {
        super(chat_id, requestSender, "sendChatAction", Boolean.class);
        add("action", action);
    }

    /**
     * Optional
     * @param message_thread_id Unique identifier for the target message thread; for supergroups only
     * @return {@link SendChatAction}
     */
    public SendChatAction messageThreadId(int message_thread_id) {
        return add("message_thread_id", message_thread_id);
    }

    /**
     * Optional
     * @param business_connection_id Unique identifier of the business connection on behalf of which the action will be sent
     * @return {@link SendChatAction}
     */
    public SendChatAction businessConnectionId(String business_connection_id){
        return add("business_connection_id", business_connection_id);
    }

}
