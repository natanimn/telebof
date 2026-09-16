package io.github.natanimn.telebof.types;

import lombok.Getter;

/**
 * Represents an HTTP link.
 * @author Natanim
 * @since 2.1
 */
@Getter
public class Link implements JsonFormatter{
    /**
     * URL of the link
     */
    private String url;

}
