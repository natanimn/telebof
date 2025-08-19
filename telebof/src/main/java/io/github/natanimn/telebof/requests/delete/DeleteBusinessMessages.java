package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteBusinessMessages class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#deleteBusinessMessages
 */
public class DeleteBusinessMessages extends AbstractBaseRequest<DeleteBusinessMessages, Boolean> {
    /**
     * Required
     * @param business_connection_id business connection id
     * @param message_ids message ids
     * @param api api
     */
    public DeleteBusinessMessages(String business_connection_id, Integer[] message_ids, Api api){
        super(api, "deleteBusinessMessages", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("message_ids", message_ids);
    }
}
