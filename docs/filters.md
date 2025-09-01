# Filtering Updates

In the previous topic, we learned how to create handlers and how they work. This section will explain how filters work and how to use them.

As previously discussed, all handlers take two parameters: a filter class and a callback class.

The filter class is used for filtering the content of updates and separating updates based on the content they contain.

## Predefined Filters

### Message Content Filters
#### filter.text() 
Filters text messages

---

#### filter.photo()
Filters photo messages

---

#### filter.video()
Filters video messages

---

#### filter.voice()
Filters voice messages

---

#### filter.audio()
Filters audio messages

---

#### filter.animation()
Filters animation messages

---

#### filter.document()
Filters document messages

---

#### filter.videoNote()
Filters video note messages

---

#### filter.contact()
Filters contact messages

---

#### filter.location()
Filters location messages

---

#### filter.game()
Filters game messages

---

#### filter.venue()
Filters venue messages

---

#### filter.sticker()
Filters sticker messages

---

#### filter.dice()
Filters dice messages

---

#### filter.invoice()
Filters payment invoice messages

---

#### filter.media()
Filters media messages (photo, video, audio, sticker, video_note, voice, animation, document)

---

#### filter.passportData()
Filters Telegram passport data messages

---

#### filter.usersShared()
Filters when users are shared with the bot

---

#### filter.chatShared()
Filters when a chat is shared with the bot

---

#### filter.checklist()
Filters checklist messages

---

### Chat Event Filters

#### filter.newChatMember()
Filters when new members join or are added to the group

---

#### filter.leftChatMember()
Filters when a member leaves the group

---

#### filter.newChatPhoto()
Filters when a chat photo is changed

---

#### filter.newChatTitle()
Filters when a chat title is changed

---

#### filter.groupCreated()
Filters when a group chat is created

---

#### filter.supergroupCreated()
Filters when a supergroup chat is created

---

#### filter.channelCreated()
Filters when a channel is created

---

#### filter.messageAutoDeleteTimerChanged()
Filters when auto-delete timer settings change in the chat

---

#### filter.migrated()
Filters when a group/supergroup is migrated to/from a supergroup/group

---

#### filter.chatBackgroundSet()
Filters when a chat background is set

---

#### filter.pinnedMessage()
Filters when a message is pinned

---

#### filter.successfulPayment()
Filters successful payment messages

---

#### filter.refundedPayment()
Filters refunded payment messages

---

#### filter.proximityAlertTriggered()
Filters when a user triggers another user's proximity alert

---

#### filter.boostAdded()
Filters when a user boosts the chat

---

#### filter.giveaway()
Filters scheduled giveaway messages

---

#### filter.giveawayCreated()
Filters when a scheduled giveaway is created

---

#### filter.giveawayCompleted()
Filters when a giveaway without public winners is completed

---

### Forum Topic Filters

#### filter.forumTopicCreated()
Filters when a forum topic is created

---

#### filter.forumTopicClosed()
Filters when a forum topic is closed

---

#### filter.forumTopicEdited()
Filters when a forum topic is edited

---

#### filter.forumTopicReopened()
Filters when a forum topic is reopened

---

#### filter.checklistTasksAdded
Filters when checklist task is added

---

#### filter.checklistTasksDone
Filters when checklist task is added

---

#### filter.directMessagePriceChanged
Filters when direct message price is changed

---

### Video Chat Filters

#### filter.webAppData()
Filters data sent by a Web App

---

#### filter.videoChatStarted()
Filters when a video chat starts in the chat

---

#### filter.videoChatEnded()
Filters when a video chat ends in the chat

---

#### filter.videoChatParticipantsInvited()
Filters when new participants are invited to a video chat

---

#### filter.videoChatScheduled()
Filters when a video chat is scheduled

---

### Message Context Filters

#### filter.forwarded()
Filters forwarded messages

---

#### filter.replied()
Filters messages that are replies to another message

