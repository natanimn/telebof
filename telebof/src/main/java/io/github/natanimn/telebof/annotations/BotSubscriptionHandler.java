package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.annotations.container.BotSubscriptionHandlers;
import io.github.natanimn.telebof.enums.SubscriptionState;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Annotation for handling incoming bot subscription update in a declarative manner.
 * @author Natanim
 * @since 2.2
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Repeatable(BotSubscriptionHandlers.class)
public @interface BotSubscriptionHandler {

    /**
     * Subscription state
     * @return {@link SubscriptionState[]}
     */
    SubscriptionState[] state() default {};

    /**
     * Regular expression for invoice payload
     * @return {@link String}
     */
    String regex() default "";

    /**
     * User defined filter
     * @return {@link CustomFilter}
     */
    Class<? extends CustomFilter> filter() default DefaultCustomFilter.class;

    /**
     * Priority
     * @return {@link int}
     */
    int priority() default 0;
}
