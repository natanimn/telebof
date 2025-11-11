package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.payments.ShippingAddress;
import com.google.gson.annotations.SerializedName;

/**
 * This record contains information about an incoming shipping query.
 *
 * @param id Unique query identifier
 * @param from User who sent the query
 * @param invoicePayload Bot-specified invoice payload
 * @param shippingAddress User specified shipping address
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public record ShippingQuery(
        String id,
        User from,
        @SerializedName("invoice_payload") String invoicePayload,
        @SerializedName("shipping_address") ShippingAddress shippingAddress
) implements TelegramUpdate {}