/***
 * This file is part of telebof.
 * It is example of an echo bot.
 * Before going through, you must obtain your bot token from @BotFather first.
 */

import io.github.natanimn.BotClient;
import io.github.natanimn.filters.Filter;

public class EchoBot {
    static final String TOKEN = System.getenv("TELEGRAM_BOT_TOKEN");
    public static void main(String[] args){
        // Create bot instance
        var bot = new BotClient(TOKEN);

        //Register /start command handler
        bot.onMessage(filter -> filter.commands("start"), (ctx, message) -> {
            ctx.sendMessage("Welcome!\nI am echo bot").exec();
        });

        //Register incoming text handler
        bot.onMessage(Filter::text, (ctx, message) -> {
            //Echo as a reply
            ctx.reply(message.text).exec();
            ;
        });

        // Run the bot
        bot.run();

    }
}

