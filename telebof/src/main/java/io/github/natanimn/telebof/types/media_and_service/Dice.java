package io.github.natanimn.telebof.types.media_and_service;

import lombok.Getter;

/**
 * This object represents an animated emoji that displays a random value.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class Dice{
    /**
     * Emoji on which the dice throw animation is based
     */
    private String emoji;

    /**
     * Value of the dice, 1-6 for “🎲”, “🎯” and “🎳” base emoji, 1-5 for “🏀” and “⚽” base emoji, 1-64 for “🎰” base emoji
     */
    private Integer value;

}