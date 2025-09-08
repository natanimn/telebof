# <p align="center">Telebo<i>f</i></p>
## <p align="center">Easy and modern Telegram Bot API for Java </p>
<p align="center">
  <a href="https://github.com/natanimn/telebof/releases">
    <img src="https://img.shields.io/github/v/release/natanimn/telebof?color=blue&label=Version" alt="Latest Release">
  </a>
  <a href="https://github.com/natanimn/telebof/blob/main/LICENSE">
    <img src="https://img.shields.io/github/license/natanimn/telebof?color=green" alt="License">
  </a>
  <a href="https://t.me/telebofchat">
    <img src="https://img.shields.io/badge/Telegram-Support%20Group-blue?logo=telegram" alt="Telegram Support">
  </a>
  <a href="https://github.com/natanimn/telebof/stargazers">
    <img src="https://img.shields.io/github/stars/natanimn/telebof?color=yellow&label=Stars" alt="GitHub Stars">
  </a>
</p>

### <p align='center'>Supported 9.2 BotAPI</b>

## Overview

Telebof is easy and modern Java library for building Telegram bots using the Telegram Bot API. 

## Installation

### Maven
Add the following dependency to your `pom.xml`:

```xml
<dependency>
    <groupId>io.github.natanimn</groupId>
    <artifactId>telebof</artifactId>
    <version>1.2.1</version>
</dependency>
```

### Gradle
Add the following to your `build.gradle`:

```groovy
implementation 'io.github.natanimn:telebof:1.2.1'
```

---

### Quick Start: Your First Echo Bot

```java
import io.github.natanimn.telebof.BotClient;

public class MyFirstEchoBot {
    static final String TOKEN = "YOUR_BOT_TOKEN_HERE"; // Get from @BotFather

    public static void main(String[] args) {
        final BotClient bot = new BotClient(TOKEN);
       
        // Handle /start command
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            context.sendMessage(message.chat.id, "Welcome to my echo bot! 👋").exec();
        });

        // Echo any text message
        bot.onMessage(filter -> filter.text(), (context, message) -> {
            context.sendMessage(message.chat.id, "You said: " + message.text).exec();
        });

        bot.startPolling(); // Start the bot
    }
}
```

### Using annotation

```java
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.Message;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.BotClient;

public class MyFirstEchoBot {
    static final String TOKEN = "YOUR_BOT_TOKEN_HERE"; // Get from @BotFather

    public static void main(String[] args) {
        final BotClient bot = new BotClient(TOKEN);
        bot.addHandler(new MyFirstEchoBot());
        bot.startPolling();
    }

    @MessageHandler(commands = "start")
    void start(BotContext context, Message message){
        context.sendMessage(message.chat.id, "Welcome to my echo bot! 👋").exec();
    }

    @MessageHandler(type = MessageType.TEXT, priority = 1)
    void echo(BotContext context, Message message){
        context.sendMessage(message.chat.id, "You said: " + message.text).exec();
    }
} 
```

**To get started:**
1. Create a bot with [@BotFather](https://t.me/BotFather) on Telegram
2. Replace `YOUR_BOT_TOKEN_HERE` with your actual bot token
3. Run the code and send a message to your bot!

---

## Documentation

### Full Library Documentation
Visit our comprehensive documentation at:  
[https://natanimn.github.io/telebof](https://natanimn.github.io/telebof)

### API Reference
Detailed API reference available at:  
[https://natanimn.github.io/telebof-api](https://natanimn.github.io/telebof-api)

---

### Advanced Example: Inline Keyboard Bot

```java
import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;

public class AdvancedBot {
    public static void main(String[] args) {
        final BotClient bot = new BotClient(TOKEN);

        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            var keyboard = new InlineKeyboardMarkup();
            keyboard.addKeyboard(new InlineKeyboardButton("Option 1", "opt1"));
            keyboard.addKeyboard(new InlineKeyboardButton("Option 2", "opt2"));
            
            context.sendMessage(message.chat.id, "Choose an option:")
                   .replyMarkup(keyboard)
                   .exec();
        });

        bot.onCallback(filter -> filter.callbackData("opt1", "opt2"), (context, callback) -> {
            context.answerCallbackQuery(callback.id, "Option selected!").exec();
        });

        bot.startPolling();
    }
}
```
---

## Community and Support

### Official Channels
- **Support Group**: [Join our Telegram group](https://t.me/telebofchat) for help and discussions
- **News Channel**: [Follow our channel](https://t.me/telebof) for updates and announcements

### Getting Help
1. **Documentation**: Check our [comprehensive docs](https://natanimn.github.io/telebof) first
2. **GitHub Discussions**: [Ask questions](https://github.com/natanimn/telebof/discussions) in our community forum
3. **Issue Tracker**: [Report bugs](https://github.com/natanimn/telebof/issues) or request features

## Share Your Bot
Want your bot to be featured in our examples?  
**Requirements**: Public source code<br>
**How to submit**: Make a pull request with your bot implementation!

---

## Contributing

We welcome contributions from the community! Here's how you can help:

### Ways to Contribute
1. **Code Contributions**: Implement new features or fix bugs
2. **Documentation**: Improve documentation and examples
3. **Testing**: Help test new features and report issues
4. **Examples**: Create and share example bots

---

## License

This project is licensed under the MIT License - see the [LICENSE](LICENSE) file for details.

---

## Support the Project

If you find Telebof useful, please consider:

1. ⭐ **Star the repository** on GitHub
2. 🐛 **Report issues** and help improve the library
3. 💬 **Join our community** and help other developers
4. 📢 **Share** with others who might find it useful

---
