package io.github.natanimn.telebof.requests.set;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.input.InputProfilePhoto;

/**
 * SetMyProfilePhoto class. Returns Tru on success.
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public class SetMyProfilePhoto extends AbstractBaseRequest<SetMyProfilePhoto, Boolean> {
    public SetMyProfilePhoto(InputProfilePhoto photo, Api api){
        super(api, "setMyProfilePhoto");
        add("photo", photo);
    }
}
