package io.github.natanimn.spring.example;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.spring.Bot;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.types.updates.Message;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Bot
public class SpringExampleApplication {

    @MessageHandler(commands = "start")
    public void start(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), "Hello, I am echo bot").await();
    }

    @MessageHandler(type = MessageType.TEXT, priority = 1)
    public void echo(BotContext context, Message message){
        context.sendMessage(message.getChat().getId(), message.getText()).exec();
    }

    public static void main(String[] args){
        SpringApplication.run(SpringExampleApplication.class, args);
    }
}
