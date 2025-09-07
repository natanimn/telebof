package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.EditedMessageHandler;
import io.github.natanimn.telebof.annotations.type.TypeChecker;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.enums.MessageType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;

/**
 * Metadata to store handler info and precomputed checks
 * @author Natanim
 * @since 4 September 2025
 * @version 1.2.0
 */
public class EditedMessageHandlerMeta {
    final MethodHandle method;
    final String regex; // precompiled regex
    final Predicate<Filter> chatTypeCheck;
    final Predicate<Filter> messageTypeCheck;
    final String[] commands;
    final String[] texts;
    final CustomFilter customFilter;
    final String state;

    public EditedMessageHandlerMeta(EditedMessageHandler handler, MethodHandle method){
        this.method = method;
        this.commands = handler.commands();
        this.texts = handler.texts();
        this.regex = handler.regex();
        try {
            this.customFilter = handler.filter().getDeclaredConstructor().newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        this.state = handler.state();

        this.chatTypeCheck = filter -> {
            if (handler.chatType().length == 0) return true;
            boolean match = false;
            for (ChatType ct : handler.chatType()) {
                match |= switch (ct) {
                    case PRIVATE -> filter.Private();
                    case GROUP -> filter.group();
                    case SUPERGROUP -> filter.supergroup();
                    case CHANNEL -> filter.channel();
                };
            }
            return match;
        };

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
        if (!chatTypeCheck.test(filter)) return false;
        if (!(customFilter instanceof DefaultCustomFilter) && !(filter.customFilter(customFilter))) return false;
        if (!state.isEmpty() && !filter.state(state)) return false;
        return messageTypeCheck.test(filter);
    }
}

