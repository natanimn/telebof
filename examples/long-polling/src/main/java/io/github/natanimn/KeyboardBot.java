package io.github.natanimn;


import io.github.natanimn.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.types.updates.CallbackQuery;
import io.github.natanimn.types.updates.Message;

/**
 * This an Inline keyboard example bot of telebof library
 */
public class KeyboardBot {
    static String TOKEN = System.getenv("TOKEN");

    public static void main(String[] args){
        BotClient bot = new BotClient(TOKEN);

        // Register /start handler
        bot.onMessage(filter -> filter.commands("start"), KeyboardBot::start);

        // Register pressed inline keyboard handler
        bot.onCallback(filter -> true, KeyboardBot::onKeyboard);

        // Run the bot
        bot.startPolling();
    }

    /* Hello and Hey inline keyboard buttons */
    private static InlineKeyboardMarkup getKeyboard(){
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.addKeyboard(
                new InlineKeyboardButton("Hello", "hello"),
                new InlineKeyboardButton("Hey", "hey")
        );
        keyboard.addKeyboard(new InlineKeyboardButton("Exit", "exit"));
        return keyboard;
    }

    /* Back inline keyboard button */
    private static InlineKeyboardMarkup back(){
        return new InlineKeyboardMarkup(new InlineKeyboardButton[]{
                new InlineKeyboardButton("Back", "back")
        });
    }

    /* Start command handler */
    static void start(BotContext context, Message message){
        context.sendMessage(message.chat.id, "Hello, I am inline keyboard button")
                .replyMarkup(getKeyboard())
                .exec();

    }

    /* Inline keyboard buttons handler */
    static void onKeyboard(BotContext context, CallbackQuery query) {
        context.answerCallbackQuery(query.id).exec(); // Answer inline keyboard (removes loading)

        String data = query.data;

        if (data.equals("exit")) context.editMessageText("keyboard exited", query.from.id, query.message.message_id).exec();

        else if (data.equals("back")) {
            context.editMessageText("Hello, I am inline keyboard button", query.from.id, query.message.message_id)
                    .replyMarkup(getKeyboard())
                    .exec();
        } else {
            context.editMessageText(String.format("What's up you have pressed %s button", data), query.from.id, query.message.message_id)
                    .replyMarkup(back())
                    .exec();

        }
    }
}
