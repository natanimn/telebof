package io.github.natanimn.telebof;

import io.github.natanimn.telebof.enums.Updates;
import io.github.natanimn.telebof.filters.FilterExecutor;
import io.github.natanimn.telebof.types.updates.TelegramUpdate;
import java.util.LinkedHashMap;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * A dispatcher class for updates
 * @author Natanim
 * @param <T>
 */
public class Dispatcher<T extends TelegramUpdate> {
    private final Map<Updates, List<LinkedHashMap<FilterExecutor, UpdateHandler<T>>>> handlers;

    public Dispatcher(){
        handlers = new HashMap<>();
    }

    public boolean add(Updates obj, LinkedHashMap<FilterExecutor, UpdateHandler<T>> handler){
        if (handlers.containsKey(obj)){
            if (handlers.get(obj).contains(handler)) return false;
            else handlers.get(obj).add(handler);
        } else {
            handlers.put(obj, new ArrayList<>(List.of(handler)));
        }
        return true;
    }

    public List<LinkedHashMap<FilterExecutor, UpdateHandler<T>>> get(Updates updates){
        return handlers.get(updates);
    }

}
