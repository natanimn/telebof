package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object represents one row of the high scores table for a game.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
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


    public Integer getPosition() {
        return position;
    }

    public Integer getScore() {
        return score;
    }

    public User getUser() {
        return user;
    }
}