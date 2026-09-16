package io.github.natanimn.telebof.types.bot;

import lombok.Getter;

import java.io.Serializable;

/**
 * This object represents the scope to which bot commands are applied.
 * @author Natanim
 * @since 0.1
 */
@Getter
abstract public class BotCommandScope implements Serializable  {
    /**
     *  Scope type
     *
     * @return Scope type
     */
    private final String type;

    /**
     * Initialize command scope
     * @param type Scope type
     */
    public BotCommandScope(String type) {
        this.type = type;
    }

}
