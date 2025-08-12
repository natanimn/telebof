/***
 * This file is part of telebof.
 * It is example of echo bot.
 * Before going through, you must obtain your bot token from @BotFather first.
 */
package io.github.natanimn;


public class EchoBot {
    static final String TOKEN = System.getenv("TOKEN");

    public static void main(String[] args){
        // Create bot instance
        var bot = new BotClient(TOKEN);

        //Register /start command handler
        bot.onMessage(filter -> filter.commands("start"), (ctx, message) -> {
            ctx.sendMessage(message.chat.id, "Welcome!\nI am echo bot").exec();
        });

        //Register incoming text handler
        bot.onMessage(filter -> filter.text(), (ctx, message) -> {
            //Echo as a reply
            ctx.sendMessage(message.chat.id, message.text).exec();

        });

        // Run the bot
        bot.startPolling();

    }
}

