package io.github.natanimn.types.web;

import java.io.Serializable;

/**
 * Describes a <a href="https://core.telegram.org/bots/webapps">Web App.</a>
 * @author Natanim 
 * @since 3 March 2025
 * @version 0.8
 */
public class WebAppInfo implements Serializable {
    /**
     * An HTTPS URL of a Web App to be opened with additional data as specified in Initializing Web Apps
     */
    public String url;

    public WebAppInfo(String url) {
        this.url = url;
    }
}
