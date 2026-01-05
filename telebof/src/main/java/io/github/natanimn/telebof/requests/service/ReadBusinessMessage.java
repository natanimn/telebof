package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * ReadBusinessMessage class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#readBusinessMessage
 */
public class ReadBusinessMessage extends AbstractBaseRequest<ReadBusinessMessage, Boolean> {
    public ReadBusinessMessage(long chatId, String businessConnectionId, int messageId, Api api){
        super(chatId, api, "readBusinessMessage", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("message_id", messageId);
    }
}
