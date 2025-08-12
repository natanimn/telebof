package io.github.natanimn.types.media_and_service;


/**
 * This object represents an animated emoji that displays a random value.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class Dice {
    /**
     * Emoji on which the dice throw animation is based
     */
    public String emoji;

    /**
     * Value of the dice, 1-6 for “🎲”, “🎯” and “🎳” base emoji, 1-5 for “🏀” and “⚽” base emoji, 1-64 for “🎰” base emoji
     */
    public Integer value;
}
