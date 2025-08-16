package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.RequestSender;
import io.github.natanimn.telebof.types.web.WebhookInfo;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetWebhookInfo extends AbstractBaseRequest<GetWebhookInfo, WebhookInfo> {
    public GetWebhookInfo(RequestSender requestSender){
        super(requestSender, "getWebhookInfo", WebhookInfo.class);
    }

}
