package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteBusinessMessages class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#deleteBusinessMessages
 */
public class DeleteBusinessMessages extends AbstractBaseRequest<DeleteBusinessMessages, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param messageIds message ids
     * @param api api
     */
    public DeleteBusinessMessages(String businessConnectionId, Integer[] messageIds, Api api){
        super(api, "deleteBusinessMessages", Boolean.class);
        add("business_connection_id", businessConnectionId);
        add("message_ids", messageIds);
    }
}
