package io.github.natanimn.enums;

import com.google.gson.annotations.SerializedName;

/**
 * Describes parse mode
 * @author Natanim
 * @since 3 March 2025
 * @version 0.7
 */

public enum ParseMode {
    @SerializedName("html")
    HTML,

    @SerializedName("markdown")
    MARKDOWN,

    @SerializedName("markdownv2")
    MARKDOWNV2
}
