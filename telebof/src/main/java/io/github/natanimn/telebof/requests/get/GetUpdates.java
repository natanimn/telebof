package io.github.natanimn.telebof.requests.get;

import com.google.gson.reflect.TypeToken;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.updates.Update;
import io.github.natanimn.telebof.enums.Updates;

import java.lang.reflect.Type;
import java.util.List;

/**
 * GetUpdates class. Returns list of {@link Update}
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getUpdates()
 */
public class GetUpdates extends AbstractBaseRequest<GetUpdates, List<Update>> {

    private static final Type responseType = TypeToken.getParameterized(List.class, Update.class).getType();

    /**
     * Required
     * @param api api
     */
    public GetUpdates(Api api){
        super(api, "getUpdates", responseType);
    }

    /**
     * Optional
     * @param limit Limits the number of updates to be retrieved. Values between 1-100 are accepted. Defaults to 100.
     * @return {@link GetUpdates}
     */
    public GetUpdates limit(Integer limit){
        return add("limit", limit);
    }

    /**
     * Optional
     * @param offset Identifier of the first update to be returned.
     *               Must be greater by one than the highest among the identifiers of previously received updates.
     *               By default, updates starting with the earliest unconfirmed update are returned.
     *               An update is considered confirmed as soon as getUpdates is called with an offset higher than its update_id.
     *               The negative offset can be specified to retrieve updates starting from -offset update from the end of the updates queue.
     *               All previous updates will be forgotten.
     * @return {@link GetUpdates}
     */
    public GetUpdates offset(Integer offset){
        return add("offset", offset);
    }

    /**
     * Optional
     * @param allowedUpdates A JSON-serialized list of the update types you want your bot to receive.
     *                        Specify an empty list to receive all update types except chat_member, message_reaction, and message_reaction_count (default).
     *                        If not specified, the previous setting will be used.
     * @return {@link GetUpdates}
     */
    public GetUpdates allowedUpdates(Updates[] allowedUpdates){
        return add("allowed_updates", allowedUpdates);
    }

    /**
     * Optional
     * @param timeout Timeout in seconds for long polling. Defaults to 0, i.e. usual short polling.
     *                Should be positive, short polling should be used for testing purposes only.
     * @return {@link GetUpdates}
     */
    public GetUpdates timeout(Integer timeout){
        return add("timeout", timeout);
    }

}

