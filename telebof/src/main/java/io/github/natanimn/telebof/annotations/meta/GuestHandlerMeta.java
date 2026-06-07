package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.GuestHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;

/**
 * Metadata to store handler info and precomputed checks
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class GuestHandlerMeta {
    final MethodHandle method;
    final String regex;
    final String[] commands;
    final String[] texts;
    final CustomFilter customFilter;

    public GuestHandlerMeta(GuestHandler handler, MethodHandle method){
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
    }

    public boolean matches(Filter filter) {
        if (commands.length > 0 && !filter.commands(commands)) return false;
        if (texts.length > 0 && !filter.texts(texts)) return false;
        if (!regex.isEmpty() && !filter.regex(regex)) return false;
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}

