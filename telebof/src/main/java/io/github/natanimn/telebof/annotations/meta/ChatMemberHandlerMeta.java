package io.github.natanimn.telebof.annotations.meta;

import io.github.natanimn.telebof.annotations.ChatMemberHandler;
import io.github.natanimn.telebof.enums.ChatMemberStatus;
import io.github.natanimn.telebof.filters.CustomFilter;
import io.github.natanimn.telebof.filters.DefaultCustomFilter;
import io.github.natanimn.telebof.filters.Filter;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public class ChatMemberHandlerMeta {
    final MethodHandle method;
    final CustomFilter customFilter;
    final List<ChatMemberStatus> status;

    public ChatMemberHandlerMeta(ChatMemberHandler handler, MethodHandle method){
        this.method = method;
        this.status = List.of(handler.status());
        try {
            var ctor = handler.filter().getDeclaredConstructor();
            ctor.setAccessible(true);
            this.customFilter = ctor.newInstance();
        } catch (InvocationTargetException | NoSuchMethodException | InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean matches(Filter filter) {
        if (!status.isEmpty() && !filter.customFilter(update -> status.contains(update.chat_member.new_chat_member.status))) return false;
        return customFilter instanceof DefaultCustomFilter || filter.customFilter(customFilter);
    }
}
