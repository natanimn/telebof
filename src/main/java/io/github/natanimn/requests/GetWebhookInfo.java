package io.github.natanimn.requests;

import io.github.natanimn.types.web.WebhookInfo;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetWebhookInfo extends AbstractBaseRequest<GetWebhookInfo, WebhookInfo> {
    public GetWebhookInfo(RequestSender requestSender){
        super(requestSender, "getWebhookInfo", WebhookInfo.class);
    }

}
