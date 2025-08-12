package io.github.natanimn.requests.send;

import io.github.natanimn.enums.ParseMode;
import io.github.natanimn.requests.AbstractBaseRequest;
import io.github.natanimn.requests.RequestSender;
import io.github.natanimn.types.media_and_service.MessageEntity;
import java.util.List;

/**
 * SendGift class for sending gifts
 * @author Natanim
 * @since July 25, 2025
 * @version 0.8
 */

public class SendGift extends AbstractBaseRequest<SendGift, Boolean> {
    public SendGift(Object chat_id, String gift_id,  RequestSender rs){
        super(chat_id, rs, "sendGift", Boolean.class);
        add("gift_id", gift_id);
    }

    public SendGift(long user_id, String gift_id,  RequestSender rs){
        super(rs, "sendGift");
        add("user_id", user_id);
        add("gift_id", gift_id);
    }

    /**
     * Optional
     * @param pay_for_upgrade Pass True to pay for the gift upgrade from the bot's balance, thereby making the upgrade free for the receiver.
     * @return {@link SendGift}
     */
    public SendGift payForUpgrade(Boolean pay_for_upgrade){
        return add("pay_for_upgrade", pay_for_upgrade);
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
     * @param text_parse_mode Mode for parsing entities in the text.
     * @return {@link SendGift}
     */
    public SendGift textParseMode(ParseMode text_parse_mode){
        return add("text_parse_mode", text_parse_mode);
    }

    /**
     * Optional
     * @param text_entities A list of {@link MessageEntity}, special entities that appear in the gift text. It can be specified instead of text_parse_mode
     * @return {@link SendGift}
     */
    public SendGift textEntities(List<MessageEntity> text_entities){
        return add("text_entities", text_entities);
    }
}
