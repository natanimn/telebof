# Error Handling in Telebof

Proper error handling is crucial for building Telegram bots. Telebof provides a structured exception hierarchy to help you handle different types of API errors gracefully.

---

## Exception Hierarchy

All Telegram API exceptions inherit from the base `TelegramApiException` class. The exception hierarchy is organized as follows:

```
TelegramApiException (Base class)
├── Forbidden (403 errors)
├── BadRequest (400 errors)  
└── FloodError (429 rate limit errors)
```

These exceptions are defined in the `io.github.natanimn.telebof.exceptions` package.

---

## Basic Error Handling Example

```java
import io.github.natanimn.telebof.exceptions.TelegramApiException;

try {     
    context.sendMessage(message.chat.id, "Hello, World").exec();    
} catch(TelegramApiException apiException){
    System.out.println("Error: " + apiException.getDescription());
    System.out.println("Error code: " + apiException.getErrorCode());
}
```

**Key Properties:**

- `description`: Human-readable error message from Telegram
- `error_code`: Numeric HTTP status code (400, 403, 429, etc.)

---

## Handling Specific Exception Types

### 1. Forbidden (403 Errors)
Occurs when the bot doesn't have permission to perform an action.

```java
import io.github.natanimn.telebof.exceptions.TelegramApiException;
import io.github.natanimn.telebof.exceptions.Forbidden;

try {
    context.sendMessage(chat_id, "Hello!").exec();
} catch (Forbidden e) {
    // Bot was blocked by user or doesn't have chat permissions
    System.out.println("Cannot send message: " + e.getDescription());
    // Example: "Forbidden: bot was blocked by the user"
} catch (TelegramApiException e) {
    System.out.println("Other API error: " + e.getDescription());
}
```

**Common scenarios:**

- Bot was blocked by the user
- Bot doesn't have permission to send messages in a chat
- Bot was removed from a group/channel

---

### 2. BadRequest(400 Errors)
Occurs when the request contains invalid parameters.

```java
import io.github.natanimn.telebof.exceptions.TelegramApiException;
import io.github.natanimn.telebof.exceptions.BadRequest;

try {
    context.sendMessage(invalidChatId, "Test message").exec();
} catch (BadRequest e) {
    // Invalid parameters or malformed request
    System.out.println("Bad request: " + e.getDescription());
    // Example: "Bad Request: chat not found"
} catch (TelegramApiException e) {
    System.out.println("Other API error: " + e.getDescription());
}
```

**Common scenarios:**

- Invalid chat ID
- Malformed message content
- Unsupported media types
- Exceeding maximum message length

---

### 3. FloodError (429 Errors)
Occurs when the bot exceeds Telegram's rate limits.

```java
import io.github.natanimn.telebof.exceptions.TelegramApiException;
import io.github.natanimn.telebof.exceptions.FloodError;

try {
    context.sendMessage(chatId, "Message").exec();
} catch (FloodError e) {
    // Rate limited - wait before retrying
    System.out.println("Flood control: " + e.getDescription());
    System.out.println("Retry after: " + e.getParameters.getRetryAfter() + " seconds");
    
    // Implement retry logic with delay
    Thread.sleep(e.retryAfter * 1000);
    // Retry the operation here
    
} catch (TelegramApiException e) {
    System.out.println("Other API error: " + e.getDescription());
}
```

**Key Property:**

- `parameters.retry_after`: Number of seconds to wait before retrying the request

---


## Comprehensive Error Handling Example


Here's a complete example showing structured error handling for different scenarios:


```java
import io.github.natanimn.telebof.exceptions.TelegramApiException;
import io.github.natanimn.telebof.exceptions.Forbidden;
import io.github.natanimn.telebof.exceptions.BadRequest;
import io.github.natanimn.telebof.exceptions.FloodError;

public class ErrorHandlingExample {
    
    public void sendSafeMessage(BotContext context, Long chatId, String text) {
        try {
            context.sendMessage(chatId, text).exec();
            
        } catch (Forbidden e) {
            System.out.println("Permission denied: " + e.getDescription());
            // Handle blocked bot scenario - maybe remove user from database
            
        } catch (FloodError e) {
            System.out.println("Rate limited. Retrying in " + e.getParameters().getRetryAfter() + " seconds");
            // Implement retry logic with exponential backoff
            
        } catch (BadRequest e) {
            System.out.println("Invalid request: " + e.getDescription());
    
            
        } catch (TelegramApiException e) {
            System.out.println("Unexpected API error (" + e.getErrorCode() + "): " + e.getDescription());
            // Handle other unexpected errors
            
        } catch (Exception e) {
            System.out.println("Non-API error: " + e.getMessage());
            // Handle other exceptions 
        }
    }
}
```

---

## Common Error Scenarios and Solutions

| Error Type | Common Causes | Recommended Action |
|------------|---------------|-------------------|
| **Forbidden** | Bot blocked, no permissions | Remove user from DB, log incident |
| **BadRequest** | Invalid parameters, long messages | Validate input, truncate content |
| **FloodError** | Rate limiting | Implement retry with exponential backoff |
