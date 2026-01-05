package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * RemoveBusinessAccountProfilePhoto class. Returns True on success.
 * @author Natanim
 * @since 19 August 2025
 * @version 1.3.0
 * @see io.github.natanimn.telebof.BotContext#removeBusinessAccountProfilePhoto
 */
public class RemoveBusinessAccountProfilePhoto extends AbstractBaseRequest<RemoveBusinessAccountProfilePhoto, Boolean> {
    /**
     * Required
     * @param businessConnectionId business connection id
     * @param api api
     */
    public RemoveBusinessAccountProfilePhoto(String businessConnectionId, Api api){
        super(api, "removeBusinessAccountProfilePhoto", Boolean.class);
        add("business_connection_id", businessConnectionId);
    }

    /**
     * Optional
     * @param isPublic Pass True to remove the public photo, which is visible even if the main photo is hidden by the business account's privacy settings.
     *                  After the main photo is removed, the previous profile photo (if present) becomes the main photo.
     * @return {@link RemoveBusinessAccountProfilePhoto}
     */
    public RemoveBusinessAccountProfilePhoto isPublic(boolean isPublic){
        return add("is_public", isPublic);
    }
}
