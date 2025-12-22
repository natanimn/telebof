package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.MenuButton;

/**
 * GetChatMenuButton class. Returns {@link MenuButton} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getChatMenuButton
 */
public class GetChatMenuButton extends AbstractBaseRequest<GetChatMenuButton, MenuButton> {
    /**
     * Required
     * @param api api
     */
    public GetChatMenuButton(Api api) {
        super(api, "getChatMenuButton", MenuButton.class);
    }

    /**
     * Optional
     * @param chatId Unique identifier for the target private chat. If not specified, default bot's menu button will be returned
     * @return {@link GetChatMenuButton}
     */
    public GetChatMenuButton chatId(long chatId) {
        return add("chat_id", chatId);
    }

}
