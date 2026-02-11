package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * RemoveProfilePhoto class. Returns True on success.
 * @author Natnim
 * @version 1.4.0
 */
public class RemoveMyProfilePhoto extends AbstractBaseRequest<RemoveMyProfilePhoto, Boolean> {
    public RemoveMyProfilePhoto(Api api){
        super(api, "removeMyProfilePhoto");
    }
}
