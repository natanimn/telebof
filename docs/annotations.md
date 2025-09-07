# Annotations

Telebof provides a comprehensive set of annotations for declarative handling of Telegram Bot API updates. 
These annotations offer a clean, type-safe alternative to programmatic handler registration, making your bot code more maintainable and readable.

## Annotation Types

All annotations are defined in `io.github.natanimn.telebof.annotations`


#### @MessageHandler
Handles incoming messages from users or groups with comprehensive filtering options.

**Parameters:**

- `commands()` - Array of bot commands to match
- `texts()` - Array of exact text content to match
- `chatType()` - Array of chat types to filter by
- `regex()` - Regular expression pattern for text matching
- `type()` - Array of message types to filter by
- `filter()` - Custom filter class for advanced logic
- `state()` - Required conversation state
- `priority()` - Execution priority (lower = earlier)

#### @EditedMessageHandler
Handles edited messages across various chat types with the same filtering capabilities as @MessageHandler.

**Parameters:** Same as @MessageHandler

#### @ChannelPostHandler
Handles incoming channel posts with filtering options tailored for channel content.

**Parameters:**

- `commands()` - Array of bot commands to match
- `texts()` - Array of exact text content to match
- `regex()` - Regular expression pattern for text matching
- `type()` - Array of message types to filter by
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @EditedChannelPostHandler
Handles edited channel posts with comprehensive filtering options.

**Parameters:** Same as @ChannelPostHandler

#### @BusinessMessageHandler
Handles business message events with comprehensive filtering options tailored for Telegram Business accounts.

**Parameters:** Same as @MessageHandler

#### @EditedBusinessMessageHandler
Handles edited business message events with the same comprehensive filtering capabilities.

**Parameters:** Same as @MessageHandler

#### @DeletedBusinessMessageHandler
Handles deleted business message events, particularly useful for audit logging and compliance.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @CallbackHandler
Handles incoming callback queries from inline keyboards.

**Parameters:**

- `data()` - Array of callback data values to match
- `chatType()` - Array of chat types to filter by
- `regex()` - Regular expression pattern for callback data
- `filter()` - Custom filter class for advanced logic
- `state()` - Required conversation state
- `priority()` - Execution priority

#### @InlineHandler
Handles inline query events with filtering options for query content and chat types.

**Parameters:**

-`query()` - Array of query text to match
- `chatType()` - Array of chat types to filter by
- `regex()` - Regular expression pattern for query matching
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @ChosenInlineHandler
Handles chosen inline result events when users select results from inline queries.

**Parameters:**

- `resultId()` - Array of result IDs to match
- `query()` - Array of original query text to match
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @ChatMemberHandler
Handles chat member status updates for user role changes.

**Parameters:**

- `status()` - Array of chat member status changes to match
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @MyChatMemberHandler
Handles the bot's own chat member status updates.

**Parameters:**

- `status()` - Array of status changes to match for the bot
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @ChatJoinRequestHandler
Handles chat join request events for private groups or channels requiring approval.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @PreCheckoutHandler
Handles pre-checkout query events for payment validation.

**Parameters:**

- `payload()` - Array of payment payload identifiers to match
- `regex()` - Regular expression pattern for payload matching
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @ShippingHandler
Handles shipping query events during checkout processes.

**Parameters:**

- `payload()` - Array of shipping query payload identifiers to match
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @PurchasedPaidMediaHandler
Handles purchased paid media events for content delivery.

**Parameters:**

- `payload()` - Array of media purchase payload identifiers to match
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

### Reaction and Engagement Annotations

#### @ReactionHandler
Handles message reaction events when users add or remove reactions.

**Parameters:**

- `reaction()` - Specific reaction emoji to match
- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @ReactionCountHandler
Handles reaction count update events for monitoring engagement.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

### Boost and Community Annotations

#### @ChatBoostHandler
Handles chat boost events for supergroup upgrades and premium features.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @RemovedChatBoostHandler
Handles removed chat boost events for monitoring community support patterns.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @PollHandler
Handles poll state update events for monitoring poll lifecycle and results.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @PollAnswerHandler
Handles poll answer events for processing user responses and voting patterns.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

#### @BusinessConnectionHandler
Handles business connection events for monitoring account connections and authorization.

**Parameters:**

- `filter()` - Custom filter class for advanced logic
- `priority()` - Execution priority

## Usage Examples

### Basic Message Handler
```java
@MessageHandler(commands = "start", chatType = ChatType.PRIVATE)
void handleStartCommand(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Welcome!").exec();
}
```


