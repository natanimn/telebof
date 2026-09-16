package io.github.natanimn.telebof.types.updates;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.JsonFormatter;
import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.payments.ShippingAddress;
import lombok.Getter;

/**
 * This class contains information about an incoming shipping query.
 * @author Natanim
 * @since 0.1
 */
@Getter
public class ShippingQuery implements TelegramUpdate, JsonFormatter {
    /**
     * Unique query identifier
     */
    private String id;

    /**
     * User who sent the query
     */
    private User from;

    /**
     * Bot-specified invoice payload
     */
    @SerializedName("invoice_payload")
    private String invoicePayload;

    /**
     * User specified shipping address
     */
    @SerializedName("shipping_address")
    private ShippingAddress shippingAddress;

}