---

#### filter.repliedToStory()
Filters messages that are replies to a chat story

---

#### filter.entities()
Filters messages containing entities (bold, italic, underline, mention, url, hashtag)

---

#### filter.quote()
Filters messages containing quotes

---

## User and Chat Type Filters

#### filter.bot()
Filters when the user is a bot

---

#### filter.emptyQuery()
Filters empty queries  
Used with `bot.onInline` handler

---

#### filter.Private()
Filters private chats

---

#### filter.group()
Filters group chats

---

#### filter.supergroup()
Filters supergroup chats

---

#### filter.channel()
Filters channel chats

---

### Advanced Filtering Methods
#### filter.commands(String... commands)
Filters specific commands<br>

* Used with handles that recieves `Message` update

---

#### filter.callbackData(String... datas)
Filters specific callback data from buttons<br>

* Used with `bot.onCallback` handler

---

#### filter.inlineQuery(String... queries)
Filters specific inline queries<br>

- Used with `bot.onInline` handler

---

#### filter.customFilter(CustomFilter cf)
Applies a custom filter

---

#### filter.state(String state)
Filters by current state (use `*` for any state)

---

#### filter.texts(String... texts)
Filters specific text messages

---

#### filter.chatIds(Long... ids)
 Filters by chat ID

---

### filter.fromIds(Long... ids)
 Filters by user ID

---

#### filter.chatUsernames(String... usernames)
Filters by chat username

---

#### filter.usernames(String... usernames)
Filters by user username

---

#### filter.regex(String pattern)
Filter updates that match a given regular expression pattern.<br>
**Used with handlers that receive one of the following updates:**


