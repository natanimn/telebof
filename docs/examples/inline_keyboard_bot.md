# Inline Keyboard Bot

In this example, we will create a bot that uses inline keyboards - interactive buttons that appear within messages and can trigger actions without sending visible messages to the chat.

---

## Overview

This bot demonstrates how to:<br>

- Create and display inline keyboards with custom callback buttons
- Handle callback queries when users press inline buttons
- Update message content dynamically in response to user interactions
- Use emojis and HTML formatting for enhanced user experience

We will use two types of handlers:<br>

* `onMessage` for handling the `/start` command and displaying the inline keyboard
* `onCallback` for handling user interactions with the inline buttons

---

**Import necessary classes**

```java
package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
```

---

**Create `InlineKeyboardBot` class and initialize `BotClient`**

```java
public class InlineKeyboardBot {
    public static void main(String[] args){
        final var TOKEN = System.getenv("TOKEN"); // Get bot token from environment variable
        final var bot = new BotClient(TOKEN); // Initialize bot client
        
        // Add handlers here
        
        bot.startPolling(); // Start the bot
    }
}
```

---

## Message Handler with Inline Keyboard

**Add `/start` handler that creates and displays an inline keyboard**

```java
bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
    // Create an inline keyboard markup
    var keyboard = new InlineKeyboardMarkup();
    
    // Add buttons with emojis and callback data
    keyboard.addKeyboard(new InlineKeyboardButton("🟩 Green", "color-green"));
    keyboard.addKeyboard(new InlineKeyboardButton("🟨 Yellow", "color-yellow"));
    keyboard.addKeyboard(new InlineKeyboardButton("🟥 Red", "color-red"));

    // Send message with inline keyboard attached
    context.sendMessage(message.chat.id, "Press one of the following inline buttons: ")
            .replyMarkup(keyboard) // Attach the inline keyboard to the message
            .exec();
});
```

**Explanation:**<br>

- `InlineKeyboardMarkup()` creates an inline keyboard that appears below the message content

---

Each `InlineKeyboardButton` takes two parameters:

   1. **Text**: The visible label on the button (includes color emojis: 🟩, 🟨, 🟥)
   * **Callback Data**: A unique identifier sent when the button is pressed (`color-green`, `color-yellow`, `color-red`)

---

- `addKeyboard()` adds each button on a separate row
- `replyMarkup(keyboard)` attaches the inline keyboard to the message

**Visual Result:**<br>
The user sees a message with three colorful buttons below it that they can interact with.

<img src="img/ik1.png">

---

## Callback Query Handler

**Add handler to process inline button presses**

```java
bot.onCallback(filter -> filter.regex("color-"), (context, callback) -> {
    // Immediately acknowledge the callback query
    // This removes the loading indicator from the button
    context.answerCallbackQuery(callback.id).exec();

    // Extract the color name from the callback data
    // Example: "color-green" → "green"
    var color = callback.data.split("-")[1];

    // Create an appropriate response message based on the button pressed
    String response = switch (color) {
        case "green" -> "You have pressed <b>Green</b> button!";
        case "yellow" -> "You have pressed <b>Yellow</b> button!";
        case "red" -> "You have pressed <b>Red</b> button";
        default -> "You have pressed <b>Unknown</b> button";
    };

    // Edit the original message to show which button was pressed
    context.editMessageText(response, callback.message.chat.id, callback.message.message_id)
            .parseMode(ParseMode.HTML) // Use HTML formatting for bold text
            .replyMarkup(callback.message.reply_markup) // Keep the same keyboard
            .exec();
});
```

**Explanation:**


*Callback Query Acknowledgment*:<br>

   - `answerCallbackQuery(callback.id).exec()` is required to tell Telegram the button press was received
   - This removes the loading animation from the pressed button

---

*Callback Data Processing*:<br>

   - `filter.regex("color-")` matches any callback data starting with "color-"
   - The callback data is split to extract the specific color identifier

---

*Message Editing*:<br>

   - `editMessageText()` modifies the existing message instead of sending a new one
   - This provides a cleaner user experience by updating the original message
   - `replyMarkup(callback.message.reply_markup)` preserves the original keyboard layout

---
*User Feedback*:

   - The message content changes to provide immediate feedback about which button was pressed
   - HTML formatting (`<b>...</b>`) makes the response more visually appealing

---

## Complete Workflow

1. **User sends `/start`** → Bot displays message with three inline buttons (Green, Yellow, Red)
2. **User presses a button** → Telegram sends a callback query to the bot
3. **Bot processes callback** → 
   - Acknowledges the query (removes button loading state)
   - Determines which button was pressed
   - Updates the original message to show the selection
4. **User sees updated message** → The message now indicates which button was chosen

---

## Summary

This example demonstrates how to implement interactive inline keyboards that:

- **Provide clean user interactions** without cluttering the chat
- **Offer immediate visual feedback** when buttons are pressed
- **Maintain message context** by editing existing messages instead of creating new ones
- **Use semantic callback data** to identify user actions meaningfully
- **Enhance user experience** with emojis and formatted text


**The full source code can be found on** [examples/inline_keybaord_bot](https://github.com/natanimn/telebof/blob/main/examples/long-polling/src/main/java/io/github/natanimn/InlineKeybaordBot.java)
