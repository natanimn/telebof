package io.github.natanimn.telebof.requests.get;

import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.BotContext;
import io.github.natanimn.telebof.types.media_and_service.File;

/**
 * GetFile class. Returns {@link File} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 * @see BotContext#getFile
 */
public class GetFile extends AbstractBaseRequest<GetFile, File> {

    /**
     * Required
     * @param fileId file id
     * @param api api
     */
    public GetFile(String fileId, Api api) {
        super(api, "getFile", File.class);
        add("file_id", fileId);
    }

}
