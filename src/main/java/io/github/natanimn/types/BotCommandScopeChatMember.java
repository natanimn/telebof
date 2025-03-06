package io.github.natanimn.types;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BotCommandScopeChatMember extends BotCommandScope {
    public Object chat_id;
    public BotCommandScopeChatMember(Object chatId) {
        super("chat_member");
        this.chat_id = chatId;
    }
}
