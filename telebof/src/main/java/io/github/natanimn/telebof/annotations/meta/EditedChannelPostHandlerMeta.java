package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.EditedChannelPostHandler;
import io.github.natanimn.telebof.annotations.type.TypeChecker;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;

/**
 * EditedChannelPostHandlerMeta class.
 * @author Natanim
 * @since 1.2.0
 * @version 1.3.0
 */
public class EditedChannelPostHandlerMeta {
    final MethodHandle method;
    final String regex;
    final Predicate<Filter> messageTypeCheck;
    final String[] commands;
    final String[] texts;
    final CustomFilter customFilter;

    public EditedChannelPostHandlerMeta(EditedChannelPostHandler handler, MethodHandle method){
        this.method = method;
        this.commands = handler.commands();
        this.texts = handler.texts();
        this.regex = handler.regex();
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        this.messageTypeCheck = filter -> {
            if (handler.type().length == 0) return true;
            boolean match = false;
            for (MessageType t : handler.type()) {
                Predicate<Filter> checker = TypeChecker.field.get(t);
                if (checker != null) match |= checker.test(filter);
            }
            return match;
        };
    }

    public boolean matches(Filter filter) {
        if (commands.length > 0 && !filter.commands(commands)) return false;
        if (texts.length > 0 && !filter.texts(texts)) return false;
        if (!regex.isEmpty() && !filter.regex(regex)) return false;
        if (!(customFilter instanceof DefaultCustomFilter) && !(filter.customFilter(customFilter))) return false;
        return messageTypeCheck.test(filter);
    }

}
