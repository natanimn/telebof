package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Represents state of subscription.
 * @author Natanim
 * @since 2.2
 */
public enum SubscriptionState {
    /**
     * The user canceled the subscription
     */
    @SerializedName("cancelled")
    CANCELLED,

    /**
     * The user re-enabled a previously canceled subscription
     */
    @SerializedName("active")
    ACTIVE,

    /**
     * Subscription payment failed.
     */
    @SerializedName("failed")
    FAILED
}
