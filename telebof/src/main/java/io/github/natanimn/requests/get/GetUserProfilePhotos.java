package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.chat_and_user.UserProfilePhotos;

/**
 * GetUserProfilePhotos class. Returns {@link UserProfilePhotos}
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getUserProfilePhotos}
 */
public class GetUserProfilePhotos extends AbstractBaseRequest<GetUserProfilePhotos, UserProfilePhotos> {

    /**
     * Required
     * @param user_id user id
     * @param requestSender request sender
     */
    public GetUserProfilePhotos(long user_id, RequestSender requestSender) {
        super(requestSender, "getUserProfilePhotos", UserProfilePhotos.class);
        add("user_id", user_id);
    }

    /**
     * Optional
     * @param offset Sequential number of the first photo to be returned. By default, all photos are returned.
     * @return {@link GetUserProfilePhotos}
     */
    public GetUserProfilePhotos offset(int offset) {
        return add("offset", offset);
    }

    /**
     * Optional
     * @param limit Limits the number of photos to be retrieved. Values between 1-100 are accepted. Defaults to 100.
     * @return {@link GetUserProfilePhotos}
     */
    public GetUserProfilePhotos limit(byte limit) {
        return add("limit", limit);
    }

}
