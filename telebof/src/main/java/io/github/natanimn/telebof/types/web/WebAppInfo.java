package io.github.natanimn.telebof.types.web;

import java.io.Serializable;

/**
 * Describes a <a href="https://core.telegram.org/bots/webapps">Web App.</a>
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class WebAppInfo implements Serializable {
    /**
     * An HTTPS URL of a Web App to be opened with additional data as specified in Initializing Web Apps
     */
    private String url;

    public WebAppInfo(){}

    public WebAppInfo(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}