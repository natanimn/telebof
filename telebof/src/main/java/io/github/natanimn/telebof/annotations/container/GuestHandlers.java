package io.github.natanimn.telebof.annotations.container;

import io.github.natanimn.telebof.annotations.GuestHandler;
import java.lang.annotation.Target;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface GuestHandlers {
    GuestHandler[] value();
}
