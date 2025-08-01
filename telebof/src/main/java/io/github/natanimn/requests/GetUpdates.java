package io.github.natanimn.requests;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.types.updates.Update;
import io.github.natanimn.enums.Updates;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

/**
 * Natanim Negash
 *  3 March 2025
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
        List<Updates> updates = new ArrayList<>();
        if (allowedUpdates != null) {
            updates = List.of(allowedUpdates);
        }
        add("allowed_updates", updates);

        return this;
    }

    public GetUpdates timeout(Integer timeout){
        add("timeout", timeout);
        return this;
    }

}

