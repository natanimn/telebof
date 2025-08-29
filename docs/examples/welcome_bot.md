# Welcome Bot

In this example, we will create a bot that sends welcome messages to new members, handles its own promotions, deletes "member left" messages, and provides an invite button for groups.


We will use two different types of handler:

* `onMessage` for handling command and service messages(i.e new chat member and left chat member)
* `onMyChatMember` for handling updates about the bot's own member status in a chat (e.g., promoted, demoted, removed).

---



**Import necessary classes**
```java
package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.ChatMemberUpdated;
import io.github.natanimn.telebof.types.updates.Message;
import java.util.Objects;
```

---


**Let us create `WelcomeBot` class with a constructor and initialize `BotClient` with a `token`**

```java
public class WelcomeBot {

    final BotClient bot;
    public WelcomeBot(String token){
        this.bot = new BotClient(token);
    }
}

```

Our bot will be handling the following events:

* `/start` command in private chat  
* New chat member joins  
* Bot promotion in group  
* Left chat member 

---

**Create `/start` handler and show invite button**

When the user types `/start` in a private chat, the bot responds with an inline button to invite the bot into a group with the `delete_messages` admin right pre selected.

```java
private void startPrivate(BotContext context, Message message){
    var keyboard     = new InlineKeyboardMarkup();
    var bot_username = bot.me().username;

    var url = String.format("https://t.me/%s?startgroup&admin=delete_messages", bot_username);

    keyboard.addKeyboard(new InlineKeyboardButton("Add me to your group").url(url));
    var text = """
                <b>\uD83D\uDC4B Hi, I am Welcome bot</b>
                
                Add me to your group, and I will send welcome message to new members""";

    context.sendMessage(message.chat.id, text)
            .parseMode(ParseMode.HTML)
            .replyMarkup(keyboard)
            .exec();
}
```

**Add the handler inside the constructor**
```java
bot.onMessage(filter -> filter.commands("start") && filter.Private(), this::startPrivate);
```

<img src="/img/w1.png">


---

**Handle bot promotion and demotion**

The `onMyChatMember` handler triggers when the bot's member status changes in a chat (e.g., promoted to admin, demoted to member, kicked, or left).
Sometimes the bot is promoted to **admin** in group, removed from group, left from group or dissmissed from **admin**  in groups.  

* This handler ensures the bot leaves any group where it is not an administrator with the **Delete Messages** permission.

```java
private void botPromoted(BotContext context, ChatMemberUpdated member){
    // 1. Get the new status of the bot
    ChatMemberStatus newStatus = member.new_chat_member.status;

    // 2. Ignore updates where the bot is leaving or being kicked/banned.
    // Handling those would cause errors as the bot can't send messages or leave a chat it's already been removed from.
    if (newStatus == ChatMemberStatus.LEFT || newStatus == ChatMemberStatus.BANNED) {
        return;
    }

    // 3. Check if the bot is NOT an admin OR is an admin but CANNOT delete messages
    boolean isAdminWithDeletePerms = (newStatus == ChatMemberStatus.ADMINISTRATOR 
                                      && member.new_chat_member.can_delete_messages == true);

    if (!isAdminWithDeletePerms) {
        try {
            context.sendMessage(
                memberUpdate.chat.id,
                "<b>Sorry, I cannot stay in this group without having <i>Delete message</i> permission.</b>")
                .parseMode(ParseMode.HTML)
                .exec();
        } catch (Exception e) {
            // Ignore errors if sending the message fails (e.g., in restricted groups)
        } finally {
            context.leaveChat(memberUpdate.chat.id).exec();
        }
    } else {
        // The bot was promoted to admin WITH delete permissions
        context.sendMessage(memberUpdate.chat.id, "Thank you for promoting me in this group!").exec();
    }
    
}
```

**Add the handler inside the constructor**
```java
bot.onMyChatMember(_ -> true, this::botPromoted);
```

<img src="/img/w2.png">

---

**Send welcome message when a new member joins**

This handler checks when a new member joins the group:  

* Deletes joining messages
* If the member is the bot itself → ignores  
* If it is a normal user → send a welcome message  

```java
private void sendWelcomeMessage(BotContext context, Message message){
    context.deleteMessage(chat_id, message.message_id).exec();
    
    var chat_id = message.chat.id;
    var bot_id  = bot.me().id;

    for (var member: message.new_chat_members){
        if (Objects.equals(bot_id, member.id)) continue;
        
        else {
            context.sendMessage(message.chat.id, String.format("🌼 <b>Hey %s!</b>\n\n<b>Welcome to this group.</b>", member.mention()))
                .parseMode(ParseMode.HTML)
                .exec();
        }
    }
}
```

**Delete left member messages**

This handler simply deletes the service message that is generated when a member leaves the chat.

```java
private void deleteLeftMessage(BotContext context, Message message){
    context.deleteMessage(chat_id, message.message_id).exec();
}
```

---

**Create a Custom Filter for Admin Permissions**

Before adding the service message handlers, we need a filter to ensure the bot only tries to delete messages if it actually has the permission to do so. We create a CustomFilter to check the bot's admin status.

```java
class BotIsAdmin implements CustomFilter{
    BotClient client;

    public BotIsAdmin(BotClient client){
        this.client = client;
    }
    
    class BotIsAdmin implements CustomFilter {
    BotClient client;

    public BotIsAdmin(BotClient client){
        this.client = client;
    }

    @Override
    public boolean check(Update update) {
        var bot_id = client.me().id;
        try {
            // Get the bot's chat member information
            var member = client.context.getChatMember(update.message.chat.id, bot_id).exec();
            // Check if the bot is an administrator and has the 'can_delete_messages' right
            return (member.status == ChatMemberStatus.ADMINISTRATOR 
                    && member.can_delete_messages == true);
        } catch (Exception e) {
            // If an error occurs (e.g., bot is not in chat, API error), return false
            return false;
        }
    }
}   
```

**Explanation:**

This filter safely checks if the bot is an administrator with delete permissions in the chat where the `service message` originated. The try/catch ensures the bot doesn't crash if it can't get this information.


Now, create an instance of this filter and add it to the handlers in the main constructor.


**Our final handlers in the constructor:**
```java
public WelcomeBot(String token){
    this.bot = new BotClient(token);
    var botIsAdmin = new BotIsAdmin(bot); // Create the custom filter

    bot.onMessage(filter -> filter.commands("start") && filter.Private(), this::startPrivate);
    bot.onMyChatMember(_ -> true, this::botPromoted);

    // Only handle new/left members if the bot is an admin with delete permissions
    bot.onMessage(filter -> filter.newChatMember() && filter.customFilter(botIsAdmin), this::sendWelcomeMessage);
    bot.onMessage(filter -> filter.leftChatMember() && filter.customFilter(botIsAdmin), this::deleteLeftMessage);
}
```


**Finally, create `runBot` method and run the bot on long polling**

```java
public void runBot(){
    bot.startPolling();
}

public static void main(String[] args){
    final var TOKEN = "BOT_TOKEN";
    final var welcomeBot = new WelcomeBot(TOKEN);
    welcomeBot.runBot();
}
```

---

**Summary**

Our bot can:

* Respond to `/start` in private chats with an invite button.
* Automatically leave any group where it is not an administrator with the **Delete Messages** permission.
* Send a welcome message when a new member joins.
* Delete the service messages for both new members and left members.

**The full source code can be found on** [examples/welcome_bot](https://github.com/natanimn/telebof/blob/main/examples/long-polling/src/main/java/io/github/natanimn/WelcomeBot.java)


