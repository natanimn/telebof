# Handling Updates

### What is an Update?
An **update** is an event sent by Telegram to your bot — for example, a new message, a button press, a poll answer, or a payment event.  
In Telebof, you handle updates by [registering handler methods](#types-of-handlers).

Each handler method:

- Accepts a **filter** to determine which updates it should process.
- Accepts a **callback** that is executed when the filter matches.


**Filter**  
The filter is a lambda of type `
io.github.natanimn.telebof.filter.FilterExecutor`, which takes a `
io.github.natanimn.telebof.filter.Filter` object and returns a `Boolean`.  
If the filter condition matches the incoming update, the callback is triggered.

**Callback**  
The callback is a function that takes two parameters:

1. `
io.github.natanimn.telebof.BotContext` – allows sending messages, editing content, etc.
2. The specific update type being handled.

---

### Example: Basic Echo Bot
Let’s revisit our first echo bot:

```java
import io.github.natanimn.telebof.BotClient;

public class MyFirstBot {
  static final String TOKEN = "YOUR_BOT_TOKEN_HERE";

  public static void main(String[] args) {
    final BotClient bot = new BotClient(TOKEN);
   
    // Responding to /start command
    bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
        context.sendMessage(message.chat.id, "Welcome!").exec();
    });

    // Echoing any incoming text
    bot.onMessage(filter -> filter.text(), (context, message) -> {
        context.sendMessage(message.chat.id, message.text).exec();
    });

    bot.startPolling(); // Start the bot
  }
}
```

**In this example:**

- First handler: Responds to /start with “Welcome!”.
- Second handler: Echoes any text sent to the bot.
- `sendMessage` sends a message.
- `exec()` executes the request to Telegram.

* Optional parameters (e.g., parse_mode, reply_markup) can be set before calling exec().

**Example with Markdown parse mode:**
```java
import enums.
io.github.natanimn.telebof.ParseMode;

context.sendMessage(message.chat.id, "*Hello, World*")
       .parseMode(ParseMode.MARKDOWN)
       .exec();

```
- `startPolling()`
Starts the bot using long polling, continuously fetching updates from Telegram.

> **Important:** Handlers are executed in the order they are registered.
If multiple handlers match the same update, earlier ones run first.

## Types of Handlers

Telegram bots can receive a variety of **updates**, each representing a different type of event.  
Telebof provides **22 handler methods** to process these updates easily.

---

### All Update Types in Telebof

| **Update Type**                  | **Handler Method**                       | **Description** |
|----------------------------------|-------------------------------------------|-----------------|
| **Message**                      | `bot.onMessage`                           | Handles incoming messages from users or groups. |
| **Callback Query**               | `bot.onCallback`                          | Handles button presses from inline keyboards. |
| **Inline Query**                  | `bot.onInline`                            | Handles inline queries typed in other chats. |
| **Poll**                         | `bot.onPoll`                              | Handles new polls. |
| **Poll Answer**                   | `bot.onPollAnswer`                        | Handles answers to polls. |
| **Shipping Query**                | `bot.onShipping`                          | Handles shipping related queries for payments. |
| **Channel Post**                  | `bot.onChannelPost`                       | Handles new channel posts. |
| **Pre-Checkout Query**            | `bot.onPreCheckout`                       | Handles payment pre-checkout events. |
| **Edited Message**                | `bot.onEditedMessage`                     | Handles edits to existing messages. |
| **Edited Channel Post**           | `bot.onEditedChannelPost`                 | Handles edits to channel posts. |
| **My Chat Member**                | `bot.onMyChatMember`                      | Handles changes to the bot's role in a chat. |
| **Chat Member**                   | `bot.onChatMember`                        | Handles changes to a user's role in a chat. |
| **Chosen Inline Result**          | `bot.onChosenInlineResult`                | Handles the result chosen from an inline query. |
| **Message Reaction**              | `bot.onReaction`                          | Handles when someone reacts to a message. |
| **Message Reaction Count**        | `bot.onReactionCount`                     | Handles updates to reaction counts. |
| **Chat Boost**                    | `bot.onChatBoost`                         | Handles when a chat is boosted. |
| **Removed Chat Boost**            | `bot.onRemovedChatBoost`                  | Handles when a boost is removed from a chat. |
| **Business Message**              | `bot.onBusinessMessage`                   | Handles new business messages. |
| **Business Connection**           | `bot.onBusinessConnection`                | Handles new or updated business connections. |
| **Edited Business Message**       | `bot.onEditedBusinessMessage`             | Handles edits to business messages. |
| **Deleted Business Message**      | `bot.onDeletedBusinessMessage`            | Handles deletions of business messages. |

---

## Usages 
**1. Handling Different Message Types**

```java
// Handle text messages
bot.onMessage(filter -> filter.text(), (context, message) -> {
    context.sendMessage(message.chat.id, "You said: " + message.text).exec();
});

// Handle photo messages
bot.onMessage(filter -> filter.photo(), (context, message) -> {
    context.sendMessage(message.chat.id, "Nice photo!").exec();
});

// Handle document messages
bot.onMessage(filter -> filter.document(), (context, message) -> {
    context.sendMessage(message.chat.id, "File received").exec();
});
```

**2. Handling Callback Queries from Inline Keyboards**

```java
bot.onCallback(filter -> filter.calbackData("button_1"), (context, callback) -> {
    context.answerCallbackQuery(callback.id, "Button 1 pressed!").exec();

    context.editMessageText("You pressed Button 1", 
                           callback.message.chat.id, 
                           callback.message.message_id).exec();
});
```

**3. Handling Inline Queries**

```java
bot.onInline(filter -> true, (context, inline) -> {
    var result = new InlineQueryResultArticle("1", "Title", 
                     new InputTextMessageContent("Hello from inline!"));
    context.answerInlineQuery(inline.id, new InlineQueryResult[]{result}).exec();
});
```