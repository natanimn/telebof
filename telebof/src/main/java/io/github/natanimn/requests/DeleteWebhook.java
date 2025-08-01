package io.github.natanimn.requests;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class DeleteWebhook extends AbstractBaseRequest<DeleteWebhook, Boolean>{
    public DeleteWebhook(RequestSender requestSender){
        super(requestSender, "deleteWebhook");
    }

    public DeleteWebhook dropPendingUpdates(boolean dropPendingUpdates){
        return add("drop_pending_updates", dropPendingUpdates);
    }

}
