package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.enums.ChatType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
public @interface CallbackHandler {
    String[] data() default {};
    ChatType[] chatType() default {};
    String regex() default  "";
}
