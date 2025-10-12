package io.github.natanimn.telebof.types.media_and_service;

/**
 * This class represents an inline keyboard button that copies specified text to the clipboard.
 * @param text The text to be copied to the clipboard; 1-256 characters
 * @author Natanim
 * @since Jul 22, 2025
 * @version 1.3.0
 */
public record CopyTextButton(
        String text
) {}