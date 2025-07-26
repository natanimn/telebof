package io.github.natanimn.types.chat_and_user.bot;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class BotCommandScopeChatAdministrators extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChatAdministrators(Object chatId) {
        super("chat_administrators");
        this.chat_id = chatId;
    }
}
