package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.log.BotLog;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.logging.Level;

public class AsyncRequestTest {
    private BotClient client;
    private final long CHAT_ID = 5213764043L;

    @BeforeEach
    public void setUp(){
        Optional<String> token = Optional.ofNullable(System.getenv("BOT_TOKEN"));

        if (token.isEmpty()){
            System.err.println("Environment variable of BOT_TOKEN is not found");
            System.exit(1);
        }
        BotLog.setLogLevel(Level.FINE);
        this.client = new BotClient(token.get());
    }

    @Test
    public void testSendMessage() throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(2);

        File file = new File("src/test/resources/telegram.png");

        client.context.sendPhoto(CHAT_ID, file).await(message -> latch.countDown());

        client.context.sendMessage(CHAT_ID, "<b>Hello this is async request</b>")
                .parseMode(ParseMode.HTML)
                .await(message -> latch.countDown());
        latch.await();
    }
}
