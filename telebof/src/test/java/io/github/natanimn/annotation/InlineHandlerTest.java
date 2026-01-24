package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.InlineHandler;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.InlineQuery;
import io.github.natanimn.telebof.types.updates.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class InlineHandlerTest {
    BotClient client;

    @BeforeEach
    void setUp(){
        this.client = new BotClient(System.getenv("TOKEN"));
        client.addHandler(this);
    }

    @Test
    public void start(){
        client.startPolling();
    }

    @MessageHandler(commands = "start")
    void start(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Press the button")
                .replyMarkup(
                        new InlineKeyboardMarkup(
                                new InlineKeyboardButton[]{
                                        new InlineKeyboardButton("Click me")
                                                .setSwitchInlineQueryCurrentChat("")
                                        }
                ))
                .exec();
    }

    @InlineHandler
    void button(BotContext context, InlineQuery query){
        System.out.println(query);
    }
}
