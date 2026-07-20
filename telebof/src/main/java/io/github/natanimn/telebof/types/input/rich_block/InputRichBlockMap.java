package io.github.natanimn.telebof.types.input.rich_block;

import io.github.natanimn.telebof.types.media_and_service.Location;
import io.github.natanimn.telebof.types.rich.RichBlockCaption;

/**
 * A block with a map, corresponding to the custom HTML tag <tg-map>. The map's width and height must not exceed 10000 in total.
 * The width and height ratio must be at most 20.
 * @author Natanim
 * @since 2.2
 */
public class InputRichBlockMap implements InputRichBlock {
    /**
     * Type of the block
     */
    private final String type = "map";

    private final Location location;
    private final int zoom;
    private final int width;
    private final int height;
    
    private RichBlockCaption caption;

    /**
     * Required
     * @param location Location of the center of the map
     * @param zoom Map zoom level; 0-24
     * @param width Map width; 0-10000
     * @param height Map height; 0-10000
     */
    public InputRichBlockMap(Location location, int zoom, int width, int height){
        this.location = location;
        this.zoom = zoom;
        this.width = width;
        this.height = height;
    }

    /**
     * Optional
     * @param caption Caption of the block
     * @return {@link InputRichBlockMap}
     */
    public InputRichBlockMap setCaption(RichBlockCaption caption) {
        this.caption = caption;
        return this;
    }
}
