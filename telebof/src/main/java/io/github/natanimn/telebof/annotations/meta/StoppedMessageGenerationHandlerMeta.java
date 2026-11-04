package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.StoppedMessageGenerationHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;

/**
 * MessageGenerationStoppedHandlerMeta class.
 * @author Natanim
 * @since 2.3
 */
public class StoppedMessageGenerationHandlerMeta {
    final MethodHandle method;
    final CustomFilter customFilter;

    public StoppedMessageGenerationHandlerMeta(StoppedMessageGenerationHandler handler, MethodHandle method){
        this.method = method;
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean matches(Filter filter) {
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}
