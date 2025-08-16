package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object represents one row of the high scores table for a game.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class GameHighScore {
    /**
     * Position in high score table for the game
     */
    public Integer position;

    /**
     * Score
     */
    public Integer score;

    /**
     * User
     */
    public User user;
}
