package io.github.natanimn.types.bot;

/**
 * Represents the scope of bot commands, covering a specific member of a group or supergroup chat.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class BotCommandScopeChatMember extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChatMember(Object chatId) {
        super("chat_member");
        this.chat_id = chatId;
    }
}
