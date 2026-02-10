package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.chat_and_user.UserProfileAudios;

/**
 * GetUserProfileAudios class. Returns {@link UserProfileAudios} on success.
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public class GetUserProfileAudios extends AbstractBaseRequest<GetUserProfileAudios, UserProfileAudios> {
    public GetUserProfileAudios(long userId, Api api){
        super(api, "getUserProfileAudios", UserProfileAudios.class);
        add("user_id", userId);
    }

    /**
     * Optional
     * @param offset Sequential number of the first audio to be returned. By default, all audios are returned.
     * @return {@link GetUserProfileAudios}
     */
    public GetUserProfileAudios offset(int offset){
        add("offset", offset);
        return this;
    }

    /**
     * Optional
     * @param limit Limits the number of audios to be retrieved. Values between 1-100 are accepted. Defaults to 100.
     * @return {@link GetUserProfileAudios}
     */
    public GetUserProfileAudios limit(int limit){
        add("limit", limit);
        return this;
    }
}
