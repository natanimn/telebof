package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.ChatMemberHandler;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.enums.Updates;
import io.github.natanimn.telebof.types.updates.ChatMemberUpdated;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ChatMemberHandlerTest {
    BotClient client;

    @BeforeEach
    void setUp() {
        this.client = new BotClient.Builder(System.getenv("TOKEN"))
                .allowedUpdates(Updates.ALL)
                .build();
        client.addHandler(this);
    }

    @Test
    public void start(){
        System.out.println("Bot started...");
        client.startPolling();
    }

    @ChatMemberHandler(status = ChatMemberStatus.MEMBER)
    void member(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "%s demoted in the chat".formatted(updated.getNewChatMember().getUser().mention()))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    @ChatMemberHandler(status = ChatMemberStatus.ADMINISTRATOR)
    void admin(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "%s promoted in the chat".formatted(updated.getNewChatMember().getUser().mention()))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    @ChatMemberHandler(status = ChatMemberStatus.LEFT)
    void left(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "%s left the chat".formatted(updated.getNewChatMember().getUser().mention()))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    @ChatMemberHandler(status = ChatMemberStatus.RESTRICTED)
    void restricted(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "User %s restricted in the chat".formatted(updated.getNewChatMember().getUser().mention()))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    @ChatMemberHandler(status = ChatMemberStatus.BANNED)
    void banned(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "%s banned from the chat".formatted(updated.getNewChatMember().getUser().mention()))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    @ChatMemberHandler(priority = 1)
    void any(BotContext context, ChatMemberUpdated updated){
        System.out.println("user current status " + updated.getNewChatMember().getStatus());
    }

}
