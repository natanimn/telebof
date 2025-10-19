package io.github.natanimn;

import io.github.natanimn.telebof.enums.ChatAction;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.types.input.InputMedia;
import io.github.natanimn.telebof.types.input.InputMediaPhoto;
import io.github.natanimn.telebof.types.media_and_service.Video;
import io.github.natanimn.telebof.types.updates.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BotContextTest {

    String TOKEN;
    BotClient bot;
    String BOT_USERNAME;
    Long BOT_ID, CHAT_ID;

    @BeforeEach
    void setUp() {
        this.TOKEN = System.getenv("TOKEN");
        this.bot = new BotClient(TOKEN);
        this.CHAT_ID = 5213764043L;
        this.BOT_USERNAME = "TelebofTestBot";
        this.BOT_ID = 6145534151L;
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
        assertEquals(message1.chat.id(), CHAT_ID);
        assertNull(message1.audio);
    }

    @Test
    void sendPhoto() {
        Message message1 = bot.context.sendPhoto(CHAT_ID, new File("src/test/resources/telegram.png")).exec();
        assertEquals(message1.chat.isForum(), CHAT_ID);
        assertNull(message1.audio);
        assertNotNull(message1.photo);
        Video video = null;
//        video.fileUniqueId();
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

    @Test
    void testSendMediaGroup(){
        InputMedia[] inputMedia = new InputMedia[5];
        File pic = new File("src/test/resources/telegram.png");
        for (int i=0; i < 5; i++) inputMedia[i] = new InputMediaPhoto(pic);
        List<Message> messages = bot.context.sendMediaGroup(CHAT_ID, inputMedia).exec();
        for (Message msg: messages) assertNotNull(msg);
    }

    @Test
    void sendVideo(){
        String file_id = "BAACAgQAAxkDAAIUrmiQqBMRFaKIbgL03HN631gAAVT_ngACLBoAAu-EiFC0h2DtKDhRGzYE";
        File thumb = new File("src/test/resources/telegram.png");

        Message message = bot.context.sendVideo(CHAT_ID, file_id)
                .caption("<b>Enjoy the video</b>")
                .parseMode(ParseMode.HTML)
                .cover(thumb)
                .exec();

        assertNotNull(message);
        assertNotNull(message.chat);
    }
}