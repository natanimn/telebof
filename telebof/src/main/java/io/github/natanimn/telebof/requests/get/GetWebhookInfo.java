package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.web.WebhookInfo;

/**
 * Natanim Negash 
 *  3 March 2025
 */
public class GetWebhookInfo extends AbstractBaseRequest<GetWebhookInfo, WebhookInfo> {
    public GetWebhookInfo(Api api){
        super(api, "getWebhookInfo", WebhookInfo.class);
    }

}
