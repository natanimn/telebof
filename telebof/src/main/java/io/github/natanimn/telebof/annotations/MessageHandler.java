package io.github.natanimn.telebof.annotations;

import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.enums.MessageType;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.METHOD})
//@Repeatable(MessageHandler.class)
public @interface MessageHandler {
    String[] commands() default {};
    String[] texts() default {};
    ChatType[] chatType() default {};
    String regex() default  "";
    MessageType[] type() default {};

}
