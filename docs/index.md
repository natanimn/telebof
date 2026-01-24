# <p align="center">Introduction</p>

**Telebof** is a modern Java wrapper for the Telegram Bot API, designed to make building bots fast, simple, and intuitive. Whether you want to create a lightweight utility bot or a fully featured automation system, Telebof provides a clean interface to handle commands, inline buttons, payment updates, and more.  

---


```java
import io.github.natanimn.BotClient;

public class MyFirstBot {
  static final String TOKEN = "YOUR_BOT_TOKEN_HERE";

  public static void main(String[] args) {
    final BotClient bot = new BotClient(TOKEN);
   
    bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
        context.sendMessage(message.getChat().getId(), "Welcome!").exec();
    });

    bot.onMessage(filter -> filter.text(), (context, message) -> {
        context.sendMessage(message.getChat().getId(), message.getText()).exec();
    });

    bot.startPolling();
  }
}
```

---


### Join Our Community
- 📢 [Telegram News Channel](https://t.me/telebof)
- 👥 [Telegram Group Chat](https://t.me/telbofchat)


### Prerequesites

Before diving in, make sure you have:  

- Java 20 or above.  
- Basic understanding of Java.
- Knowledge of [Telegram Bot API](https://telegram.org/bots/api)  

---

### User's Guide
- [Installation](/telebof/installation)
- [Handling Updates](/telebof/handling-updates)
- [Annotations](/telebof/annotations)
- [Filters](/telebof/filters)
- [Using States](/telebof/states)
- [Advanced Features](/telebof/advance)
- [Error Handling](/telebof/error_handling)
- [Example Bots](/telebof/examples)
- [Full API Reference](/telebof-api)