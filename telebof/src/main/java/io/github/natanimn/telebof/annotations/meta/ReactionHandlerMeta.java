package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.ReactionHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;

/**
 * ReactionHandlerMeta class.
 * @author Natanim
 * @since 1.2.0
 * @version 1.3.0
 */
public class ReactionHandlerMeta {
    final MethodHandle method;
    final String reaction;
    final CustomFilter customFilter;

    public ReactionHandlerMeta(ReactionHandler handler, MethodHandle method){
        this.method = method;
        this.reaction = handler.reaction();
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean matches(Filter filter) {
        if (!(customFilter instanceof DefaultCustomFilter) && !(filter.customFilter(customFilter))) return false;
        return reaction.isEmpty() || filter.reaction(reaction);
    }
}
