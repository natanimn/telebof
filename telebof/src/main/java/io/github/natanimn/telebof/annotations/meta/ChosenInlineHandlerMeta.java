package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.ChosenInlineHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class ChosenInlineHandlerMeta {
    final MethodHandle method;
    final String[] resultId; // precompiled regex
    final String[] query;
    final CustomFilter customFilter;

    public ChosenInlineHandlerMeta(ChosenInlineHandler handler, MethodHandle method){
        this.method = method;
        this.query  = handler.query();
        this.resultId = handler.resultId();
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean matches(Filter filter) {
        if (query.length > 0 && !filter.inlineQuery(query)) return false;
        if (resultId.length > 0 && !filter.customFilter(
                update ->
                        Arrays.asList(resultId).contains(update.chosenInlineResult().resultId()))) return false;
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}