### Advanced Filtering with Custom Logic
```java
@MessageHandler(
    commands = {"help", "support"},
    chatType = ChatType.PRIVATE,
    filter = PremiumUserFilter.class,
    state = "awaiting_support"
)
void premiumSupport(BotContext context, Message message) {
    // Handle premium support requests
}
```

### Multiple Handlers with Priorities

```java
@MessageHandler(commands = "stats")
void showStats(BotContext context, Message message) {
    // handle stats command
}

@MessageHandler(priority = 1)
void logMessage(BotContext context, Message message) {
    // Log all messages except /stats command
}
```

## Common Patterns

### Repeatable Annotations
All handler annotations are `@Repeatable`, allowing multiple handlers on the same method:

```java
@MessageHandler(commands = "start", type = ChatType.PRIVATE)
@MessageHandler(commands = "help")
void handleStartAndHelp(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Welcome to help!").exec();
}
```

### Custom Filter Implementation
```java
public class PremiumUserFilter implements CustomFilter {
    @Override
    public boolean check(Update update) {
        return update.message.from.is_premium != null;
    }
}
```

**Finally, you must add the class you registered handler in by using `addHandler` method**
```java
bot.addHandler(new MyHandler())
```

## Priority System

- **Lower priority numbers** execute before higher numbers
- **Negative values** are allowed and execute even earlier
- **Default priority** is 0
- Useful for controlling execution order when multiple handlers match the same update with the same content

[//]: # (## Best Practices)

[//]: # ()
[//]: # (1. **Use specific filtering** to avoid overlapping handlers)

[//]: # (2. **Leverage priorities** for proper execution order)

[//]: # (3. **Implement custom filters** for complex business logic)

[//]: # (4. **Use conversation states** for multi-step interactions)

[//]: # (5. **Handle errors gracefully** within your handler methods)

## The Critical Importance of Priority in Handler Execution

### The Fundamental Problem: JVM Method Ordering

Java's `getDeclaredMethods()` returns methods in an **unspecified, non-deterministic order** that can vary across:

- Different JVM implementations (OpenJDK vs Oracle JDK)
- Different versions of the same JVM
- Different runs of the same application
- Different class loading scenarios
- Code changes and recompilations

This complete unpredictability makes handler execution order **random** without explicit priority control.

### The Dangerous Reality

#### The Problematic Code
```java
@MessageHandler(commands = "start")
void start(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Welcome message!").exec();
}

@MessageHandler(commands = "help") 
void help(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Detailed help content").exec();
}

@MessageHandler(regex = "(start|help)")
void regex(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Generic help response").exec();
}
```

#### What Could Happen

1. **Development environment**: `start` → `help` → `regex` (as declared)
2. **Production environment**: `regex` → `start` → `help` (JVM reordering)
3. **After hot reload**: `help` → `regex` → `start` (complete reshuffle)
4. **Different server**: `regex` executes first and claims all `/start` and `/help` commands

#### The catastrophic result:
The regex handler might execute **first** and handle both `/start` and `/help` commands, completely blocking the specific handlers from ever running!

### Why Priority is the Only Solution

#### The Working Solution
```java
@MessageHandler(commands = "start") // priority = 0 (default)
void start(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Welcome message!").exec();
}

@MessageHandler(commands = "help") // priority = 0 (default)
void help(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Detailed help content").exec();
}

@MessageHandler(regex = "(start|help)", priority = 1) // Explicit higher priority
void regex(BotContext context, Message message) {
    context.sendMessage(message.chat.id, "Generic help response").exec();
}
```

### How Priority Guarantees Order

**Execution is sorted by priority in ascending order:**

1. All priority = 0 handlers (`start` and `help`)
2. All priority = 1 handlers (`regex`)

**Within same priority** (like `start` and `help` both at priority=0), the order is still unpredictable, but this is **acceptable** because:

- They handle different commands (`/start` vs `/help`)
- They are mutually exclusive (no overlap)
- No risk of one blocking the other

### Key Characteristics:

1. **Lower numbers execute first** (-100 before 0 before 1 before 100)
2. **Same priority order is unpredictable** but safe for non-conflicting handlers
3. **Small differences work** (priority=1 always executes after priority=0)
4. **Complete control** over which handler "wins" for overlapping filters

## The Non-Negotiable Rule

**Always use explicit priorities when handlers might match the same update with the same content.**

The only safe time to rely on default priority=0 is when:

1. Handlers are completely mutually exclusive, AND
2. There's no risk of one handler blocking another, AND
3. You're willing to accept unpredictable order among them

For any potential overlap or conflict, **explicit priority control is mandatory**.

