package io.github.natanimn.telebof;

import io.github.natanimn.telebof.enums.Updates;
import io.github.natanimn.telebof.filters.FilterExecutor;
import io.github.natanimn.telebof.types.updates.TelegramUpdate;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.ArrayList;
import java.util.List;

/**
 * A dispatcher class for updates
 * @author Natanim
 * @param <T>
 */
public class Dispatcher<T extends TelegramUpdate> {
    private final ConcurrentMap<Updates, List<ConcurrentHashMap<FilterExecutor, UpdateHandler<T>>>> handlers;

    public Dispatcher(){
        handlers = new ConcurrentHashMap<>();
    }

    public boolean add(Updates obj, ConcurrentHashMap<FilterExecutor, UpdateHandler<T>> handler){
        if (handlers.containsKey(obj)){
            if (handlers.get(obj).contains(handler)) return false;
            else handlers.get(obj).add(handler);
        } else {
            handlers.put(obj, new ArrayList<>(List.of(handler)));
        }
        return true;
    }

    public List<ConcurrentHashMap<FilterExecutor, UpdateHandler<T>>> get(Updates updates){
        return handlers.get(updates);
    }

}
