package io.github.natanimn.telebof.types.media_and_service;

import io.github.natanimn.telebof.types.chat_and_user.User;

/**
 * This object represents one row of the high scores table for a game.
 * @param position Position in high score table for the game
 * @param score Score
 * @param user User
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record GameHighScore(
        Integer position,
        Integer score,
        User user
) {}