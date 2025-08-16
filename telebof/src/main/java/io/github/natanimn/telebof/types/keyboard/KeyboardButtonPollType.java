package io.github.natanimn.telebof.types.keyboard;

import io.github.natanimn.telebof.enums.PollType;
import java.io.Serializable;

/**
 * This object represents type of a poll, which is allowed to be created and sent when the corresponding button is pressed.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.9
 */
public class KeyboardButtonPollType implements Serializable {

    private PollType type;

    public KeyboardButtonPollType(){}

    /**
     * Optional
     * @param type If quiz is passed, the user will be allowed to create only polls in the quiz mode.
     *             If regular is passed, only regular polls will be allowed.
     *             Otherwise, the user will be allowed to create a poll of any type.
     */
    public KeyboardButtonPollType(PollType type) {
        this.type = type;
    }
}
