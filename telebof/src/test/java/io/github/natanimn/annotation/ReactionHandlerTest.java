package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.annotations.ReactionHandler;

import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.updates.MessageReactionUpdated;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ReactionHandlerTest {
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
        context.sendMessage(message.chat.id, "React to this message").exec();
    }

    @ReactionHandler
    void reaction(BotContext context, MessageReactionUpdated reactionUpdated){
        context.sendMessage(reactionUpdated.chat.id, "Reacted " + reactionUpdated.new_reaction.get(0).emoji).exec();
    }
}
