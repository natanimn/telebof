package io.github.natanimn.annotation;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.annotations.MessageHandler;
import io.github.natanimn.telebof.annotations.PreCheckoutHandler;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.types.payments.LabeledPrice;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.updates.PreCheckoutQuery;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreCheckoutHandlerTest {
    BotClient client;

    @BeforeEach
    void setUp(){
        this.client = new BotClient(System.getenv("TOKEN"));
        System.out.println(client.context.getMe().exec().id());
        client.addHandler(this);

    }

    @Test
    public void start(){
        client.startPolling();
    }
    @MessageHandler(commands = "start")
    void start(BotContext context, Message message){
        context.sendInvoice(message.chat().id(), "test", "test a precheckout", "test", "XTR",
                new LabeledPrice[]{new LabeledPrice("10", 5)}).exec();
    }

    @PreCheckoutHandler
    void processPrecheckOut(BotContext context, PreCheckoutQuery query){
        context.answerPreCheckoutQuery(query.id(), true).exec();
    }

    @MessageHandler(type = MessageType.SUCCESSFUL_PAYMENT)
    void acceptPayment(BotContext context, Message message){
        context.refundStarPayment(message.from().id(), message.successfulPayment().telegramPaymentChargeId()).exec();
    }

}
