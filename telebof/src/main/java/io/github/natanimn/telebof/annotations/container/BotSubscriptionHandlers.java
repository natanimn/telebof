package io.github.natanimn.telebof.annotations.container;

import io.github.natanimn.telebof.annotations.BotSubscriptionHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Natanim
 * @since 2.2
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface BotSubscriptionHandlers {
    BotSubscriptionHandler[] value();
}
