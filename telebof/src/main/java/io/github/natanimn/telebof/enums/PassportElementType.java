package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes passport element type
 * @author Natanim
 * @since 26 July 2025
 * @version 0.7
 */
public enum PassportElementType {
    @SerializedName("personal_details")
    PERSONAL_DETAILS,

    @SerializedName("passport")
    PASSPORT,

    @SerializedName("driver_license")
    DRIVER_LICENSE,

    @SerializedName("identity_card")
    IDENTITY_CARD,

    @SerializedName("internal_passport")
    INTERNAL_PASSPORT,

    @SerializedName("address")
    ADDRESS,

    @SerializedName("utility_bill")
    UTILITY_BILL,

    @SerializedName("bank_statement")
    BANK_STATEMENT,

    @SerializedName("rental_agreement")
    RENTAL_AGREEMENT,

    @SerializedName("passport_registration")
    PASSPORT_REGISTRATION,

    @SerializedName("temporary_registration")
    TEMPORARY_REGISTRATION,

    @SerializedName("email")
    EMAIL,

    @SerializedName("phone_number")
    PHONE_NUMBER

}
