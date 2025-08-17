package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteWebhook class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class DeleteWebhook extends AbstractBaseRequest<DeleteWebhook, Boolean> {
    public DeleteWebhook(Api api){
        super(api, "deleteWebhook");
    }

    /**
     * Optional
     * @param drop_pending_updates Pass True to drop all pending updates
     * @return {@link DeleteWebhook}
     */
    public DeleteWebhook dropPendingUpdates(boolean drop_pending_updates){
        return add("drop_pending_updates", drop_pending_updates);
    }

}
