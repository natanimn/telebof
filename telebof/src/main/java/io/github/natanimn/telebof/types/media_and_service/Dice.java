package io.github.natanimn.telebof.types.media_and_service;

/**
 * This object represents an animated emoji that displays a random value.
 * @param emoji Emoji on which the dice throw animation is based
 * @param value Value of the dice, 1-6 for “🎲”, “🎯” and “🎳” base emoji, 1-5 for “🏀” and “⚽” base emoji, 1-64 for “🎰” base emoji
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record Dice(
        String emoji,
        Integer value
) {}