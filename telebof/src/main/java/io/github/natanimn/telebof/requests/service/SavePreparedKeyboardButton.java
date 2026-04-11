package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.keyboard.KeyboardButton;
import io.github.natanimn.telebof.types.media_and_service.PreparedKeyboardButton;

/**
 * SavePreparedKeyboardButton class. Returns a {@link PreparedKeyboardButton} object.
 * @author Natanim
 * @since 1.6.0
 * @version 1.6.0
 */
public class SavePreparedKeyboardButton extends AbstractBaseRequest<SavePreparedKeyboardButton, PreparedKeyboardButton> {
    public SavePreparedKeyboardButton(long userId, KeyboardButton button, Api api){
        super(api, "savePreparedKeyboardButton", PreparedKeyboardButton.class);
        add("user_id", userId);
        add("button", button);
    }
}
