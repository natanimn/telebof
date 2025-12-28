package io.github.natanimn.telebof.requests.send;

import io.github.natanimn.telebof.enums.ParseMode;
import io.github.natanimn.telebof.requests.AbstractBaseRequest;
import io.github.natanimn.telebof.requests.Api;
import io.github.natanimn.telebof.types.media_and_service.MessageEntity;
import java.util.List;

/**
 * SendGift class for sending gifts
 * @author Natanim
 * @since July 25, 2025
 * @version 1.3.0
 */

public class SendGift extends AbstractBaseRequest<SendGift, Boolean> {
    public SendGift(Object chatId, String giftId,  Api rs){
        super(chatId, rs, "sendGift", Boolean.class);
        add("gift_id", giftId);
    }

    public SendGift(long userId, String giftId,  Api rs){
        super(rs, "sendGift");
        add("user_id", userId);
        add("gift_id", giftId);
    }

    /**
     * Optional
     * @param payForUpgrade Pass True to pay for the gift upgrade from the bot's balance, thereby making the upgrade free for the receiver.
     * @return {@link SendGift}
     */
    public SendGift payForUpgrade(Boolean payForUpgrade){
        return add("pay_for_upgrade", payForUpgrade);
    }

    /**
     * Optional
     * @param text Text that will be shown along with the gift; 0-128 characters
     * @return {@link SendGift}
     */
    public SendGift text(String text){
        return add("add", text);
    }

    /**
     * Optional
     * @param textParseMode Mode for parsing entities in the text.
     * @return {@link SendGift}
     */
    public SendGift textParseMode(ParseMode textParseMode){
        return add("text_parse_mode", textParseMode);
    }

    /**
     * Optional
     * @param textEntities A list of {@link MessageEntity}, special entities that appear in the gift text. It can be specified instead of text_parse_mode
     * @return {@link SendGift}
     */
    public SendGift textEntities(MessageEntity[] textEntities){
        return add("text_entities", textEntities);
    }
}
