package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.ChannelPostHandler;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.types.updates.Message;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChannelPostHandlerTest {
    BotClient client;

    @BeforeEach
    void setUp(){
        this.client = new BotClient(System.getenv("TOKEN"));
        System.out.println(client.context.getMe().exec().getId());
        client.addHandler(this);

    }

    @Test
    public void start(){
        client.startPolling();
    }

    @ChannelPostHandler(commands = {"news", "update", "info"})
    public void command(BotContext context, Message message){
        context.deleteMessage(message.getChat().getId(),message.getMessageId()).exec();
        context.sendMessage(message.getChat().getId(), "News message is arriving..").exec();
    }

    @ChannelPostHandler(texts = {"hi", "hello", "hey"})
    public void texts(BotContext context, Message message){
        context.deleteMessage(message.getChat().getId(),message.getMessageId()).exec();
        context.sendMessage(message.getChat().getId(), "Hello, everyone!").exec();
    }

    @ChannelPostHandler(regex = "(?i)(hello|hey|hi)", priority = 1)
    public void regex(BotContext context, Message message){
        context.deleteMessage(message.getChat().getId(),message.getMessageId()).exec();
        context.sendMessage(message.getChat().getId(), "What's up guys!").exec();
    }

    @ChannelPostHandler(type = MessageType.TEXT, priority = 2)
    public void echo(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Bot said: " + message.getText()).exec();
    }

    @ChannelPostHandler(type = MessageType.PHOTO)
    public void photo(BotContext context, Message message){
        context.deleteMessage(message.getChat().getId(),message.getMessageId()).exec();
        context.sendPhoto(message.getChat().getId(), message.getPhoto().get(2).getFileId())
                .caption("Nice photo")
                .exec();
    }
}
