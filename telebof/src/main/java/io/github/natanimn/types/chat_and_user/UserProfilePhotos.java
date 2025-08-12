package io.github.natanimn.types.chat_and_user;

import io.github.natanimn.types.media_and_service.PhotoSize;

import java.util.List;

/**
 * This object represent a user's profile pictures.
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class UserProfilePhotos {
    /**
     * Total number of profile pictures the target user has
     */
    public Integer total_count;

    /**
     * Requested profile pictures (in up to 4 sizes each)
     */
    public List<PhotoSize> photos;

}
