package io.github.natanimn.telebof.spring;

import java.util.List;
import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.Handler;
import io.github.natanimn.telebof.requests.set.SetWebhook;

/**
 * BotInitializer class
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class BotInitializer {
    static class BotInitializerBuilder{
        private final BotClient client;
        private final List<Handler> handlers;
        private boolean withDefault = true;
        private SetWebhook webhook;

        public BotInitializerBuilder(BotClient client, List<Handler> handlers){
            this.client = client;
            this.handlers = handlers;
        }

        public BotInitializerBuilder withWebhook(WebhookConfig config){
            this.webhook = client.context.setWebhook(config.getUrl());
            if (config.getIpAddress() != null)
                this.webhook.ipAddress(config.getIpAddress());
            if (config.getSecretToken() != null)
                this.webhook.secretToken(config.getSecretToken());
            if (config.getMaxConnections() != null)
                this.webhook.maxConnections(config.getMaxConnections());
            if (config.getDropPendingUpdates() != null)
                this.webhook.dropPendingUpdates(config.getDropPendingUpdates());
            this.withDefault = false;
            return this;
        }

        public BotInitializer build(){
            this.client.addHandlers(handlers);
            if (withDefault)
                this.client.startPolling();
            else
                this.webhook.exec();
            return new BotInitializer();
        }

        public BotInitializerBuilder withDefault(){
            this.withDefault = true;
            return this;
        }

    }

    static BotInitializerBuilder builder(BotClient client, List<Handler> handlers){
        return new BotInitializerBuilder(client, handlers);
    }
}
