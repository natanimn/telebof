package io.github.natanimn.telebof.annotations.container;

import io.github.natanimn.telebof.annotations.EditedBusinessMessageHandler;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface EditedBusinessMessageHandlers {
    EditedBusinessMessageHandler[] value();
}
