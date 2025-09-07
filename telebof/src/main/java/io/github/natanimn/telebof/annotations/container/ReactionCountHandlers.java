package io.github.natanimn.telebof.annotations.container;

import io.github.natanimn.telebof.annotations.ReactionCountHandler;

import java.lang.annotation.*;

/**
 * @author Natanim
 * @since 1.2.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface ReactionCountHandlers {
    ReactionCountHandler[] value();
}
