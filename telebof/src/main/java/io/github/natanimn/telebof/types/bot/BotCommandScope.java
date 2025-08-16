package io.github.natanimn.telebof.types.bot;

import java.io.Serializable;

/**
 * This object represents the scope to which bot commands are applied.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.8
 */
abstract public class BotCommandScope implements Serializable  {
    /**
     * Scope type
     */
    public String type;

    /**
     * Initialize command scope
     * @param type Scope type
     */
    public BotCommandScope(String type) {
        this.type = type;
    }
}
