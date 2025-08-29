# States in Telebof

The **States** system in Telebof allows bots to manage multi step conversations by keeping track of a user's current step and storing temporary data. This feature is essential for building forms, surveys, and context aware interactions.

---

## Overview

A **state** represents the current step a user is at in a conversation. Each state can store associated data, enabling the bot to retrieve and use it in subsequent steps. States can exist in:

* **Private chats** (per user)
* **Group or supergroup chats** (per user in a chat)

---

## BotContext: Managing States

`BotContext` provides methods to set, clear, and retrieve states and their data.

### Set State

* **Private chat:**

```java

context.setState(user_id, "state_name");
```

* **Group/Supergroup chat:**

```java

context.setState(chat_id, user_id, "state_name");
```

### Clear State

* **Private chat:**

```java

context.clearState(user_id);
```

* **Group/Supergroup chat:**

```java

context.clearState(chat_id, user_id);
```

### Retrieve State Data

* **Private chat:**

```java
Map<String, Object> data = 
context.getStateData(user_id);
```

* **Group/Supergroup chat:**

```java
Map<String, Object> data = 
context.getStateData(chat_id, user_id);
```

> Use the returned `Map<String, Object>` to store and access temporary data associated with the user’s current state.

---

### filter.state


* Returns `true` if the user is currently in the given state.
* **Special case:** `"*"` matches any active state.
* Works for both messages and callback queries.
* Checks states in private chats and group/supergroup chats.

**Usage Example:**

```java
bot.onMessage(filter -> filter.state("name"), handler);
bot.onMessage(filter -> filter.commands("cancel") && filter.state("*"), cancelHandler);
```

---

## Tips for Using States

1. Use `"*"` in `filter.state("*")` to match any active state.
2. Always clear states after the flow is complete or on cancellation.
3. Store intermediate data in `getStateData()` for multi step flows.
4. Works seamlessly in both private and group chats.

---

**Full example code can be found on [StateBot](/examples/state_bot)**
