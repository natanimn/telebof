package io.github.natanimn.telebof.types.bot;

/**
 * @author Natanim
 * @since 3 March 2025
 */
public class BotCommandScopeChat extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChat(Object chatId) {
        super("chat");
        this.chat_id = chatId;
    }
}
