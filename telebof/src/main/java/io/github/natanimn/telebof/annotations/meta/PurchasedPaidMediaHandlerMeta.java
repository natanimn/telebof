package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.PurchasedPaidMediaHandler;
import io.github.natanimn.telebof.annotations.ShippingHandler;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class PurchasedPaidMediaHandlerMeta {
    final MethodHandle method;
    final List<String> payload;
    final CustomFilter customFilter;

    public PurchasedPaidMediaHandlerMeta(PurchasedPaidMediaHandler handler, MethodHandle method){
        this.method = method;
        this.payload = List.of(handler.payload());
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
        return payload.isEmpty() || filter.customFilter(update -> payload.contains(update.purchasedPaidMedia().paidMediaPayload()));
    }
}
