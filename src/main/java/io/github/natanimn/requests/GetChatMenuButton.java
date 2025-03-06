package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.MenuButton;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetChatMenuButton extends AbstractBaseRequest<GetChatMenuButton, MenuButton> {
    public GetChatMenuButton(RequestSender requestSender) {
        super(requestSender, "getChatMenuButton", MenuButton.class);
    }

    public GetChatMenuButton chatId(long chatId) {
        return add("chat_id", chatId);
    }

}
