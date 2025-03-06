package io.github.natanimn;

import java.io.Serializable;

/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
 */
public class ResponseParameters implements Serializable {
    public Long migrate_to_chat_id;
    public Integer retry_after;
}
