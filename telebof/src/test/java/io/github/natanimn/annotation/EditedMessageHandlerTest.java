package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.EditedMessageHandler;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.types.ReplyParameters;
import io.github.natanimn.telebof.types.updates.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class EditedMessageHandlerTest {
    BotClient client;

    @BeforeEach
    void setUp() {
        this.client = new BotClient(System.getenv("TOKEN"));
        client.addHandler(new EditedMessageHandlerTest());
    }

    @Test
    public void start(){
        System.out.println("Bot started...");
        client.startPolling();
    }

    @EditedMessageHandler(type = MessageType.TEXT, priority = 1)
    public void text(BotContext context, Message message){
        context.sendMessage(message.chat.id, "Edited with text")
                .replyParameters(new ReplyParameters(message.message_id))
                .exec();
    }

    @EditedMessageHandler(type = MessageType.PHOTO)
    public void photo(BotContext context, Message message){
        context.sendMessage(message.chat.id, "Replaced with photo")
                .replyParameters(new ReplyParameters(message.message_id))
                .exec();
    }


    @EditedMessageHandler(type = MessageType.ENTITIES)
    public void entity(BotContext context, Message message){
        context.sendMessage(message.chat.id, "New edited message contained entity")
                .replyParameters(new ReplyParameters(message.message_id))
                .exec();
    }

    @EditedMessageHandler(type = MessageType.QUOTE)
    public void quote(BotContext context, Message message){
        context.sendMessage(message.chat.id, "New edited message contained a quote")
                .replyParameters(new ReplyParameters(message.message_id))
                .exec();
    }

    @EditedMessageHandler(priority = 2)
    public void any(BotContext context, Message message){
        System.out.println("New edited message detected");
    }
}

