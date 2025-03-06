package io.github.natanimn.types;

import java.io.Serializable;


abstract /**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class BotCommandScope implements Serializable  {
    public String type;
    public BotCommandScope(String type) {
        this.type = type;
    }
}
