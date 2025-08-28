package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.exceptions.TelegramApiException;
import io.github.natanimn.telebof.types.inline.InlineQueryResult;
import io.github.natanimn.telebof.types.inline.InlineQueryResultArticle;
import io.github.natanimn.telebof.types.input.InputTextMessageContent;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;

public class InlineBot {
    public static void main(String[] args){
        final var TOKEN = System.getenv("TOKEN");
        final var bot   = new BotClient(TOKEN);

        bot.onMessage(filter -> filter.commands("start"), (context, message) -> {
            var keyboard = new InlineKeyboardMarkup(new InlineKeyboardButton[]{
                    new InlineKeyboardButton("Inline").switchInlineQueryCurrentChat("")
            });
            context.sendMessage(message.chat.id, "Hi! I am inline bot. Press the bellow button and try inline")
                    .replyMarkup(keyboard)
                    .exec();
        });

        bot.onInline(filter -> filter.emptyQuery(), (context, query) -> {
            var result = new InlineQueryResultArticle(
                    "1",
                    "Write something",
                    new InputTextMessageContent("Write something")
            );
            context.answerInlineQuery(query.id, new InlineQueryResult[]{result}).exec();
        });

        bot.onInline(_ -> true, (context, query) -> {
            var result = new InlineQueryResultArticle(
                    "2",
                    query.query,
                    new InputTextMessageContent("<b>You said:</b> " + query.query).parseMode(ParseMode.HTML)
            ).description("Click here");
            context.answerInlineQuery(query.id, new InlineQueryResult[]{result}).exec();
        });

        bot.startPolling();
    }
}
