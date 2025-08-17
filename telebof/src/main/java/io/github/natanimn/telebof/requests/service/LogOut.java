package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class LogOut extends AbstractBaseRequest<LogOut, Boolean> {
    public LogOut(Api api) {
        super(api, "logOut");
    }

}
