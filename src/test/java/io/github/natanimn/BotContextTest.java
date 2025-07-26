package io.github.natanimn;

import io.github.natanimn.enums.ChatAction;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.types.updates.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import static org.junit.jupiter.api.Assertions.*;

class BotContextTest {

    String TOKEN;
    BotClient bot;
    String BOT_USERNAME;
    Long BOT_ID, CHAT_ID;

    @BeforeEach
    void setUp() {
        this.TOKEN           = System.getenv("TOKEN");
        this.bot             = new BotClient(TOKEN);
        this.CHAT_ID         = 5213764043L;
        this.BOT_USERNAME    = "TelebofTestBot";
        this.BOT_ID          = 6145534151L;
    }

    @Test
    void getMe() {
//        User me = bot.context.getMe().exec();
//        assertEquals(me.id, BOT_ID);
//        assertEquals(me.username, BOT_USERNAME);
    }

    @Test
    void sendMessage() {
        Message message1 = bot.context.sendMessage(CHAT_ID, "HELLO, WORLD").exec();
        assertEquals(message1.chat.id, CHAT_ID);
        assertNull(message1.audio);
    }

    @Test
    void sendPhoto() {
        Message message1 = bot.context.sendPhoto(CHAT_ID, new File("src/test/resources/telegram.png")).exec();
        assertEquals(message1.chat.id, CHAT_ID);
        assertNull(message1.audio);
        assertNotNull(message1.photo);
    }

    @Test
    void testParseMode(){
        String text1 = "<b>Hello, World</b>";
        Message message1 = bot.context.sendMessage(CHAT_ID, text1).parseMode(ParseMode.HTML).exec();
        assertNotNull(message1);
    }

    @Test
    void testChatAction(){
        Boolean resp = bot.context.sendChatAction(CHAT_ID, ChatAction.TYPING).exec();
        assertNotNull(resp);
        assertTrue(resp);
    }


}