package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.updates.Update;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MessageHandlerTest {

    static class NotBot implements CustomFilter {
        @Override
        public boolean check(Update update) {
            return update.getMessage().getNewChatMembers().get(0).getId() != 5955384032L;
        }
    }

    BotClient client;

    @BeforeEach
    void setUp(){
        this.client = new BotClient(System.getenv("TOKEN"));
        System.out.println(client.context.getMe().exec().getId());
        client.addHandler(new MessageHandlerTest());

    }

    @Test
    public void start(){
        client.startPolling();
    }

    @MessageHandler(commands = {"start", "help", "info"})
    public void command(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Hello, World").exec();
    }

    @MessageHandler(texts = {"hi", "hello", "hey"})
    public void texts(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Hey").exec();
    }

    @MessageHandler(regex = "(?i)(hello|hey|hi)", priority = 1)
    public void regex(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "What's up!").exec();
    }

    @MessageHandler(type = MessageType.TEXT, priority = 2)
    public void echo(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), message.getText()).exec();
    }

    @MessageHandler(type = MessageType.PHOTO)
    public void photo(BotContext context, Message message){
        context.sendPhoto(message.getChat().getId(), message.getPhoto().get(2).getFileId())
                .caption("Nice photo")
                .exec();
    }

    @MessageHandler(type = MessageType.NEW_CHAT_MEMBER, filter = NotBot.class)
    void welcome(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Welcome!")
                .exec();
    }

    @MessageHandler(type = MessageType.NEW_CHAT_MEMBER, priority = 1)
    void welcome_me(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "I Joined!")
                .exec();
    }

    @MessageHandler(commands = "state")
    void state(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "What is your name?").exec();
        context.setState(message.getChat().getId(), "name");
    }

    @MessageHandler(type = MessageType.TEXT, state = "name")
    void getName(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Your name is " + message.getText()).exec();
        context.clearState(message.getChat().getId());
    }

}
