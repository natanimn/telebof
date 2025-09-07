package io.github.natanimn.telebof.annotations.container;

import io.github.natanimn.telebof.annotations.ShippingHandler;

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
public @interface ShippingHandlers {
    ShippingHandler[] value();
}
