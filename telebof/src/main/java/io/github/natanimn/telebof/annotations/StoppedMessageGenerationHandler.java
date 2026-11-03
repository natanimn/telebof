package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.annotations.container.StoppedMessageGenerationHandlers;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.types.updates.MessageGenerationStopped;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Handler annotation for {@link MessageGenerationStopped} update.
 * @author Natanim
 * @since 2.3
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(StoppedMessageGenerationHandlers.class)
public @interface StoppedMessageGenerationHandler {

    /**
     * Custom filter class for advanced filtering.
     *
     * @return class implementing {@link CustomFilter} interface
     * @implNote Defaults to {@link DefaultCustomFilter} which applies no additional filtering
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority order for handler registration and execution.
     * Handlers with lower priority numbers are registered and executed before
     * those with higher numbers.
     *
     * @return priority integer value (lower = earlier execution)
     * @implNote Default priority is 0. Negative values are allowed.
     */
    int priority() default 0;
}
