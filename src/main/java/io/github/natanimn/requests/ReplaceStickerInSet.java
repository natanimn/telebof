package io.github.natanimn.requests;

import io.github.natanimn.types.InputSticker;



/**
 * @author Natanim Negash
 * @version 0.1
 * @since 3/6/25
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
