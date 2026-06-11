package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.requests.Api;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.Optional;
import io.github.natanimn.telebof.enums.ParseMode;

public class SendMessageTest {
    private Api api;
    private final Long chatId = 5213764043L;

    @BeforeEach
    public void setUp() {
        Optional<String> token = Optional.ofNullable(System.getenv("BOT_TOKEN"));
        if (token.isEmpty()) {
            throw new RuntimeException("BOT_TOKEN is undefined");
        }
        this.api = new Api(token.get(), false, null, null);
    }

    @Test
    public void testSendMessageInit() {
        SendMessage request = new SendMessage(chatId, "test", api);
        assertNotNull(request);
    }

    @Test
    public void testMessageThreadId() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .messageThreadId(1);
        assertNotNull(request);
    }

    @Test
    public void testParseMode() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .parseMode(ParseMode.HTML);
        assertNotNull(request);
    }

    @Test
    public void testDisableWebPagePreview() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .disableWebPagePreview(true);
        assertNotNull(request);
    }

    @Test
    public void testDisableNotification() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .disableNotification(true);
        assertNotNull(request);
    }

    @Test
    public void testProtectContent() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .protectContent(true);
        assertNotNull(request);
    }

    @Test
    public void testReplyParameters() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .replyParameters(null);
        assertNotNull(request);
    }

    @Test
    public void testReplyMarkup() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .replyMarkup(null);
        assertNotNull(request);
    }

    @Test
    public void testBusinessConnectionId() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .businessConnectionId("test");
        assertNotNull(request);
    }

    @Test
    public void testMessageEffectId() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .messageEffectId("test");
        assertNotNull(request);
    }

    @Test
    public void testAllowPaidBroadcast() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .allowPaidBroadcast(true);
        assertNotNull(request);
    }

    @Test
    public void testDirectMessagesTopicId() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .directMessagesTopicId(1);
        assertNotNull(request);
    }

    @Test
    public void testSuggestedPostParameters() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .suggestedPostParameters(null);
        assertNotNull(request);
    }

    @Test
    public void testAllMethods() {
        SendMessage request = new SendMessage(chatId, "test", api)
                .messageThreadId(1)
                .parseMode(ParseMode.HTML)
                .disableWebPagePreview(true)
                .disableNotification(true)
                .protectContent(true)
                .replyParameters(null)
                .replyMarkup(null)
                .businessConnectionId("test")
                .messageEffectId("test")
                .allowPaidBroadcast(true)
                .directMessagesTopicId(1)
                .suggestedPostParameters(null);
        assertNotNull(request);
    }
}
