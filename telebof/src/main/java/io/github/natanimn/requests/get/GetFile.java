package io.github.natanimn.requests.get;

import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.media_and_service.File;

/**
 * GetFile class. Returns {@link File} on success.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 * @implNote {@link io.github.natanimn.BotContext#getFile}
 */
public class GetFile extends AbstractBaseRequest<GetFile, File> {

    /**
     * Required
     * @param file_id file id
     * @param requestSender request sender
     */
    public GetFile(String file_id, RequestSender requestSender) {
        super(requestSender, "getFile", File.class);
        add("file_id", file_id);
    }

}
