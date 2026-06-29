package io.github.natanimn.telebof.types.rich.block;

import io.github.natanimn.telebof.types.rich.RichText;

/**
 * Caption of a rich formatted block.
 * @author Natanim
 * @since 2.1
 */
public class RichBlockCaption implements RichText {
    /**
     * Block caption
     */
    private final RichText text;

    private RichText credit;

    /**
     * Required
     * @param text Block caption
     */
    public RichBlockCaption(RichText text){
        this.text = text;
    }

    /**
     * Optional.
     * @param credit  Block credit which corresponds to the HTML tag <cite>
     */
    public RichBlockCaption setCredit(RichText credit){
        this.credit = credit;
        return this;
    }

}
