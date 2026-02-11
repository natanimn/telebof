package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.enums.ButtonStyle;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.Message;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class ColoredKeyboardTest {
    private BotClient bot;

    @BeforeEach
    void setUp(){
        this.bot = new BotClient(System.getenv("TOKEN"));
        bot.addHandler(this);
    }

    @Test
    void startBot() throws InterruptedException {
        bot.startPolling();
//        Thread.currentThread().join();
    }

    @MessageHandler(commands = "start")
    void start(BotContext ctx, Message message){
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setRowWidth(1);
        markup.addKeyboard(
                new InlineKeyboardButton("GREEN", "green").setStyle(ButtonStyle.SUCCESS),
                new InlineKeyboardButton("RED", "red").setStyle(ButtonStyle.DANGER),
                new InlineKeyboardButton("PRIMARY", "primary").setStyle(ButtonStyle.PRIMARY)
        );

        ctx.sendMessage(message.getChat().getId(), "Here are colored buttons: ")
                .replyMarkup(markup)
                .exec();
    }

    @MessageHandler(commands = "icons")
    void icons(BotContext ctx, Message message){
        InlineKeyboardMarkup markup = new InlineKeyboardMarkup();
        markup.setRowWidth(1);

        markup.addKeyboard(
                new InlineKeyboardButton("Verified", "verified").setIconCustomEmojiId("5426871635841941065"),
                new InlineKeyboardButton("Gift", "gift").setIconCustomEmojiId("5938540495792771769"),
                new InlineKeyboardButton("Java", "java").setIconCustomEmojiId("5373232592441065346")
        );

        ctx.sendMessage(message.getChat().getId(), "Here are premium icon: ")
                .replyMarkup(markup)
                .exec();
    }
}
