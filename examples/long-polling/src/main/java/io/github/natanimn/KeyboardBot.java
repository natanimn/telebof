package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.types.keyboard.ReplyKeyboardMarkup;
import io.github.natanimn.telebof.enums.ParseMode;

public class KeyboardBot {
    public static void main(String[] args) {
        final String TOKEN = "BOT_TOKEN"; // Replace with your actual bot token
        var bot = new BotClient(TOKEN);

        // Handle /start command with keyboard
        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            var keyboard = new ReplyKeyboardMarkup().resizeKeyboard(true);
            keyboard.add("ID", "Username", "Language");

            context.sendMessage(message.chat.id, "Welcome! Please choose an option:")
                    .replyMarkup(keyboard)
                    .exec();
        });

        // Handle keyboard button presses
        bot.onMessage(filter -> filter.texts("ID", "Username", "Language"), (context, message) -> {
            var user = message.from;
            String response;

            switch (message.text) {
                case "ID":
                    response = String.format("<b>Your ID is:</b> <code>%d</code>", user.id);
                    break;
                case "Username":
                    if (user.username == null) {
                        response = "<i>You don't have a username set.</i>";
                    } else {
                        response = String.format("<b>Your username is:</b> @%s", user.username);
                    }
                    break;
                case "Language":
                    String language = (user.language_code != null) ? user.language_code : "not specified";
                    response = String.format("<b>Your language code is:</b> %s", language);
                    break;
                default:
                    response = "Unknown option.";
            }

            context.sendMessage(message.chat.id, response)
                    .parseMode(ParseMode.HTML)
                    .exec();
        });

        // Start the bot
        bot.startPolling();
    }
}