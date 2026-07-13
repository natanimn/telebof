package io.github.natanimn.telebof.types.rich;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Rich formatted message.
 * @author Natanim
 * @since 2.1
 */
public class RichMessage {
    /**
     * Content of the message
     */
    private List<RichBlock> blocks;

    /**
     * Optional. True, if the rich message must be shown right-to-left
     */
    @SerializedName("is_rtl")
    private Boolean isRtl;

    public List<RichBlock> getBlocks() {
        return blocks;
    }

    public Boolean getIsRtl() {
        return isRtl;
    }
}
