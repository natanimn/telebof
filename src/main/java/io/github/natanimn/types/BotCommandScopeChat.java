package io.github.natanimn.types;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BotCommandScopeChat extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChat(Object chatId) {
        super("chat");
        this.chat_id = chatId;
    }
}
