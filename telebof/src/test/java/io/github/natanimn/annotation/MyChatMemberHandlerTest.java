package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.MyChatMemberHandler;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.types.updates.ChatMemberUpdated;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class MyChatMemberHandlerTest {
    BotClient client;

    @BeforeEach
    void setUp() {
        this.client = new BotClient(System.getenv("TOKEN"));
        client.addHandler(new MyChatMemberHandlerTest());
    }

    @Test
    public void start(){
        System.out.println("Bot started...");
        client.startPolling();
    }

    @MyChatMemberHandler(status = ChatMemberStatus.MEMBER)
    void member(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "I am just a member").exec();
    }

    @MyChatMemberHandler(status = ChatMemberStatus.ADMINISTRATOR)
    void admin(BotContext context, ChatMemberUpdated updated){
        context.sendMessage(updated.getChat().getId(), "I am now admin :)").exec();
    }

    @MyChatMemberHandler(status = ChatMemberStatus.LEFT)
    void left(BotContext context, ChatMemberUpdated updated){
        System.out.println("Bot left the group");
    }

    @MyChatMemberHandler(status = ChatMemberStatus.RESTRICTED)
    void restricted(BotContext context, ChatMemberUpdated updated){
        System.out.println("Bot restricted in the the chat");
        context.leaveChat(updated.getChat().getId()).exec();
    }

    @MyChatMemberHandler(status = ChatMemberStatus.BANNED)
    void banned(BotContext context, ChatMemberUpdated updated){
        System.out.println("Bot banned from the chat");
    }

    @MyChatMemberHandler(priority = 1)
    void any(BotContext context, ChatMemberUpdated updated){
        System.out.println("Bot current status " + updated.getNewChatMember().getStatus());
    }

}