- [Message](https://natanimn.github.io/telebof-api/io/github/natanimn/telebof/types/updates/Message.html) - The filter will match text
- [CallbackData](https://natanimn.github.io/telebof-api/io/github/natanimn/telebof/types/updates/CallbackQuery.html) - The filter will match data.
- [InlineQuery](https://natanimn.github.io/telebof-api/io/github/natanimn/telebof/types/updates/InlineQuery.html) - The filter will match query.
- [PreCheckoutQuery](https://natanimn.github.io/telebof-api/io/github/natanimn/telebof/types/updates/PreCheckoutQuery.html): The filter will match payload
---

#### filter.reaction(String... reactions)
Filters emoji reactions<br>

* Used with `bot.OnReaction` handler

---

## Usage Examples

### Basic Message Handling
```java
// Handles incoming texts
bot.onMessage(filter -> filter.text(), (context, message) -> {});

// Handles incoming photos
bot.onMessage(filter -> filter.photo(), (context, message) -> {});

// Handles incoming videos
bot.onMessage(filter -> filter.video(), (context, message) -> {});
```

### ID and Username Filtering
```java
// Handles messages in chat with chat_id of 123456789
bot.onMessage(filter -> filter.chatIds(123456789L), (context, message) -> {});

// Handles messages from user with ID 123456789
bot.onMessage(filter -> filter.fromIds(123456789L), (context, message) -> {});

// Handles messages in chat with username @this_chat
bot.onMessage(filter -> filter.chatUsernames("this_chat"), (context, message) -> {});

// Handles messages from user with username @this_user
bot.onMessage(filter -> filter.usernames("this_user"), (context, message) -> {});
```

## Filtering Message Text
### Command Filtering
```java
// Handles /start command
bot.onMessage(filter -> filter.commands("start"), (context, message) -> {});

// Handles /help command
bot.onMessage(filter -> filter.commands("help"), (context, message) -> {});
```

### Text Filtering
```java
// Handles "hi" text
bot.onMessage(filter -> filter.texts("hi"), (context, message) -> {});

// Handles "hello" text
bot.onMessage(filter -> filter.texts("hello"), (context, message) -> {});
```

### Regular Expression Filtering
```java
// Handles any text starting with "hi"
bot.onMessage(filter -> filter.regex("^hi"), (context, message) -> {});

// Handles any text ending with "bye"
bot.onMessage(filter -> filter.regex("bye$"), (context, message) -> {});
```

## Combining Filters

You can combine filters using logical operators (&&, ||, !) to create more complex filtering conditions.

```java
// Handles incoming text in private chat
bot.onMessage(filter -> filter.text() && filter.Private(), (context, message) -> {});

// Handles incoming text or photo
bot.onMessage(filter -> filter.text() || filter.photo(), (context, message) -> {});

// Handles incoming text in supergroup chat
bot.onMessage(filter -> filter.text() && filter.supergroup(), (context, message) -> {});

// Handles incoming audio or video in private chat
bot.onMessage(filter -> filter.Private() && (filter.audio() || filter.video()), (context, message) -> {});
```

## Writing Custom Filters

You can create custom filters using `filter.customFilter()` with a `CustomFilter` implementation.

### Example: Custom Text Filter
```java
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.updates.Update;

// Filter to check if incoming message text starts with a given prefix
class PrefixFilter implements CustomFilter {
    private String prefix;

    public StartsWithFilter(String prefix){
        this.prefix = prefix;
    }

    @Override
    public boolean check(Update update) {
        return update.message.text.startsWith(this.prefix);
    }
}

public class FilterBot {
    public static void main(String[] args) {
        // ...

        // Handles any message/command starts with "!"(i.e !start, !hello world)
        bot.onMessage(
            filter -> filter.text() && filter.customFilter(new PrefixFilter("!")),
            (context, message) -> {
                context.sendMessage(message.chat.id, "Message starts with !").exec();
            }
        );

        
        // Handles any message/command starts with dot(.)(i.e .start, .hello world)
        bot.onMessage(
            filter -> filter.text() && filter.customFilter(new PrefixFilter(".")),
            (context, message) -> {
                context.sendMessage(message.chat.id, "Message starts with dot(.)").exec();
            }
        );
    }
}
```

### Example: Complex Custom Filter

```java
// Filter for messages containing specific keywords from admin users
class AdminKeywordFilter implements CustomFilter {
    private List<Long> adminIds = Arrays.asList(12345L, 67890L);
    private List<String> keywords = Arrays.asList("urgent", "important", "emergency");
    
    @Override
    public boolean check(Update update) {
        if (update.message == null || update.message.text == null) {
            return false;
        }
        
        boolean isAdmin = adminIds.contains(update.message.from.id);
        boolean containsKeyword = keywords.stream().anyMatch(update.message.text::toLowerCase::contains);
        
        return isAdmin && containsKeyword;
    }
}

// Usage
bot.onMessage(filter -> filter.customFilter(new AdminKeywordFilter()), (context, message) -> {
    context.sendMessage(message.chat.id, "Admin urgent message detected!").exec();
});
```


## Advanced Filters

### Callback Data Filtering
- Used with `bot.onCallback`
```java


// Handles inline button with callback data "a"
bot.onCallback(filter -> filter.callbackData("a"), (context, callback) -> {
    context.answerCallbackQuery(callback.id, "You pressed A button!").exec();

});
```

### Inline Query Filtering
* Used with `bot.onInline`

```java
// Handles inline query with the word "hello"
bot.onInline(filter -> filter.inlineQuery("hello"), (context, query) -> {});
```

## State Filter Example

State filters are useful for creating conversational flows with the bot.

```java
// Set state when /start command is received
bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
    context.sendMessage(message.chat.id, "What is your name?").exec();
    bot.setState(message.from.id, "name"); // Set state to 'name'
});

// Handle response when in 'name' state
bot.onMessage(filter -> filter.state("name") && filter.text(), (context, message) -> {     
    context.sendMessage(message.chat.id, String.format("Your name is %s", message.text)).exec();
    context.clearState(message.from.id); // Clear the state
});
```

