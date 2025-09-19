package io.github.natanimn.telebof.types.bot;

import com.google.gson.annotations.SerializedName;

/**
 * @author Natanim
 * @since 3 March 2025
 */
public class BotCommandScopeChat extends BotCommandScope {
    @SerializedName("chat_id")
    private Object chatId;
    public BotCommandScopeChat(Object chatId) {
        super("chat");
        this.chatId = chatId;
    }

    public Object getChatId() {
        return chatId;
    }
}
