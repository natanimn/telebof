package io.github.natanimn.telebof.requests.service;

import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;

/**
 * Close class. Returns True on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @see BotContext#close()
 */
public class Close extends AbstractBaseRequest<Close, Boolean> {
    public Close(Api api){
        super(api, "close");
    }

}
