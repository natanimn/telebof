package io.github.natanimn.telebof.types.chat_and_user;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.types.media_and_service.Audio;

import java.util.List;

/**
 * This object represents the audios displayed on a user's profile.
 * @author Natanim
 * @since 1.4.0
 * @version 1.4.0
 */
public class UserProfileAudios {
    /**
     * Total number of profile audios for the target user
     */
    @SerializedName("total_count")
    private Integer totalCount;

    /**
     * Requested profile audios
     */
    private List<Audio> audios;

    public Integer getTotalCount() {
        return totalCount;
    }

    public List<Audio> getAudios() {
        return audios;
    }
}
