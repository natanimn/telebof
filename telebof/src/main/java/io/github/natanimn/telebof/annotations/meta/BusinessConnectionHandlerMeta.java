package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.BusinessConnectionHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;

/**
 * BusinessConnectionHandlerMeta class
 * @author Natanim
 * @since 1.2.0
 * @version 1.3.0
 */
public class BusinessConnectionHandlerMeta {
    final MethodHandle method;
    final CustomFilter customFilter;

    public BusinessConnectionHandlerMeta(BusinessConnectionHandler handler, MethodHandle method){
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
