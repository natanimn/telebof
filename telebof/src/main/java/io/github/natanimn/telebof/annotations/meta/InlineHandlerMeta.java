package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.InlineHandler;
import io.github.natanimn.telebof.enums.ChatType;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;

public class InlineHandlerMeta {
    final MethodHandle method;
    final String regex; // precompiled regex
    final Predicate<Filter> chatTypeCheck;
    final String[] query;
    final CustomFilter customFilter;

    public InlineHandlerMeta(InlineHandler handler, MethodHandle method){
        this.method = method;
        this.query  = handler.query();
        this.regex = handler.regex();
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

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
    }

    public boolean matches(Filter filter) {
        if (query.length > 0 && !filter.inlineQuery(query)) return false;
        if (!regex.isEmpty() && !filter.regex(regex)) return false;
        if (!chatTypeCheck.test(filter)) return false;
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}
