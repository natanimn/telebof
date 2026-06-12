package io.github.natanimn.telebof.spring;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WebhookConfigTest {
    @Test
    public void TestWebhookConfig(){
        String url = "www.example.com";
        String secretToken = "123-@-secretKey";
        String ipAddress = "127.0.0.1";

        WebhookConfig config = new WebhookConfig(url);

        assertEquals(url, config.getUrl());

        WebhookConfig conf = WebhookConfig.builder(url)
                .secretToken(secretToken)
                .ipAddress(ipAddress)
                .build();

        assertEquals(secretToken, conf.getSecretToken());
        assertEquals(ipAddress, conf.getIpAddress());
    }
}
