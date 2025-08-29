# Advanced Features in Telebof

Telebof provides several advanced configuration options to customize your bot's behavior, including proxy support, logging control, multi-threading, and update management.

---

## Custom Proxy Configuration

Telebof allows you to route bot traffic through a proxy server, which is useful for bypassing network restrictions or enhancing privacy.

**Example: Setting up a SOCKS proxy**

```java
import io.github.natanimn.telebof.BotClient;
import java.net.InetSocketAddress;
import java.net.Proxy;

public class ProxyExample {
    public static void main(String[] args) {
        // Create socket address with proxy server details
        InetSocketAddress address = new InetSocketAddress("127.97.91", 80); // hostname and port
        
        // Create SOCKS proxy instance
        Proxy proxy = new Proxy(Proxy.Type.SOCKS, address);
        
        // Configure bot with proxy settings
        BotClient bot = new BotClient.Builder(TOKEN)
                .proxy(proxy)
                .build();
    }
}
```

**Supported Proxy Types:**


- `Proxy.Type.SOCKS` - SOCKS proxy (versions 4/5)
- `Proxy.Type.HTTP` - HTTP proxy
- `Proxy.Type.DIRECT` - No proxy (default)

---

## Logging Configuration

Telebof uses Java's built-in logging framework, allowing you to control log levels for debugging and monitoring.

**Example: Setting log levels**

```java
import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotLog;
import java.util.logging.Level;

public class LoggingExample {
    public static void main(String[] args) {
        // Set different log levels as needed
        BotLog.setLevel(Level.INFO); // Options: SEVERE, WARNING, INFO, CONFIG, FINE, FINER, FINEST
        
        BotClient bot = new BotClient(TOKEN);
        
        // Example of different log levels in practice:
        // - SEVERE: Critical errors that prevent operation
        // - WARNING: Potential issues that don't stop execution (default)
        // - INFO: General operational information
        // - FINE: Detailed debugging information
    }
}
```

**Default Log Level:** `Level.WARNING` (shows only warnings and errors)

---

## Multi-Threading Configuration

Telebof supports concurrent update processing through configurable threading, improving performance for high traffic bots.

**Example: Configuring multiple threads**

```java
public class ThreadingExample {
    public static void main(String[] args) {
        // Configure bot with 10 threads for concurrent processing
        var bot = new BotClient.Builder(TOKEN)
                .numThreads(10) // Process updates in parallel
                .build();
    }
}
```

**Default:** 2 threads<br>
**Recommendation:** Adjust based on your server's CPU cores and expected message volume

---

## Complete Configuration Example

Here's how to use all advanced features together in a single configuration:

```java
import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotLog;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.enums.Updates;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.logging.Level;

public class AdvancedConfigurationExample {
    public static void main(String[] args) {
        // Configure logging first
        BotLog.setLevel(Level.INFO); // Set to INFO level for operational details
        
        // Set up proxy (optional)
        InetSocketAddress proxyAddress = new InetSocketAddress("proxy.example.com", 8080);
        Proxy proxy = new Proxy(Proxy.Type.HTTP, proxyAddress);
        
        // Complete bot configuration with all advanced options
        BotClient bot = new BotClient.Builder(TOKEN)
                .skipOldUpdates(false)       // Receive updates from last 24 hours
                .limit(10)                   // Maximum 10 updates per request
                .useTestServer(false)        // Use production Telegram server
                .timeout(30)                 // 30-second timeout for requests
                .offset(-1)                  // Start from most recent update
                .allowedUpdates(Updates.ALL) // Receive all update types
                .proxy(proxy)                // Use HTTP proxy
                .numThreads(4)               // Use 4 threads for processing
                .localBotApiUrl("https://your-local-bot-api.com") // Custom Bot API server
                .build();
    }
}
```

---

## Configuration Options Explained

### `skipOldUpdates(false)`

- **Purpose**: Controls whether to receive updates sent while the bot was offline
- **`false`**: Receive updates from the last 24 hours (catch up on missed messages)
- **`true`**: Skip old updates and only process new ones

### `limit(10)`

- **Purpose**: Limits the number of updates retrieved per polling request
- **Default**: Usually 100 (Telegram's default)
- **Use Case**: Reduce memory usage or network traffic

### `useTestServer(false)`

- **Purpose**: Switch between production and test environments
- **`false`**: Use official Telegram Bot API (production)
- **`true`**: Use test environment (Requires speciail bot token. Sign in using <a href="https://web.telegram.org?test=1">Telegram Web</a>)

### `timeout(30)`

- **Purpose**: Sets the HTTP request timeout in seconds
- **Default**: Varies by implementation
- **Consideration**: Increase for slow networks, decrease for faster response times

### `offset(-1)`

- **Purpose**: Controls which updates to start receiving from
- **`-1`**: Start from the most recent update
- **Positive number**: Start from a specific update ID

### `allowedUpdates(Updates.ALL)`


- **Purpose**: Filters which types of updates to receive<br>

**Options**: 

  - `Updates.ALL` - All update types
  - `Updates.MESSAGE` - Only messages
  - `Updates.CALLBACK_QUERY` - Only callback queries
  - `Updates.INLINE_QUERY` - Only inline queries
  - (Other specific update types)

### `proxy(proxy)`


- **Purpose**: Configures network proxy for all bot communications
- **Use Cases**: Network restrictions, security, privacy

### `numThreads(4)`


- **Purpose**: Sets the number of threads for concurrent update processing
- **Default**: 2 threads
- **Optimization**: Match to your server's CPU core count


### `localBotApiUrl(url)`


- **Purpose**: Run on your server
- **Default**: [Telegram Server](https://api.telegram.org)
- **Read More**: [Using local bot api server](https://core.telegram.org/bots/api#using-a-local-bot-api-server)


---
