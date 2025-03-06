package io.github.natanimn.types;

import java.io.Serializable;


abstract /**
 * Natanim Negash
 *  3 March 2025
 */
public class BotCommandScope implements Serializable  {
    public String type;
    public BotCommandScope(String type) {
        this.type = type;
    }
}
