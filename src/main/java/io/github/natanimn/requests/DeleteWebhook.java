package io.github.natanimn.requests;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class DeleteWebhook extends AbstractBaseRequest<DeleteWebhook, Boolean>{
    public DeleteWebhook(RequestSender requestSender){
        super(requestSender, "deleteWebhook");
    }

    public DeleteWebhook dropPendingUpdates(boolean dropPendingUpdates){
        return add("drop_pending_updates", dropPendingUpdates);
    }

}
