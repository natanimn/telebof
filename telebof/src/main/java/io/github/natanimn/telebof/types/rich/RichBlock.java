package io.github.natanimn.telebof.types.rich;

import com.google.gson.annotations.SerializedName;
import io.github.natanimn.telebof.enums.RichBlockType;
import io.github.natanimn.telebof.types.media_and_service.Animation;
import io.github.natanimn.telebof.types.media_and_service.Audio;
import io.github.natanimn.telebof.types.media_and_service.Location;
import io.github.natanimn.telebof.types.media_and_service.PhotoSize;
import io.github.natanimn.telebof.types.media_and_service.Video;
import io.github.natanimn.telebof.types.media_and_service.Voice;

import java.util.List;

/**
 * This object represents a block in a rich formatted message.
 * @author Natanim
 * @since 2.1
 */
public class RichBlock {
    /**
     * Type of the block.
     */
    private RichBlockType type;

    /**
     * Text of the block
     */
    private RichText text;

    /**
     * Relative size of the text font; 1-6, 1 is the largest, 6 is the smallest. Available for {@link RichBlockType#HEADING}
     */
    private Integer size;

    /**
     * The programming language of the text. Available for {@link RichBlockType#PRE}
     */
    private String language;

    /**
     * The mathematical expression in LaTeX format. Available for {@link RichBlockType#MATHEMATICAL_EXPRESSION}
     */
    private String expression;

    /**
     * The name of the anchor. Available for {@link RichBlockType#ANCHOR}
     */
    private String name;

    /**
     * Items of the list. Available for {@link RichBlockType#LIST}
     */
    private List<RichBlockListItem> items;

    /**
     * Content of the block. Available for {@link RichBlockType#BLOCKQUOTE}
     */
    private List<RichBlock> blocks;

    /**
     * Optional. Credit of the block
     */
    private RichText credit;

    /**
     * Cells of the table
     */
    private List<List<RichBlockTableCell>> cells;

    /**
     * Optional. True, if the table has borders
     */
    @SerializedName("is_bordered")
    private Boolean isBordered;

    /**
     * Optional. True, if the table is striped
     */
    @SerializedName("is_striped")
    private Boolean isStripped;

    /**
     * Always shown summary of the block
     */
    private RichText summary;

    /**
     * Optional. True, if the content of the block is visible by default
     */
    @SerializedName("is_open")
    private Boolean isOpen;

    /**
     * Location of the center of the map
     */
    private Location location;

    /**
     * Map zoom level; 13-20
     */
    private Integer zoom;

    /**
     * Expected width of the map
     */
    private Integer width;

    /**
     * Expected height of the map
     */
    private Integer height;

    /**
     * Optional. Caption of the block
     */
    private RichBlockCaption caption;

    /**
     * The animation
     */
    private Animation animation;

    /**
     * Optional. True, if the media preview is covered by a spoiler animation
     */
    @SerializedName("has_spoiler")
    private Boolean hasSpoiler;

    /**
     * The audio
     */
    private Audio audio;

    /**
     * Available sizes of the photo
     */
    private List<PhotoSize> photo;

    /**
     * The video
     */
    private Video video;

    /**
     * The voice note
     */
    @SerializedName("voice_name")
    private Voice voiceNote;

    public RichBlockType getType() {
        return type;
    }

    public RichText getText() {
        return text;
    }

    public Integer getSize() {
        return size;
    }

    public String getLanguage() {
        return language;
    }

    public String getExpression() {
        return expression;
    }

    public String getName() {
        return name;
    }

    public List<RichBlockListItem> getItems() {
        return items;
    }

    public List<RichBlock> getBlocks() {
        return blocks;
    }

    public RichText getCredit() {
        return credit;
    }

    public List<List<RichBlockTableCell>> getCells() {
        return cells;
    }

    public Boolean getIsBordered() {
        return isBordered;
    }

    public Boolean getIsStripped() {
        return isStripped;
    }

    public RichText getSummary() {
        return summary;
    }

    public Boolean getIsOpen() {
        return isOpen;
    }

    public Location getLocation() {
        return location;
    }

    public Integer getZoom() {
        return zoom;
    }

    public Integer getWidth() {
        return width;
    }

    public Integer getHeight() {
        return height;
    }

    public RichBlockCaption getCaption() {
        return caption;
    }

    public Animation getAnimation() {
        return animation;
    }

    public Boolean getHasSpoiler() {
        return hasSpoiler;
    }

    public Audio getAudio() {
        return audio;
    }

    public List<PhotoSize> getPhoto() {
        return photo;
    }

    public Video getVideo() {
        return video;
    }

    public Voice getVoiceNote() {
        return voiceNote;
    }
}
