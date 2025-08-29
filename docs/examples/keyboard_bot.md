# Keyboard Bot

In this example, we will create a bot that uses a custom reply keyboard to interact with users. The bot will present buttons for the user to press, and respond with information based on their selection.

---

**Import necessary classes**

```java
package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.types.keyboard.ReplyKeyboardMarkup;
import io.github.natanimn.telebof.enums.ParseMode;
```

---

**Create `KeyboardBot` class and initialize `BotClient` with a `token`**

```java
public class KeyboardBot {
    public static void main(String[] args) {
        final String TOKEN = "BOT_TOKEN"; // Replace with your actual bot token
        var bot = new BotClient(TOKEN);
        
        // Add handlers here
        
        // Start the bot
        bot.startPolling();
    }
}
```

Our bot will present a keyboard with three buttons and respond appropriately when they are pressed:

*   **ID** - Shows the user's Telegram ID
*   **Username** - Shows the user's username (if available)
*   **Language** - Shows the user's language code

---

**Add `/start` handler with reply keyboard**

The `/start` command initializes the conversation and displays the custom keyboard to the user.

```java
bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
    // Create a reply keyboard with resize option for better mobile appearance
    var keyboard = new ReplyKeyboardMarkup().resizeKeyboard(true);
    
    // Add buttons to the keyboard (in a single row by default)
    keyboard.add("ID", "Username", "Language");

    // Send welcome message with the keyboard attached
    context.sendMessage(message.chat.id, "Welcome! Please choose an option:")
           .replyMarkup(keyboard) // Attach the keyboard to the message
           .exec();
});
```

**Explanation:**

- `ReplyKeyboardMarkup()` creates a custom keyboard.
- `resizeKeyboard(true)` makes the buttons compact and small sized.
- `keyboard.add()` adds buttons to the keyboard. Multiple buttons in one `add()` call will appear on the same row.
- `replyMarkup(keyboard)` attaches the custom keyboard to the message.

**Result without `replyMarkup`:**

<img src="telebof/img/k1.png">


**Result with `replyMarkup` but without `resizeKeyboard`:**

<img src="telebof/img/k2.png">


**Final result with both `replyMarkup` and `resizeKeyboard(true)`:**

<img src="telebof/img/k3.png">

---

**Add handler to respond to keyboard button presses**

When a user presses any of the custom keyboard buttons, Telegram sends the button text as a regular message. We use the `filter.texts()` method to capture these specific messages.

```java
bot.onMessage(filter -> filter.texts("ID", "Username", "Language"), (context, message) -> {
    var user = message.from;
    String response;

    switch (message.text) {
        case "ID":
            response = String.format("<b>Your ID is:</b> <code>%d</code>", user.id);
            break;
            
        case "Username":
            if (user.username == null) {
                response = "<i>You don't have a username set in your Telegram profile.</i>";
            } else {
                response = String.format("<b>Your username is:</b> @%s", user.username);
            }
            break;
            
        case "Language":
            String language = (user.language_code != null) ? user.language_code : "not specified";
            response = String.format("<b>Your language code is:</b> %s", language);
            break;
            
        default:
            response = "Unknown option selected.";
    }

    context.sendMessage(message.chat.id, response)
           .parseMode(ParseMode.HTML)
           .exec();
});
```

**Explanation:**

- `filter.texts("ID", "Username", "Language")` captures messages that exactly match these button texts.
- We use a switch statement for cleaner control flow when handling multiple button options.
- The response is formatted using HTML for better presentation (bold text, code formatting for ID).
- We handle edge cases like missing username or language code gracefully.

---

**Final Complete Code**

```java
package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.types.keyboard.ReplyKeyboardMarkup;
import io.github.natanimn.telebof.enums.ParseMode;

public class KeyboardBot {
    public static void main(String[] args) {
        final String TOKEN = "BOT_TOKEN"; // Replace with your actual bot token
        var bot = new BotClient(TOKEN);

        // Handle /start command with keyboard
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            var keyboard = new ReplyKeyboardMarkup().resizeKeyboard(true);
            keyboard.add("ID", "Username", "Language");

            context.sendMessage(message.chat.id, "Welcome! Please choose an option:")
                   .replyMarkup(keyboard)
                   .exec();
        });

        // Handle keyboard button presses
        bot.onMessage(filter -> filter.texts("ID", "Username", "Language"), (context, message) -> {
            var user = message.from;
            String response;

            switch (message.text) {
                case "ID":
                    response = String.format("<b>Your ID is:</b> <code>%d</code>", user.id);
                    break;
                case "Username":
                    if (user.username == null) {
                        response = "<i>You don't have a username set.</i>";
                    } else {
                        response = String.format("<b>Your username is:</b> @%s", user.username);
                    }
                    break;
                case "Language":
                    String language = (user.language_code != null) ? user.language_code : "not specified";
                    response = String.format("<b>Your language code is:</b> %s", language);
                    break;
                default:
                    response = "Unknown option.";
            }

            context.sendMessage(message.chat.id, response)
                   .parseMode(ParseMode.HTML)
                   .exec();
        });

        // Start the bot
        bot.startPolling();
    }
}
```

---

**Summary**

This bot demonstrates how to:

- Create and display a custom reply keyboard with `ReplyKeyboardMarkup`
- Use `resizeKeyboard(true)` for better appearance
- Handle button presses by filtering specific message texts
- Respond with user information in formatted HTML messages
- Gracefully handle edge cases like missing user data

**The full source code can be found on** [examples/keyboard_bot](https://github.com/natanimn/telebof/blob/main/examples/long-polling/src/main/java/io/github/natanimn/KeyboardBot.java)

**Final result showing the interaction flow:**
<img src="telebof/img/k4.png">