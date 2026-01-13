package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.enums.Updates;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

import java.io.File;

/**
 * SetWebhook class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class SetWebhook extends AbstractBaseRequest<SetWebhook, Boolean> {
    /**
     * Required
     * @param url url
     * @param api api
     */
    public SetWebhook(String url, Api api){
        super(api, "setWebhook");
        add("url", url);
    }

    /**
     * Optional
     * @param certificate Upload your public key certificate so that the root certificate in use can be checked.
     * @return {@link SetWebhook}
     * @see <a href="https://core.telegram.org/bots/self-signed">Self-signed guide for details</a>
     */
    public SetWebhook certificate(File certificate){
        return add("certificate", certificate);
    }

    /**
     * Optional
     * @param ipAddress The fixed IP address which will be used to send webhook requests instead of the IP address resolved through DNS
     * @return {@link SetWebhook}
     */
    public SetWebhook ipAddress(String ipAddress){
        return add("ip_address", ipAddress);
    }

    /**
     * Optional
     * @param maxConnections The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery, 1-100.
     *                        Defaults to 40. Use lower values to limit the load on your bot's server, and higher values to increase your bot's throughput.
     * @return {@link SetWebhook}
     */
    public SetWebhook maxConnections(int maxConnections){
        return add("max_connections", maxConnections);
    }

    /**
     * Optional
     * @param allowedUpdates A JSON-serialized list of the update types you want your bot to receive.
     * @return {@link SetWebhook}
     */
    public SetWebhook allowedUpdates(Updates[] allowedUpdates){
        return add("allowed_updates", allowedUpdates);
    }

    /**
     * Optional
     * @param dropPendingUpdates Pass True to drop all pending updates
     * @return {@link SetWebhook}
     */
    public SetWebhook dropPendingUpdates(Boolean dropPendingUpdates){
        return add("drop_pending_updates", dropPendingUpdates);
    }

    /**
     * Optional
     * @param secretToken A secret token to be sent in a header “X-Telegram-Bot-Api-Secret-Token” in every webhook request, 1-256 characters.
     *                    Only characters A-Z, a-z, 0-9, _ and - are allowed. The header is useful to ensure that the request comes from a webhook set by you.
     * @return {@link SetWebhook}
     */
    public SetWebhook secretToken(String secretToken){
        return add("secret_token", secretToken);
    }
}
