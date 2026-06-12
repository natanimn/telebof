# Spring Boot Webhook Bot

This example demonstrates how to integrate a Telebof bot with Spring Boot using webhooks instead of long polling. Webhooks provide a more efficient and scalable approach for production environments by having Telegram push updates to your server.

---

This implementation shows:

- Spring Boot integration with Telebof
- Webhook configuration instead of long polling
- REST controller for receiving updates
- Basic echo bot functionality

---

**Project Structure and Dependencies**

First, ensure you have the necessary Spring Boot dependencies in your `pom.xml` then, add the following dependencies in to `pom.xml`

```xml
<dependencies>
    <dependency>
        <groupId>io.github.natanimn</groupId>
        <artifactId>telebof</artifactId>
        <version>LATEST_VERSION</version>
    </dependency>
    <dependency>
        <groupId>io.github.natanimn</groupId>
        <artifactId>telebof-spring</artifactId>
        <version>LATEST_VERSION</version>
    </dependency>
</dependencies>
```

---

**Main Application Class**

```java
package io.github.natanimn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WebhookBot {
    public static void main(String[] args) {
        SpringApplication.run(WebhookBot.class, args);
    }
}
```

---

**Webhook Controller Class**

Pass `bot.token=<TOKEN>` `bot.webhook.enabled=true` and `bot.webhook.url=<WEBHOOK_URL>/<WEBHOOK_PATH>` inside `application.properties`.  
Replace `<TOKEN>`, `<WEBHOOK_URL>`, `<WEBHOOK_PATH>` with actual bot token, valid https url and proper path name respectively.

Then process updates sent to your webhook `<WEBHOOK_PATH>`. For this example we simply use `webhook` path. 

File `WebhookController.java`

```java
package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.log.BotLog;
import io.github.natanimn.telebof.filters.Filter;
import io.github.natanimn.telebof.types.updates.Update;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import lombok.RequiredArgsConstructor;
import java.util.List;
import java.util.logging.Level;

@RestController
@RequiredArgsConstructor
class WebhookController {
    private final BotClient bot;
    
    /**
     * Webhook endpoint that receives updates from Telegram
     * @param updates List of updates sent by Telegram
     * @return "OK" response to acknowledge receipt
     */
    @PostMapping("/webhook")
    public String getUpdates(@RequestBody List<Update> updates) {
        // Process incoming updates
        bot.processUpdates(updates);
        return "OK";
    }
}
```

Here we will handle messages sent to our bot.

File `EchoBot.java`

```java
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.spring.Bot;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.annotations.MessageHandler;

@Bot
class EchoBot{
    
    @MessageHandler(commands = "start", priority = -1)
    public void start(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Hello, I am echo bot").exec();
    }
    
    @MessageHandler(type = MessageType.TEXT)
    public void echo(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), message.getText()).exec();
    }
}
```

---

## Key Components Explained

### 1. Spring Boot Configuration
```java
@SpringBootApplication
public class WebhookBot {
    public static void main(String[] args) {
        SpringApplication.run(WebhookBot.class, args);
    }
}
```

- `@SpringBootApplication` enables auto configuration and component scanning
- Main method starts the embedded Tomcat server

### 2. REST Controller
```java
@RestController
class WebhookController {
    @PostMapping("/webhook")
    public String getUpdates(@RequestBody List<Update> updates) {
        bot.processUpdates(updates);
        return "OK";
    }
}
```

- `@RestController` marks the class as a web request handler
- `@PostMapping("/webhook")` maps POST requests to the /webhook endpoint
- `@RequestBody` captures the JSON payload from Telegram
- Returns "OK" to acknowledge successful receipt of updates

### 3. Bot Handlers
- **Start command handler**: Responds to /start command
- **Text message handler**: Echoes any text message back to the user

---

## Configuration Requirements

**Webhooks require HTTPS in production:**

- Obtain SSL certificate for your domain
- Configure Spring Boot for HTTPS
- **Ensure your domain is accessible publicly**
