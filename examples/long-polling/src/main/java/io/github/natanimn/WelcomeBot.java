package io.github.natanimn;

import io.github.natanimn.telebof.BotClient;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardButton;
import io.github.natanimn.telebof.types.keyboard.InlineKeyboardMarkup;
import io.github.natanimn.telebof.types.updates.ChatMemberUpdated;
import io.github.natanimn.telebof.types.updates.Message;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.types.updates.Update;
import java.util.Objects;

class BotIsAdmin implements CustomFilter{
    BotClient client;

    public BotIsAdmin(BotClient client){
        this.client = client;
    }

    @Override
    public boolean check(Update update) {
        var bot_id = client.me().id;
        try{
            var member = client.context.getChatMember(update.message.chat.id, bot_id).exec();
            return member.status == ChatMemberStatus.ADMINISTRATOR && member.can_delete_messages != null;
        } catch (Exception e) {
            return false;
        }
    }
}


public class WelcomeBot {

    final BotClient bot;
    public WelcomeBot(String token){
        this.bot       = new BotClient(token);
        var botIsAdmin = new BotIsAdmin(bot);

        bot.onMessage(filter -> filter.commands("start") && filter.Private(), this::startPrivate);
        bot.onMessage(filter -> filter.newChatMember() && filter.customFilter(botIsAdmin), this::sendWelcomeMessage);
        bot.onMessage(filter -> filter.leftChatMember() && filter.customFilter(botIsAdmin), this::deleteLeftMessage);
        bot.onMyChatMember(_ -> true, this::botPromoted);

    }

    private void startPrivate(BotContext context, Message message){
        var keyboard     = new InlineKeyboardMarkup();
        var bot_username = bot.me().username;
        var url          = String.format("https://t.me/%s?startgroup&admin=delete_messages", bot_username);

        keyboard.addKeyboard(new InlineKeyboardButton("Add me to your group").url(url));
        var text = """
                <b>\uD83D\uDC4B Hi, I am Welcome bot</b>
                
                Add me to your group, and I will send welcome message to new members
                """;

        context.sendMessage(message.chat.id, text)
                .parseMode(ParseMode.HTML)
                .replyMarkup(keyboard)
                .exec();
    }

    private void botPromoted(BotContext context, ChatMemberUpdated member){
        ChatMemberStatus newStatus = member.new_chat_member.status;

         if (newStatus == ChatMemberStatus.LEFT || newStatus == ChatMemberStatus.BANNED) return;

        boolean isAdminWithDeletePerms = (newStatus == ChatMemberStatus.ADMINISTRATOR
                && member.new_chat_member.can_delete_messages == true);

        if (!isAdminWithDeletePerms) {
            try {
                context.sendMessage(
                                member.chat.id,
                                "<b>Sorry, I cannot stay in this group without having <i>Delete message</i> permission.</b>")
                        .parseMode(ParseMode.HTML)
                        .exec();
            } catch (Exception e) {
            } finally {
                context.leaveChat(member.chat.id).exec();
            }
        } else {
            context.sendMessage(member.chat.id, "Thank you for promoting me in this group!").exec();
        }
    }

    private void sendWelcomeMessage(BotContext context, Message message){
        var chat_id = message.chat.id;
        var bot_id  = bot.me().id;

        context.deleteMessage(chat_id, message.message_id).exec();

        for (var member: message.new_chat_members){
            if (Objects.equals(bot_id, member.id)) continue;
            else if (member.is_bot) context.banChatMember(chat_id, member.id).exec();
            else context.sendMessage(
                    message.chat.id,
                    String.format("\uD83C\uDF3C <b>Hey %s!</b>\n\n<b>Welcome to this group.</b>", member.mention()))
                    .parseMode(ParseMode.HTML)
                    .exec();
        }
    }

    private void deleteLeftMessage(BotContext context, Message message){
        context.deleteMessage(message.chat.id, message.message_id).exec();
    }

    public void runBot(){
        bot.startPolling();
    }

    public static void main(String[] args){
        final var TOKEN = "BOT_TOKEN";
        final var welcomeBot = new WelcomeBot(TOKEN);
        welcomeBot.runBot();
    }
}
