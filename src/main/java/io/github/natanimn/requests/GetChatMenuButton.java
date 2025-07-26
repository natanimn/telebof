package io.github.natanimn.requests;

import io.github.natanimn.types.keyboard.MenuButton;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetChatMenuButton extends AbstractBaseRequest<GetChatMenuButton, MenuButton> {
    public GetChatMenuButton(RequestSender requestSender) {
        super(requestSender, "getChatMenuButton", MenuButton.class);
    }

    public GetChatMenuButton chatId(long chatId) {
        return add("chat_id", chatId);
    }

}
