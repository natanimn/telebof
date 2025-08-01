package io.github.natanimn.types.bot;

/**
 * Represents the default scope of bot commands.
 * Default commands are used if no commands with a <a href="https://core.telegram.org/bots/api#determining-list-of-commands">narrower</a> scope are specified for the user.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class BotCommandScopeDefault extends BotCommandScope {
    public BotCommandScopeDefault() {
        super("default");
    }
}
