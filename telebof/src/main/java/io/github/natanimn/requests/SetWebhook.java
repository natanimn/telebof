package io.github.natanimn.requests;

import io.github.natanimn.Webhook;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class SetWebhook extends AbstractBaseRequest<SetWebhook, Boolean> {
    public SetWebhook(Webhook webhook, RequestSender requestSender){
        super(requestSender, "setWebhook");
        for (String key: webhook.getObjectMap().keySet()){
            add(key, webhook.getObjectMap().get(key));
        }
    }

}
