package io.github.natanimn.types.bot;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class BotCommandScopeChatMember extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChatMember(Object chatId) {
        super("chat_member");
        this.chat_id = chatId;
    }
}
