package io.github.natanimn;

import io.github.natanimn.BotClient;
import io.github.natanimn.BotContext;
import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.payments.LabeledPrice;
import io.github.natanimn.telebof.types.payments.SuccessfulPayment;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.types.updates.PreCheckoutQuery;

/**
 * Payment example bot of telebof library
 * For simplicity, we will use telegram star.
 * Obtain your bot token from @BotFather, and replace with the field TOKEN
 */

public class PaymentExampleBot {
    static String TOKEN = System.getenv("TOKEN");
    public static void main(String[] args){
        // Initialize
        BotClient bot = new BotClient(TOKEN);

        // Register /start command
        bot.onMessage(filter -> filter.commands("start"), PaymentExampleBot::start);

        // Register /pay command
        bot.onMessage(filter -> filter.commands("pay"), PaymentExampleBot::pay);

        // Register pre checkout
        bot.onPreCheckout(filter -> true, PaymentExampleBot::processPrecheckOut);

        // Register successful payment update
        bot.onMessage(filter -> filter.successfulPayment(), PaymentExampleBot::acceptPayment);

        // Run the bot
        bot.startPolling();
    }

    static void start(BotContext context, Message message){
        User user = message.from;
        context.sendMessage(message.chat.id, String.format(
                "<b>Hello %s!</b>,\n\nI am payment example bot.\n<i>Send /pay to try it out.</i>", user.mention()
                ))
                .parseMode(ParseMode.HTML)
                .exec();
    }

    static void pay(BotContext context, Message message){
        // Payment is with Telegram star

        LabeledPrice price = new LabeledPrice("Pay 10 star", 10);

        /**
         * Pass:
         * title,
         * description,
         * payload,
         * array of labeled price
         */
        context.sendInvoice(
                message.chat.id,
                "Payment test",
                "Pay 10 start for telebof payment test bot",
                "pay-10",
                "XTR",
                new LabeledPrice[]{price}
        ).exec();
    }

    static void processPrecheckOut(BotContext context, PreCheckoutQuery query){
        // Confirm checkout
        context.answerPreCheckoutQuery(query.id, true).exec();
    }

    static void acceptPayment(BotContext context, Message message){
        SuccessfulPayment payment = message.successful_payment;

        // Refund the star payment to the user
        context.refundStarPayment(message.from.id, payment.telegram_payment_charge_id).exec();

        context.sendMessage(message.chat.id,
                "<b>Yay, your money is refunded.</b>\n\n" +
                "<i>Thanks for your generous donation</i>"
        ).parseMode(ParseMode.HTML).exec();
    }
}
