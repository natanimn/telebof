package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class LogOut extends AbstractBaseRequest<LogOut, Boolean> {
    public LogOut(Api api) {
        super(api, "logOut");
    }
}
