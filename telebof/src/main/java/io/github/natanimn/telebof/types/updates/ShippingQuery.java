package io.github.natanimn.telebof.types.updates;

import io.github.natanimn.telebof.types.chat_and_user.User;
import io.github.natanimn.telebof.types.payments.ShippingAddress;
import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * This class contains information about an incoming shipping query.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class ShippingQuery implements TelegramUpdate {
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

    public String getId() {
        return id;
    }

    public User getFrom() {
        return from;
    }

    public String getInvoicePayload() {
        return invoicePayload;
    }

    public ShippingAddress getShippingAddress() {
        return shippingAddress;
    }

    @Override
    public String toString() {
        return "ShippingQuery{" +
                "id='" + id + '\'' +
                ", from=" + from +
                ", invoicePayload='" + invoicePayload + '\'' +
                ", shippingAddress=" + shippingAddress +
                '}';
    }
}