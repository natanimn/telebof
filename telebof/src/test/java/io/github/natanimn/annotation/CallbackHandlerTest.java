package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.CallbackHandler;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.CallbackQuery;
import io.github.natanimn.telebof.types.updates.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CallbackHandlerTest {
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
        context.sendMessage(message.chat.id, "Press the button")
                .replyMarkup(new InlineKeyboardMarkup(
                        new InlineKeyboardButton[]{new InlineKeyboardButton("Click me", "click me")}
                ))
                .exec();
    }

    @CallbackHandler(data = "click me")
    void button(BotContext context, CallbackQuery query){
        context.answerCallbackQuery(query.id, "Button pressed").exec();
    }
}
