package io.github.natanimn.requests.set;

import io.github.natanimn.enums.Updates;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;

import java.io.File;

/**
 * SetWebhook class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class SetWebhook extends AbstractBaseRequest<SetWebhook, Boolean> {
    /**
     * Required
     * @param url url
     * @param requestSender
     */
    public SetWebhook(String url, RequestSender requestSender){
        super(requestSender, "setWebhook");
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
     * @param ip_address The fixed IP address which will be used to send webhook requests instead of the IP address resolved through DNS
     * @return {@link SetWebhook}
     */
    public SetWebhook ipAddress(String ip_address){
        return add("ip_address", ip_address);
    }

    /**
     * Optional
     * @param max_connections The maximum allowed number of simultaneous HTTPS connections to the webhook for update delivery, 1-100.
     *                        Defaults to 40. Use lower values to limit the load on your bot's server, and higher values to increase your bot's throughput.
     * @return {@link SetWebhook}
     */
    public SetWebhook maxConnections(int max_connections){
        return add("max_connections", max_connections);
    }

    /**
     * Optional
     * @param allowed_updates A JSON-serialized list of the update types you want your bot to receive.
     * @return {@link SetWebhook}
     */
    public SetWebhook allowedUpdates(Updates[] allowed_updates){
        return add("allowed_updates", allowed_updates);
    }

    /**
     * Optional
     * @param drop_pending_updates Pass True to drop all pending updates
     * @return {@link SetWebhook}
     */
    public SetWebhook dropPendingUpdates(Boolean drop_pending_updates){
        return add("drop_pending_updates", drop_pending_updates);
    }

    /**
     * Optional
     * @param secret_token A secret token to be sent in a header “X-Telegram-Bot-Api-Secret-Token” in every webhook request, 1-256 characters.
     *                    Only characters A-Z, a-z, 0-9, _ and - are allowed. The header is useful to ensure that the request comes from a webhook set by you.
     * @return {@link SetWebhook}
     */
    public SetWebhook secretToken(String secret_token){
        return add("secret_token", secret_token);
    }
}
