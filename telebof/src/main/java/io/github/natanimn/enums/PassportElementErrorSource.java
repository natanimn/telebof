package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.types.passport.PassportElementError;

/**
 * Describes one of {@link PassportElementError} error source
 * @author Natanim
 * @since 26 July 2025
 * @version 0.7
 */
public enum PassportElementErrorSource {
    @SerializedName("data")
    DATA,

    @SerializedName("front_side")
    FRONT_SIDE,

    @SerializedName("reverse_side")
    REVERSE_SIDE,

    @SerializedName("selfie")
    SELFIE,

    @SerializedName("file")
    FILE,

    @SerializedName("files")
    FILES,

    @SerializedName("translational_file")
    TRANSLATIONAL_FILE,

    @SerializedName("translational_files")
    TRANSLATIONAL_FILES,

    @SerializedName("unspecified")
    UNSPECIFIED

}
