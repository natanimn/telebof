package io.github.natanimn.telebof.types.rich;

/**
 * Caption of a rich formatted block.
 * @author Natanim
 * @since 2.1
 */
public class RichBlockCaption {
    /**
     * Block caption
     */
    private RichText text;

    /**
     * Optional. Block credit which corresponds to the HTML tag <cite>
     */
    private RichText credit;

    public RichText getText() {
        return text;
    }

    public RichText getCredit() {
        return credit;
    }
}
