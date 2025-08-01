import io.github.natanimn.BotClient;
import io.github.natanimn.types.inline.InlineQueryResult;
import io.github.natanimn.types.inline.InlineQueryResultArticle;
import io.github.natanimn.types.input.InputTextMessageContent;
import io.github.natanimn.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.types.keyboard.InlineKeyboardMarkup;

public class InlineBot {
    static final String TOKEN = System.getenv("TOKEN");
    public static void main(String[] args){
        var bot = new BotClient(TOKEN);

        bot.onMessage(filter -> filter.commands("start"), (ctx, message) -> {
            ctx.reply("Hey, I am inline bot")
                    .replyMarkup(
                            new InlineKeyboardMarkup(
                                new InlineKeyboardButton[]{
                                    new InlineKeyboardButton("Inline echo").switchInlineQueryCurrentChat("")
                            }
                        )
                    )
                    .exec();
        });

        bot.onInline(filter -> filter.emptyQuery(), ((context, inline_query) -> {
            System.out.println(inline_query);
            context.answerInline(
                    new InlineQueryResult[]{
                        new InlineQueryResultArticle("1")
                            .title("Write something")
                            .description("Write something")
                            .inputMessageContent(new InputTextMessageContent("Write something"))
                    }
            ).exec();
        }));

        bot.onInline((context, inline_query) -> {
            context.answerInline(new InlineQueryResult[]{
                    new InlineQueryResultArticle("2")
                            .title(inline_query.query)
                            .description(inline_query.query)
                            .inputMessageContent(new InputTextMessageContent(inline_query.query))

            }).exec();
        });

        bot.run();
    }
}
