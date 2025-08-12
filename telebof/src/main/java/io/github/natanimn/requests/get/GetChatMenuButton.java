package io.github.natanimn.requests.get;

import io.github.natanimn.BotContext;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.keyboard.MenuButton;

/**
 * GetChatMenuButton class. Returns {@link MenuButton} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link BotContext#getChatMenuButton}
 */
public class GetChatMenuButton extends AbstractBaseRequest<GetChatMenuButton, MenuButton> {
    /**
     * Required
     * @param requestSender request sender
     */
    public GetChatMenuButton(RequestSender requestSender) {
        super(requestSender, "getChatMenuButton", MenuButton.class);
    }

    /**
     * Optional
     * @param chat_id Unique identifier for the target private chat. If not specified, default bot's menu button will be returned
     * @return {@link GetChatMenuButton}
     */
    public GetChatMenuButton chatId(long chat_id) {
        return add("chat_id", chat_id);
    }

}
