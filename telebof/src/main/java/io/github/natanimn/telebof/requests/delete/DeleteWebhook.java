package io.github.natanimn.telebof.requests.delete;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * DeleteWebhook class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class DeleteWebhook extends AbstractBaseRequest<DeleteWebhook, Boolean> {
    public DeleteWebhook(Api api){
        super(api, "deleteWebhook");
    }

    /**
     * Optional
     * @param dropPendingUpdates Pass True to drop all pending updates
     * @return {@link DeleteWebhook}
     */
    public DeleteWebhook dropPendingUpdates(boolean dropPendingUpdates){
        return add("drop_pending_updates", dropPendingUpdates);
    }

}
