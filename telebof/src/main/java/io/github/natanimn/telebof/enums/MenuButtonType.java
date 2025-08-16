package io.github.natanimn.telebof.enums;

import com.google.gson.annotations.SerializedName;

/**
 * @author Natanim
 * @since 3 March, 2025
 * @version 0.7
 */
public enum MenuButtonType {
    @SerializedName("commands")
    COMMANDS,

    @SerializedName("default")
    DEFAULT,

    @SerializedName("web_app")
    WEB_APP;
}
