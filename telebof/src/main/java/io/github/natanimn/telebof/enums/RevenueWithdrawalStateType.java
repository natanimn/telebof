package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.payments.RevenueWithdrawalState;

/**
 * Describes {@link RevenueWithdrawalState#type}
 * @author Natanim
 * @since 26 July 2025
 * @version 0.7
 */
public enum RevenueWithdrawalStateType {
    @SerializedName("pending")
    PENDING,

    @SerializedName("succeeded")
    SUCCEEDED,

    @SerializedName("failed")
    FAILED
}
