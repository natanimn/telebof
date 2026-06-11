package io.github.natanimn.telebof.spring;

import java.lang.annotation.Target;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

import org.springframework.stereotype.Component;

/**
 * Bot annotation
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@Component
public @interface Bot {

    /**
     * Order of class registration. The lower the order, the first the class to be registered before those with higher values.
     * @return {@link Integer}
     */
    int value() default 0;
}
