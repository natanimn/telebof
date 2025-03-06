package io.github.natanimn.requests;

import io.github.natanimn.types.UserProfilePhotos;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetUserProfilePhotos extends AbstractBaseRequest<GetUserProfilePhotos, UserProfilePhotos> {

    public GetUserProfilePhotos(long userId, RequestSender requestSender) {
        super(requestSender, "getUserProfilePhotos", UserProfilePhotos.class);
        add("user_id", userId);
    }

    public GetUserProfilePhotos offset(int offset) {
        return add("offset", offset);
    }

    public GetUserProfilePhotos limit(int limit) {
        return add("limit", limit);
    }

}
