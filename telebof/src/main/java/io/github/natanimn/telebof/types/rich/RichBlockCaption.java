package io.github.natanimn.telebof.types.rich;

import lombok.Getter;

/**
 * Caption of a rich formatted block.
 * @author Natanim
 * @since 2.1
 */
@Getter
public class RichBlockCaption {
    /**
     * Block caption
     */
    private RichText text;

    /**
     * Optional. Block credit which corresponds to the HTML tag <cite>
     */
    private RichText credit;

}
