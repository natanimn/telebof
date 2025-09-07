package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.PreCheckoutHandler;
import io.github.natanimn.telebof.annotations.ShippingHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PreCheckoutHandlerMeta {
    final MethodHandle method;
    final List<String> payload;
    final String regex;
    final CustomFilter customFilter;

    public PreCheckoutHandlerMeta(PreCheckoutHandler handler, MethodHandle method){
        this.method = method;
        this.payload = List.of(handler.payload());
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
        if (!payload.isEmpty() && !filter.customFilter(update -> payload.contains(update.pre_checkout_query.invoice_payload))) return false;
        if (!regex.isEmpty() && !filter.regex(regex)) return false;
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}
