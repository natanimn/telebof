package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;
import lombok.Getter;

/**
 * This object represents one row of the high scores table for a game.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class GameHighScore {
    /**
     * Position in high score table for the game
     */
    private Integer position;

    /**
     * Score
     */
    private Integer score;

    /**
     * User
     */
    private User user;

}