package io.github.natanimn.telebof.types.bot;

import java.io.Serializable;

/**
 * This object represents a bot command.
 *
 * @param command Text of the command; 1-32 characters. Can contain only lowercase English letters, digits and underscores.
 * @param description  Description of the command; 1-256 characters.
 *
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
public record BotCommand(
        String command,
        String description
) implements Serializable {}
