import io.github.natanimn.BotClient;
import io.github.natanimn.BotContext;
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
        bot.onCallback(KeyboardBot::onKeyboard);

        // Run the bot
        bot.run();
    }

    /* Hello and Hey inline keyboard buttons */
    private static InlineKeyboardMarkup getKeyboard(){
        InlineKeyboardMarkup keyboard = new InlineKeyboardMarkup();
        keyboard.addKeyboard(
                new InlineKeyboardButton("Hello").callbackData("hello"),
                new InlineKeyboardButton("Hey").callbackData("hey")
        );
        keyboard.addKeyboard(new InlineKeyboardButton("Exit").callbackData("exit"));
        return keyboard;
    }

    /* Back inline keyboard button */
    private static InlineKeyboardMarkup back(){
        return new InlineKeyboardMarkup(new InlineKeyboardButton[]{
                new InlineKeyboardButton("Back").callbackData("back")
        });
    }

    /* Start command handler */
    static void start(BotContext context, Message message){
        context.sendMessage("Hello, I am inline keyboard button")
                .replyMarkup(getKeyboard())
                .exec();

    }

    /* Inline keyboard buttons handler */
    static void onKeyboard(BotContext context, CallbackQuery query) {
        context.answer().exec(); // Answer inline keyboard (removes loading)

        String data = query.data;

        if (data.equals("exit")) context.editMessageText("keyboard exited").exec();

        else if (data.equals("back")) {
            context.editMessageText("Hello, I am inline keyboard button")
                    .replyMarkup(getKeyboard())
                    .exec();
        } else {
            context.editMessageText(String.format("What's up you have pressed %s button", data))
                    .replyMarkup(back())
                    .exec();

        }
    }
}
