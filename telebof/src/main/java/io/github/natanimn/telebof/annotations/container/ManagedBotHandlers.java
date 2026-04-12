package io.github.natanimn.telebof.annotations.container;

import io.github.natanimn.telebof.annotations.ManagedBotHandler;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ManagedBotHandlers {
    ManagedBotHandler[] value();
}
