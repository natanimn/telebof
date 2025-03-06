package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.types.Update;
import io.github.natanimn.enums.Updates;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetUpdates extends AbstractBaseRequest<GetUpdates, List<Update>>{

    private static final Type responseType = TypeToken.getParameterized(List.class, Update.class).getType();

    public GetUpdates(RequestSender requestSender){
        super(requestSender, "getUpdates", responseType);
    }

    public GetUpdates limit(Integer limit){
        add("limit", limit);
        return this;
    }

    public GetUpdates offset(Integer offset){
        add("offset", offset);
        return this;
    }

    public GetUpdates allowedUpdates(Updates[] allowedUpdates){
        List<String> updates = new ArrayList<>();
        if (allowedUpdates != null) {
            List.of(allowedUpdates).forEach(update -> updates.add(update.name().toLowerCase()));
        }
        add("allowed_updates", updates);

        return this;
    }

    public GetUpdates timeout(Integer timeout){
        add("timeout", timeout);
        return this;
    }

}

