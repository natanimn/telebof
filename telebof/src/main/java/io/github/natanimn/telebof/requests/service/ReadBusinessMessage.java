package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * ReadBusinessMessage class. Returns True on success.
 * @author Natanim
 * @since 19 August 20025
 * @see io.github.natanimn.telebof.BotContext#readBusinessMessage
 */
public class ReadBusinessMessage extends AbstractBaseRequest<ReadBusinessMessage, Boolean> {
    public ReadBusinessMessage(long chat_id, String business_connection_id, int message_id, Api api){
        super(chat_id, api, "readBusinessMessage", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("message_id", message_id);
    }
}
