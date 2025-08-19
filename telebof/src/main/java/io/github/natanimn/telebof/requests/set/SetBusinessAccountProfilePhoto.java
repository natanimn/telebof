package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputProfilePhoto;

/**
 * SetBusinessAccountProfilePhoto class. Returns True on success.
 *
 * @author Natanim
 * @version 1.0.0
 * @see io.github.natanimn.telebof.BotContext#setBusinessAccountProfilePhoto
 * @since 19 August 2025
 */
public class SetBusinessAccountProfilePhoto extends AbstractBaseRequest<SetBusinessAccountProfilePhoto, Boolean> {
    /**
     * Required
     *
     * @param business_connection_id business connection id
     * @param photo                  photo
     * @param api                    api
     */
    public SetBusinessAccountProfilePhoto(String business_connection_id, InputProfilePhoto photo, Api api) {
        super(api, "setBusinessAccountProfilePhoto", Boolean.class);
        add("business_connection_id", business_connection_id);
        add("photo", photo);
    }

    /**
     * Optional
     *
     * @param is_public Pass True to set the public photo, which will be visible even if the main photo is hidden by the business account's privacy settings.
     *                  An account can have only one public photo.
     * @return {@link SetBusinessAccountProfilePhoto}
     */
    public SetBusinessAccountProfilePhoto isPublic(boolean is_public) {
        return add("is_public", is_public);
    }
}
