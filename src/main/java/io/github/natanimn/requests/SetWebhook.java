package io.github.natanimn.requests;

import io.github.natanimn.Webhook;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class SetWebhook extends AbstractBaseRequest<SetWebhook, Boolean> {
    public SetWebhook(Webhook webhook, RequestSender requestSender){
        super(requestSender, "setWebhook");
        for (String key: webhook.getObjectMap().keySet()){
            add(key, webhook.getObjectMap().get(key));
        }
    }

}
