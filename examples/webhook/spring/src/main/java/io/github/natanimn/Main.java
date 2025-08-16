package io.github.natanimn;

import io.github.natanimn.telebof.filters.Filter;
import io.github.natanimn.telebof.types.updates.Update;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Level;


@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}

@RestController
class WebhookController {

    private final BotClient bot;

    private final String TOKEN = "BOT_TOKEN";

    private final String URL   = "https://your-domain.com";

    public WebhookController() {
        BotLog.setLogLevel(Level.INFO);
        this.bot = new BotClient(TOKEN);

        bot.context.deleteWebhook();

        bot.context.setWebhook(String.format("%s/webhook", URL)).exec();

        bot.onMessage(filter -> filter.commands("start"), (ctx, message) -> {
            ctx.sendMessage(message.chat.id, "Hello, I am spring-boot echo bot").exec();
        });

        bot.onMessage(Filter::text, (ctx, message) -> {
            ctx.sendMessage(message.chat.id, message.text).exec();
        });
    }

    /**
     * Listen on /webhook
     * @param updates updates sent by Telegram
     * @return OK
     */
    @PostMapping("/webhook")
    public String getUpdates(@RequestBody List<Update> updates) {
        bot.processUpdates(updates);
        return "OK";
    }
}
