package io.github.natanimn.telebof.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.ApplicationContext;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.Handler;
import java.util.Map;
import java.util.List;

/**
 * BotConfiguration class.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
@Configuration
@ConditionalOnProperty(prefix = "bot", name = "enabled", havingValue = "true", matchIfMissing = true)
public class BotConfiguration {

    @Value("${bot.token:}")
    private String TOKEN;

    @Value("${bot.webhook.url:}")
    private String WEBHOOK_URL;

    @Bean
    @ConditionalOnMissingBean(BotClient.class)
    @ConditionalOnProperty(prefix = "bot", name = "token")
    public BotClient botClient(){
        return new BotClient(TOKEN);
    }

    @Bean
    @ConditionalOnProperty(prefix = "bot.webhook", name = "url")
    @ConditionalOnMissingBean(WebhookConfig.class)
    public WebhookConfig webhookConfig(){
        return new WebhookConfig(WEBHOOK_URL);
    }

    @Bean
    @ConditionalOnProperty(prefix = "bot.webhook", name = "enabled", havingValue = "true")
    @ConditionalOnProperty(prefix = "bot.webhook", name = "url")
    public BotInitializer webhookInitializer(ApplicationContext context, BotClient client, WebhookConfig config){
        Map<String, Object> beans = context.getBeansWithAnnotation(Bot.class);
        List<Handler> handlers = beans.values().stream()
                .map(bean -> {
                    Bot annotation = bean.getClass().getAnnotation(Bot.class);
                    return new Handler(bean, annotation.value());
                })
                .toList();

        return BotInitializer.builder(client, handlers)
               .withWebhook(config)
               .build();
    }


    @Bean
    @ConditionalOnProperty(prefix = "bot.webhook", name = "enabled", havingValue = "false", matchIfMissing = true)
    public BotInitializer defaultInitializer(ApplicationContext context, BotClient client){
        Map<String, Object> beans = context.getBeansWithAnnotation(Bot.class);
        List<Handler> handlers = beans.values().stream()
                .map(bean -> {
                    Bot annotation = bean.getClass().getAnnotation(Bot.class);
                    return new Handler(bean, annotation.value());
                })
                .toList();

        return BotInitializer.builder(client, handlers)
                .withDefault()
                .build();
    }
}
