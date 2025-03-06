package io.github.natanimn.requests;

import io.github.natanimn.Util;
import io.github.natanimn.types.File;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class GetFile extends AbstractBaseRequest<GetFile, File> {

    public GetFile(String fileId, RequestSender requestSender) {
        super(requestSender, "getFile", File.class);
        add("file_id", fileId);
    }

}
