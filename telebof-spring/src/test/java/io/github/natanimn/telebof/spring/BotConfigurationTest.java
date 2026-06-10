package io.github.natanimn.telebof.spring;

import org.springframework.boot.test.context.runner.ApplicationContextRunner;
import io.github.natanimn.telebof.BotClient;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.mockingDetails;

public class BotConfigurationTest {
    private ApplicationContextRunner contextRunner = new ApplicationContextRunner()
            .withUserConfiguration(BotConfiguration.class);

    @Test
    void shouldNotLoadConfigurationWhenDisabled() {
        contextRunner
                .withPropertyValues("bot.enabled=false")
                .run(context -> {
                    assertThat(context).doesNotHaveBean(BotClient.class);
                    assertThat(context).doesNotHaveBean(BotInitializer.class);
                });
    }

    @Test
    void shouldCreateBotClient() {
        contextRunner
                .withPropertyValues("bot.token=test-token")
                .run(context -> {
                    assertThat(context).hasSingleBean(BotClient.class);
                });
    }

    @Test
    void shouldRespectExistingBotClient() {
        contextRunner
                .withPropertyValues("bot.token=test-token")
                .withBean(BotClient.class, () -> mock(BotClient.class))
                .run(context -> {

                    BotClient bean = context.getBean(BotClient.class);

                    assertThat(context).hasSingleBean(BotClient.class);
                    assertThat(mockingDetails(bean).isMock()).isTrue();
                });
    }

    @Test
    void shouldCreateWebhookConfig() {
        contextRunner
                .withPropertyValues(
                        "bot.token=test",
                        "bot.webhook.url=https://example.com"
                )
                .run(context -> {
                    assertThat(context).hasSingleBean(WebhookConfig.class);
                });
    }

    @Test
    void shouldCreateWebhookInitializer() {
        contextRunner
                .withUserConfiguration(TestBotBean.class)
                .withPropertyValues(
                        "bot.token=test",
                        "bot.webhook.enabled=true",
                        "bot.webhook.url=https://example.com"
                )
                .run(context -> {
                    assertThat(context)
                            .hasBean("webhookInitializer");
                });
    }

    @Test
    void shouldCreateDefaultInitializer() {
        contextRunner
                .withUserConfiguration(TestBotBean.class)
                .withPropertyValues("bot.token=test")
                .run(context -> {

                    assertThat(context)
                            .hasBean("defaultInitializer");

                    assertThat(context)
                            .doesNotHaveBean("webhookInitializer");
                });
    }
}
