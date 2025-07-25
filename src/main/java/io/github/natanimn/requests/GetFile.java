package io.github.natanimn.requests;

import io.github.natanimn.types.media_and_service.File;

/**
 * Natanim Negash
 *  3 March 2025
 */
public class GetFile extends AbstractBaseRequest<GetFile, File> {

    public GetFile(String fileId, RequestSender requestSender) {
        super(requestSender, "getFile", File.class);
        add("file_id", fileId);
    }

}
