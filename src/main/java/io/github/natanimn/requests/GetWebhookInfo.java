package io.github.natanimn.requests;

import io.github.natanimn.types.WebhookInfo;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetWebhookInfo extends AbstractBaseRequest<GetWebhookInfo, WebhookInfo> {
    public GetWebhookInfo(RequestSender requestSender){
        super(requestSender, "getWebhookInfo", WebhookInfo.class);
    }

}
