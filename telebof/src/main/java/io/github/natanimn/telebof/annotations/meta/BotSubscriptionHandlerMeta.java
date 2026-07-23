package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.BotSubscriptionHandler;
import io.github.natanimn.telebof.enums.SubscriptionState;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.function.Predicate;

/**
 * BotSubscriptionHandlerMeta class
 * @author Natanim
 * @since 2.2
 */
public class BotSubscriptionHandlerMeta {
    final MethodHandle method;
    final String regex;
    final CustomFilter customFilter;
    final Predicate<Filter> stateTypeChecker;
    public BotSubscriptionHandlerMeta(BotSubscriptionHandler handler, MethodHandle method){
        this.method = method;
        this.regex = handler.regex();
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        this.stateTypeChecker = filter -> {
            if (handler.state().length == 0) return true;
            boolean match = false;
            for (var state : handler.state()) {
                match |= switch (state) {
                    case SubscriptionState.CANCELLED -> filter.subscriptionCancelled();
                    case SubscriptionState.ACTIVE -> filter.subscriptionActivate();
                    case SubscriptionState.FAILED -> filter.subscriptionFailed();
                };
            }
            return match;
        };
    }

    public boolean matches(Filter filter) {
        if (!regex.isEmpty() && !filter.regex(regex)) return false;
        if (!stateTypeChecker.test(filter)) return false;
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}
