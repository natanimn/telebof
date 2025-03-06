package io.github.natanimn.requests;

import io.github.natanimn.types.InputSticker;



/**
 * Natanim Negash 
 *  3 March 2025
 */
public class ReplaceStickerInSet extends AbstractBaseRequest<ReplaceStickerInSet, Boolean>{

    public ReplaceStickerInSet(long user_id, String name, String old_sticker, InputSticker sticker, RequestSender requestSender){
        super(requestSender, "replaceStickerInSet");
        add("user_id", user_id);
        add("name", name);
        add("old_sticker", old_sticker);
        add("sticker", sticker);
    }

}
