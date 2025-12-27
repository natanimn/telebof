package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.enums.ChatAction;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;

/**
 * SendChatAction class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#sendChatAction
 */
public class SendChatAction extends AbstractBaseRequest<SendChatAction, Boolean> {

    /**
     * Required
     * @param chatId chat id
     * @param action action
     * @param api api
     */
    public SendChatAction(Object chatId, ChatAction action, Api api) {
        super(chatId, api, "sendChatAction", Boolean.class);
        add("action", action);
    }

    /**
     * Optional
     * @param messageThreadId Unique identifier for the target message thread; for supergroups only
     * @return {@link SendChatAction}
     */
    public SendChatAction messageThreadId(int messageThreadId) {
        return add("message_thread_id", messageThreadId);
    }

    /**
     * Optional
     * @param businessConnectionId Unique identifier of the business connection on behalf of which the action will be sent
     * @return {@link SendChatAction}
     */
    public SendChatAction businessConnectionId(String businessConnectionId){
        return add("business_connection_id", businessConnectionId);
    }

}
