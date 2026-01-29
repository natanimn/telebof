package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.gift_and_giveaway.OwnedGifts;

public class GetChatGifts extends AbstractBaseRequest<GetChatGifts, OwnedGifts> {
    public GetChatGifts(Object chatId, Api api){
        super(chatId, api, "getChatGifts", OwnedGifts.class);
    }

    /**
     * Optional
     * @param excludeUnsaved Pass True to exclude gifts that aren't saved to the chat's profile page. Always True, unless the bot has the can_post_messages administrator right in the channel.
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeUnsaved(Boolean excludeUnsaved){
        return add("exclude_unsaved", excludeUnsaved);
    }

    /**
     * Optional
     * @param excludeSaved Pass True to exclude gifts that are saved to the chat's profile page. Always False, unless the bot has the can_post_messages administrator right in the channel.
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeSaved(Boolean excludeSaved){
        return add("exclude_saved", excludeSaved);
    }

    /**
     * Optional
     * @param excludeUnlimited Pass True to exclude gifts that can be purchased an unlimited number of times
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeUnlimited(Boolean excludeUnlimited){
        return add("exclude_unlimited", excludeUnlimited);
    }

    /**
     * Optional
     * @param excludeLimitedUpgradable Pass True to exclude gifts that can be purchased a limited number of times and can be upgraded to unique
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeLimitedUpgradable(Boolean excludeLimitedUpgradable){
        return add("exclude_limited_upgradable", excludeLimitedUpgradable);
    }

    /**
     * Optional
     * @param excludeLimitedNonUpgradable Pass True to exclude gifts that can be purchased a limited number of times and can't be upgraded to unique
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeLimitedNonUpgradable(Boolean excludeLimitedNonUpgradable){
        return add("exclude_limited_non_upgradable", excludeLimitedNonUpgradable);
    }

    /**
     * Optional
     * @param excludeFromBlockchain Pass True to exclude gifts that were assigned from the TON blockchain and can't be resold or transferred in Telegram
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeFromBlockchain(Boolean excludeFromBlockchain){
        return add("exclude_from_blockchain", excludeFromBlockchain);
    }

    /**
     * Optional
     * @param excludeUnique Pass True to exclude unique gifts
     * @return {@link GetChatGifts}
     */
    public GetChatGifts excludeUnique(Boolean excludeUnique){
        return add("exclude_unique", excludeUnique);
    }

    /**
     * Optional
     * @param sortByPrice Pass True to sort results by gift price instead of send date. Sorting is applied before pagination.
     * @return {@link GetChatGifts}
     */
    public GetChatGifts sortByPrice(Boolean sortByPrice){
        return add("sort_by_price", sortByPrice);
    }

    /**
     * Optional
     * @param offset Offset of the first entry to return as received from the previous request; use an empty string to get the first chunk of results
     * @return {@link GetChatGifts}
     */
    public GetChatGifts offset(String offset){
        return add("offset", offset);
    }

    /**
     * Optional
     * @param limit The maximum number of gifts to be returned; 1-100. Defaults to 100
     * @return {@link GetChatGifts}
     */
    public GetChatGifts limit(int limit){
        return add("limit", limit);
    }
}
