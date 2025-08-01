# <p align="center">Telebo<i>f</i></p>
## <p align="center"> Supported 8.2 Bot API </p> 
#### <p align='center'>Highly inspired with [Pyrogram](https://pyrogram.org) </p>

## Official Docs — Coming soon

* [Installation](#installation)
* [Your First Echo Bot](#your-first-echo-bot)
* [Available Types](#available-types) 
* [Available Methods](#available-methods)
* [Handling Updates](#handling-updates)
* [Types of Handlers](#types-of-handlers)
* [Filtering Updates](#filtering-updates)
* [Markup](#markup)
    * [Reply Keyboard Markup](#replymarkup)
    * [Inline Keyboard Markup](#inlinekeyboardmarkup)
    * [Remove Reply Keyboard](#removereplykeyboard)
    * [Force Reply](#forcereply)
* [Inline Bot](#inline-bot)
* [Using Webhook](#using-webhook)
* [Advanced Usages](advanced-usages)
  * [Local Bot API Server](#local-bot-api-server)
  * [Logging](#logging)
  * [Proxy](#proxy)
* [Error Handling](#error-handling)
* [Conclusion](#conclusion)
  

## Installation

* Maven 

```xml
<dependency>
    <groupId>io.github.natanimn</groupId>
    <artifactId>telebof</artifactId>
    <version>0.8.0</version>
</dependency>
```

* Grade

```groovy
implementation 'io.github.natanimn:telebof:0.8.0'
```
### Your First Echo Bot

```java
import io.github.natanimn.BotClient;

public class MyFirstEchoBot {
  static final String TOKEN = "YOUR_BOT_TOKEN_HERE";

  public static void main(String[] args) {
    final BotClient bot = new BotClient(TOKEN);
    
   
    // Listening for /start command
    bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
        context.reply("Welcome!").exec();
    });

    // Listening for any incoming text
    bot.onMessage(filter -> filter.text(), (context, message) -> {
        context.reply(message.text).exec();
    });

    bot.run(); // finally run the bot
  }
}
```
**Do not worry if you do not understand what the above code mean, it will be explained in the next chapter.** 

## Available Types
All Telegram types are defined in `io.github.natanimn.types` and organized in a package based on their relation. They are completely the same as Telegram types. 

Their set method is their camelCased name method

## Available Methods
All Telegram methods are defined in `io.github.natanimn.request` and implemented in `io.github.natanimn.BotContext` class.

These methods can be used in 2 ways: Inside handler using `context` parameter and Outside handler using `bot.context` instance.

##### Inside handler
No need to pass `chat_id` or `user_id` to the methods need it as argument using `context` argument or `bot.context` instance

##### Outside handler
`chat_id` or `user_id` must be passed to the methods need it as argument using `bot.context` instance

```java
/* Inside Handler */

// send message
context.sendMessage("Hello, World").exec(); // or
context.sendMessage(message.chat.id, "Hello, World").exec();

// The same as 

bot.context.sendMessage("Hello, World").exec();
bot.context.sendMessage(message.chat.id, "Hello, World").exec();

// send Photo
context.sendPhoto(new File("photo.png")).exec(); // or
context.sendPhoto(message.chat.id, new File("photo.png")).exec();

// The same as 

bot.context.sendPhoto(new File("photo.png")).exec(); // or
bot.context.sendPhoto(message.chat.id, new File("photo.png")).exec();


/* Outside Handler */

bot.context.sendMessage(123456789L, "Hello, World").exec();
bot.context.sendPhoto(123456789L, new File("photo.png")).exec();
```
**Assume that in our examples it is inside handler**

```java
// send photo
context.sendPhoto(new File("photo.png")).exec(); // or
context.sendPhoto("FILE_ID").exec();

// send audio
context.sendAudio(new File("audio.mp3")).exec();
context.sendAudio("FILE_ID").exec();

// send video
context.sendVideo(new File("video.mp4")).exec();
context.sendVideo("FILE_ID").exec();

// send voice
context.sendVoice(new File("voice.ogg")).exec();
context.sendVoice("FILE_ID").exec();

// send document
context.sendDocument(new File("doc.pdf")).exec();
context.sendDucument("FILE_ID").exec();

// send animation
context.sendAnimation(new File("animation.gif")).exec();
context.sendAnimation("FILE_ID").exec();

// send contact
context.sendContact(phone_number, first_name).exec();

// send poll
InputPollOption option1 = new InputPollOption("option 1");
InputPollOption option2 = new InputPollOption("option 2")
context.sendPoll(question, new InputPollOption[]{option1, option2}).exec();

// send invoice
LabeledPrice price1 = new LabeledPrice(label1, amount1);
context.sendInvoice(title, dscription, payload, currency, new LabeledPrice[]{price1}).exec();

// send media group
InputMediaPhoto media1 = new InputMediaPhoto(new File("photo_1.png"));
InputMediaPhoto media2 = new InputMediaPhoto(new File("photo_2.png"));
context.sendMediaGroup(new InputMedia[]{media1, media2}).exec();


// get me
User me = context.getMe().exec();
System.out.println(me.username);

// ban chat member
context.banChatMember(user_id).exec();

// leave chat
context.leaveChat().exec();
```

## Handling Updates
### Update
Update is an event that bot receives like incoming messages, pressing button.

Updates are handled by [registering one or more callback classes](#types-of-handlers). 

Each update has its own handler. These handlers take two parameters as argument: filter class 
and callback class. The filter class is a lambda class of `io.github.natanimn.filter.FilterExecutor` takes `io.github.natanimn.filter.Filter`
as an argument and returns `Boolean`, so that if the condition of this filter 
matches with the update sent from telegram, the callback class will be called and its body gets execute.

The callback class takes two parameters: `io.github.natanimn.BotContext` class and type of class of an update which is being handled

Let's back to the first [echo bot](#your-first-echo-bot) example.

```java
import io.github.natanimn.BotClient;

public class MyFirstEchoBot {
  static final String TOKEN = "YOUR_BOT_TOKEN_HERE";

  public static void main(String[] args) {
    final BotClient bot = new BotClient(TOKEN);

    bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
      context.reply("Welcome!").exec();
    });

    bot.onMessage(filter -> filter.text(), (context, message) -> {
      context.reply(message.text).exec();
    });

    bot.run();
  }
}
```
We have two handlers: `/start` command handler and `text` handler.

- The first handler handles `/start` command and send back a text `Welcome!`.
- The second handler handles any incoming **text** and echoes the text.
- The `reply` method is a shortage of `sendMessage` and replies message to the message.

- `exec()` meaning `execute` is an enclosing and request sender method. This means before ending and sending request, you can pass 
optional parameters and then send a request to telegram. For example `sendMessage` method has optional parameters 
`parse_mode`, `reply_markup`. So you can pass their value for these parameters and send request to telegram.

```java
import io.github.natanimn.enums.ParseMode;

context.sendMessage("*Hello, World*")
        .parseMode(ParseMode.MARKDOWN)
        .exec();
```
Lastly we start our bot by using `run()` which does not take any parameter and run our bot via **long polling.** 

**IMPORTANT: All handlers are handled in the order in which they were registered.**

## Types of Handlers
There are 22 types of updates to be handled

#### Message Handler
```java
bot.onMessage((context, message) -> {}); 
```
#### CallbackQuery handler
```java
bot.onCallback((context, callback) -> {});
```
#### InlineQuery Handler
```java
bot.onInline((context, query) -> {} );
```
#### Poll Handler
```java
bot.onPoll((context, poll) -> {});
```
#### PollAnswer Handler
```java
bot.onPoll((context, poll_answer) -> {});
```
#### ShippingQuery Handler
```java
bot.onShipping((context, shipping) -> {});
```
#### ChannelPost Handler
```java
bot.onChannelPost((context, channel_post) -> {});
```
#### PreCheckoutQuery Handler
```java
bot.onPreCheckout((context, pre_checkout) -> {});
```
#### EditedMessage Handler
```java
bot.onEditedMessage((context, edited_message) -> {});
```
#### EditedChannelPost Handler
```java
bot.onEditedChannelPost((context, edited_channel_post) -> {});
```
#### MyChatMember Handler
```java
bot.onMychatMember((context, chat_updated) -> {});
```
#### ChatMember Handler
```java
bot.onChatMember((context, chat_member) -> {});
```
#### ChosenInlineResult Handler
```java
bot.onChosenInlineResult((context, chosen) -> {});
```
#### MessageReaction Handler
```java
bot.onReaction((context, reaction) -> {});
```
#### MessageReactionCount Handler
```java
bot.onReactionCount((context, reaction_count) -> {});
```
#### ChatBoost Handler
```java
bot.onChatBoost((context, chat_boost) -> {});
```
#### RemovedChatBoost Handler
```java
bot.onRemovedChatBoost((context, removed_chat_boost) -> {});
```
#### BusinessMessage Handler
```java
bot.onBusinessMessage((context, businnes_message) -> {});
```
#### BusinessConnection Handler
```java
bot.onBusinessConnection((context, business_connection) -> {});
```
#### EditedBusinessMessage Handler
```java
bot.onEditedBusinessMessage((context, edited_business_message) -> {});
```
#### DeletedBusinessMessage Handler
```java
bot.onDeletedBusinessMessage((context, deleted_business_message) -> {});
```

**If only callback class is passed to a handler, the filter class will return `true` by default**

```java
bot.onMessage((context, message) -> {});
```
The same as
```java
bot.onMessage(filter -> true, (context, message) -> {});
```

## Filtering Updates

In previous topic we have seen how to create handlers and how they work. In this section we will talk about how filters 
work and how we use them.

As previously discussed, all handlers take two parameters: filter class and callback class. 

The filter class is used for filtering content of updates and separate the same update by content they hold. 

### Predefined Filters 
- `filter.text()` - filter message is text  
- `filer.photo()` - filter message is photo 
- `filter.video()` - filter message is video
- `filter.voice()` - filter message is voice
- `filter.audio()` - filter message is audio
- `filter.animation()` - filter message is animation
- `filter.document()` - filter message is document
- `filter.videoNote()` - filter message is video note
- `filter.contact()` - filter message is contact
- `filter.loaction()` - filter message is location
- `filter.game()` - filter message is game
- `filter.venue()` - filter message is venue
- `filter.sticker()` - filter message is sticker
- `filter.dice()` - filter message is dice
- `filter.invoice()` - message is an invoice for a payment
- `filter.media()` - filter message is one of the following: photo, video, audio, sticker, video_note, voice, animation, document.
- `filter.passportData()` - message is Telegram passport data
- `filter.usersShared()` - filter users were shared with the bot
- `filter.chatShared()` - filter chat was shared with the bot
- `filter.newChatMember()` - filter new members joined or added to the group
- `filter.leftChatMember()` - filter member left from the group
- `filter.newChatPhoto()` - filter a chat photo was changed
- `filter.newChatTitle()` - filter a chat title was changed
- `filter.groupCreated()` - filter a group chat was created
- `filter.supergroupCreated()` - filter a supergroup chat was created
- `filter.channelCreated()` - filter a channel was created
- `filter.messageAutoDeleteTimerChanged()` - filter auto-delete timer settings changed in the chat
- `filter.migrated()` - filter the group/supergroup has been migrated to/from a supergroup/group
- `filter.chatBackgroundSet()` filter chat background set
- `filter.pinnedMessage()` - filter a message was pinned
- `filter.successfulPayment()` - filter message about successful payment
- `filter.refundedPayment()` - filter message about refunded payment 
- `filter.proximityAlertTrigged()` - filter a user in the chat triggered another user's proximity alert
- `filter.boostAdded()` - filter user boosted the chat
- `filter.giveaway()` - filter message is scheduled giveaway
- `filter.giveawayCreated()` - filter a scheduled giveaway was created
- `filter.giveawayCompleted()` -  a giveaway without public winners was completed
- `filter.forumTopicCreated()` - filter forum topic created
- `filter.forumTopicClosed()` - filter forum topic closed
- `filter.forumTopicEdited()` - filter forum topic edited
- `filter.forumTopicReopned()` - filter forum topic reopened
- `filter.webAppData()` - filter data sent by a Web App
- `filter.videoChatStarted()` - filter video chat was started in the chat
- `filter.videoChatEnded()` - filter video chat was ended in the chat
- `filter.videoChatParticipantsInvited()` - filter new participants invited to a video chat
- `filter.videoChatScheduled()` - filter video chat scheduled
- `filter.forwarded()` - filter message was forwarded
- `filter.replied()` - filter message was replied to another message
- `filter.repliedToStory()` - filter message was replied to chat story
- `filter.entities()` - filter message text contains entities(bold, italic, underline, mention, url, hashtag)
- `filter.quote()` - filter message text contains quote
- `filter.bot()` - filter user is bot
- `filter.emptyQuery()` - filter query is empty
- `filter.Private()` - filter the chat is `private`
- `filter.group()` - filter the chat type is `group`
- `filter.supergroup()` - filter chat type is `supergroup`
- `filter.channel()` - filter chat type is `channel`
- `filter.commands(String... commands)` - filter message is given commands.
- `filter.callbackData(String... datas)` - filter given callback_data belongs to the pressed button.  
- `filter.inlineQuery(String... queries)` - filter given query is queried
- `filter.customFilter(CustomFilter cf)` - filter given filter
- `filter.state(String state)` - filter current state is given state. Pass `*` for filtering any state
- `filter.texts(String... texts)` - filter given text matched with message text
- `filter.chatIds(Long... ids)` - filter given id matched with current chat's id
- `filter.fromIds(Long... ids)` - filter given id matched with current user's id
- `filter.chatUsernames(String... usernames)` - filter given username matched with current chat's username
- `filter.usernames(String... usernames)` - filter given username matched with current user's username
- `filter.regex(String pattern)`- regular expression filter for message text  

```java
// handles incoming texts
bot.onMessage(filter -> filter.text(), (context, message) -> {});

// handles incoming photos
bot.onMessage(filter -> filter.photo(), (context, message) -> {});


// handles incoming videos
bot.onMessage(filter -> filter.video(), (context, message) -> {});
```

```java
// handles message in chat with chat_id of 123456789
bot.onMessage(filter -> filter.chatIds(123456789L), (context, message) -> {});

// handles message from user whose id is 123456789 
bot.onMessage(filter -> filter.fromIds(123456789L), (context, message) -> {});

// handles message in chat username @this_chat
bot.onMessage(filter -> filter.chatUsernames("this_chat"), (context, message) -> {});

// handles message from user whose username is @this_user
bot.onMessage(filter -> filter.usernames("this_user"), (context, message) -> {});

### Filtering message text
Message text can be filtered by using the following methods: `filter.commands`, `filter.texts`, `filter.regex`.

#### Filtering command
```java
// handles /start command
bot.onMessage(filter -> filter.commands("start"), (context, message) -> {});

// handles /help command
bot.onMessage(filter -> filter.commands("help"), (context, message) -> {});
```

#### Filtering Text
```java
// handles hi text
bot.onMessage(filter -> filter.texts("hi"), (context, message) -> {});

// handles hello text
bot.onMessage(filter -> filter.texts("hello"), (context, message) -> {});
```

#### Filtering using Regular Expression
```java
// handles any text starts with hi 
bot.onMessage(filter -> filter.regex("^hi"), (context, message) -> {});

// handles any text ends with bye
bot.onMessage(filter -> filter.regex("bye$"), (context, message) -> {});
```


### Combining filters
You may want to handle `text` and `photo` in one handler or a `text` in different chats. To do so use logical operators
(&&, ||, !) and combine them together.

Here are some examples

```java
// handles incoming text in private chat
bot.onMessage(filter -> filter.text() && filter.Private(), (context, message) -> {});

// handles an incoming text or photo
bot.onMessage(filter -> filter.text() || filter.photo(), (context, message) -> {});

// handles incoming text in supergroup chat 
bot.onMessage(filter -> filter.text() && filter.supergroup(), (context, message) -> {});

// handles incoming audio or video in private chat
bot.onMessage(filter -> filter.Private() && (filter.audio() || filter.video()), (context, message) -> {});
```

### Writing your own filter
You can write your own filter using `filter.customFilter`.

This example will show you how you can write filters using `io.github.natanimn.filters.CustomFilter` and `filter.customFilter`.

Let's write simple custom filter whether incoming text starts with `!` or not.

```java
import io.github.natanimn.BotContext;
import io.github.natanimn.filters.CustomFilter;
import io.github.natanimn.types.updates.Message;
import io.github.natanimn.types.updates.Update;


// Filter whether the incoming message text starts with `!`. or not

class StartsWithFilter implements CustomFilter {
  @Override
  public boolean check(Update update) {
    return update.message.text.startsWith("!");
  }
}

public class FilterBot {

  static void startsWith(BotContext context, Message message) {
    context.sendMessage("Message starts with !").exec();
  }

  public static void main(String[] args) {
    // ...
    bot.onMessage(filter -> filter.text() && filter.customFilter(new StartsWithFilter()),
            FilterBot::startsWith);
  }
}
```

### Advanced Filters

There are some advanced filters for handling `pressing button` and `inline query`. These are
`filter.callbackData` and `filter.inlineQuery` respectively.

Example for handling inline button through its callback data using `filter.callbackData`

```java
// handles inline button which its callback data equals with "a"
bot.onCallback(filter -> filter.callbackData("a"), (context, callback) -> {
    context.answer("You pressed A button!").exec();
});
```

Example for handling inline query using `filter.inlineQuery`
```java
// handles an inline query which its query equals with a word "hello"
bot.onInline(filter -> filter.inlineQuery("hello"), (context, query) -> {});
```
[Sample](#inline-bot)

### State Filter
There is another special filter to make conversations with bot called `state filter`.
```java
bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
    context.sendMessage("What is your name?").exec();
    bot.setState(message.from.id, "name"); // set our state to `name`. You can set whatever
});

bot.onMessage(filter -> filter.state("name") && filter.text(), (context, message) -> {     
    context.sendMessage(String.format("Your name is %s", message.text)).exec();
    context.clearState(message.from.id);
});
```


## Markups
### ReplyMarkup
Example for using reply markup

```java
import io.github.natanimn.types.keyboard.ReplyKeyboardMarkup;
import io.github.natanimn.types.keyboard.KeyboardButton;

ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup()
        .resizeKeyboard(true); // resize keyboard
        
markup.add("A","B","C"); // You can add String or 
markup.add("D","E"); 
markup.add(new KeyboardButton("F")); // KeybaordButton class

// also possible
ReplyKeyboardMarkup markup = new ReplyKeyboardMarkup(new String[][]{
        new String[]{"A", "B", "C"},
        new String[]{"D", "E"},
        new String[]{"F"}
}).resizeKeyboard(true); // resize keyboard

context.sendMssage("Hello, World!").replyMarkup(markup).exec();
```

### InlineKeyboardMarkup
example for using InlineKeyboardMarkup

```java
import io.github.natanimn.types.keyboard.InlineKeyboardButton;

InlineKeyboardMarkup inlineMarkup = new InlineKeyboardMarkup();

inlineMarkup.addKeybaord(
  new InlineKeyboardButton("A").callbackData("a"), 
  new InlineKeyboardButton("C").callbackData("b"), 
  new InlineKeyboardButton("Url").url("www.example.com")
); // 3 keyboards on a row 

// also  possible
InlineKeyboardMarkup inlineMarkup = new InlineKeyboardMarkup(new InlineKeyboardMarkup[]{
        new InlineKeyboardMarkup("A").callbackData("a"),
        new InlineKeyboardMarkup("B").callbackData("b"),
        new InlineKeyboardMarkup("Url").url("www.example.com")

}, 2); // 2 row width. i.e 2 keyboards on a row at max

// also possible
InlineKeyboardMarkup inlineMarkup = new InlineKeyboardMarkup(new InlineKeyboardMarkup[][]{
        new InlineKeyboardMarkup[]{
                new InlineKeyboardMarkup("A").callbackData("a"),
                new InlineKeyboardMarkup("B").callbackData("b")
        },
        new InlineKeyboardMarkup[]{
                new InlineKeyboardMarkup("Url").url("www.example.com")
        }
}
);

context.sendMessage("Press one button")
        .replyMarkup(inlineMarkup)
        .exec();
```

### ForceReply

```java
import io.github.natanimn.types.keyboard.ForceReply;
import io.github.natanimn.types.keyboard.ForceReply;

context.sendMessage("Can you tell me your name please?")
        .replyMarkup(new io.github.natanimn.types.keyboard.ForceReply())
        .exec();
```

### RemoveReplyKeyboard

```java
import io.github.natanimn.types.keyboard.ReplyKeyboardMarkup;

context.sendMessage("There is no reply keyboard now")
        .

replyMarkup(new RemoveReplyKeybaord())
        .

exec(); 
```

## Inline Bot

```java
import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.inline.InlineQueryResultArticle;
import io.github.natanimn.types.input.InputTextMessageContent;


bot.onInline(filter ->filter.

emptyQuery(), (context,query)->{
InlineQueryResultArticle article = new InlineQueryResultArticle("1")
        .title("Write something")
        .description("click here")
        .inputTextMessageContent(new InputTextMessageContent("Please write something"));

    context.

answerInline(new InlineQueryResult[] {
  article
}).

exec();
});
```

## Using Webhook

```java
import io.github.natanimn.Webhook;
import java.io.File;

class MyWebhookBot {
  public static void main(String[] args) {
    Webhook webhook = new Webhook("www.example.com", "/bot");  // URL and path respectively
    //...
    bot.deleteWebhook(); // first delete webhook if any
    bot.setWebhook(webhook); // set webhook

    //... 
    bot.run(); // start our bot on webhook

  }
}
```

## Advanced Usage

### Local Bot API Server

```java
import io.github.natanimn.BotClient;

String url = "https://example.com/bot%s/%s";
BotClient bot = new BotClient.Builder(TOKEN)
        .localBotApiUrl(url)
        .build();
```
**You have to log out your bot from the Telegram server before switching to your local API server using `bot.context.logOut().exec()`**

### Logging
log current status of the bot.
```java
import io.github.natanimn.BotClient;

BotClient bot = new BotClient.Builder(TOKEN)
        .log(true)
        .build();
```

### Proxy

```java
import io.github.natanimn.BotClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

InetSocketAddress address = new InetSocketAddress(80, "127.97.91"); //port and hostname respectively 

Proxy proxy = new Proxy(Proxy.Type.SOCKS, address);
BotClient bot = new BotClient
        .Builder(TOKEN)
        .proxy(proxy)
        .build();
```


Finally
```java
import io.github.natanimn.BotClient;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.enums.Updates;

BotClient bot = new BotClient.Builder(TOKEN)
        .log(true) // Log current status
        .skipOldUpdates(false) // Receive updates sent last 24 hours 
        .parseMode(ParseMode.HTML) // Default parse mode passed to sendXyz methods
        .limit(10) // Limit how many updates should be received at maximum per request 
        .useTestServer(false) // Using test server
        .timeout(30) // timeout
        .offset(-1) // offset
        .allowedUpdates(Updates.ALL) // Allowed updates
        .proxy(null) // proxy
        .build(); // build our client
```

## Error Handling

```java
import io.github.natanimn.TelegramApiException;

try {     
    context.sendMessage("Hello, World").exec();    
} catch(TelegramApiException apiException){
    System.out.println(apiException.description);
}
```

## Do you want your bot to be listed here?
* Just make a pull request; Only bots with public source code are accepted.

## Contribution
We welcome your contribution; Feel free to contribute to this library. Just pull request. 

## Conclusion

Finally, we now assume that you have basic understanding of this library in this brief tutorial; however, if you have any question or need 
support regarding this library, you have the following options

1. Ping us on [our official Telegram group](https://t.me/telebofchat). 
2. Ask questions by opening a [discussion](https://github.com/natanimn/Telebof/discussions/new)


And join [our official Telegram channel](https://t.me/telebof) for update news.

