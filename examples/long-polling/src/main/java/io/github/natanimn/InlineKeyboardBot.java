package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;

public class InlineKeyboardBot {
    public static void main(String[] args){
        final var TOKEN = System.getenv("TOKEN");
        final var bot   = new BotClient(TOKEN);

        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            var keyboard = new InlineKeyboardMarkup();
            keyboard.addKeyboard(new InlineKeyboardButton("\uD83D\uDFE9 Green", "color-green"));
            keyboard.addKeyboard(new InlineKeyboardButton("\uD83D\uDFE8 Yellow", "color-yellow"));
            keyboard.addKeyboard(new InlineKeyboardButton("\uD83D\uDFE5 Red", "color-red"));

            context.sendMessage(message.chat.id, "Press one of the following inline buttons: ")
                    .replyMarkup(keyboard)
                    .exec();
        });

        bot.onCallback(filter -> filter.regex("color-"), (context, callback) -> {
            context.answerCallbackQuery(callback.id).exec();

            var color = callback.data.split("-")[1];

            String response = switch (color) {
                case "green" -> "You have pressed <b>Green</b> button!";
                case "yellow" -> "You have pressed <b>Yellow</b> button!";
                case "red" -> "You have pressed <b>Red</b> button";
                default -> "You have pressed <b>Unknown</b> button";
            };

            context.editMessageText(response, callback.message.chat.id, callback.message.message_id)
                    .parseMode(ParseMode.HTML)
                    .replyMarkup(callback.message.reply_markup)
                    .exec();

        });

        bot.startPolling();
    }
}
