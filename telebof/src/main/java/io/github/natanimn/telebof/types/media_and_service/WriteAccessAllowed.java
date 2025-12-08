package io.github.natanimn.telebof.types.media_and_service;

import com.google.gson.annotations.SerializedName;

/**
 * This object represents a service message about a user allowing a bot to write messages after adding it to the attachment menu,
 * launching a Web App from a link, or accepting an explicit request from a Web App sent by the method requestWriteAccess.
 * @author Natanim
 * @since 3 March 2025
 * @version 1.3.0
 */
public class WriteAccessAllowed {
    /**
     * Optional. Name of the Web App, if the access was granted when the Web App was launched from a link
     */
    @SerializedName("web_app_name")
    private String webAppName;

    /**
     * Optional. True, if the access was granted after the user accepted an explicit request from a Web App sent by the method requestWriteAccess.
     */
    @SerializedName("from_request")
    private Boolean fromRequest;

    /**
     * Optional. True, if the access was granted when the bot was added to the attachment or side menu
     */
    @SerializedName("from_attachment_menu")
    private Boolean fromAttachmentMenu;

    public String getWebAppName() {
        return webAppName;
    }

    public Boolean getFromRequest() {
        return fromRequest;
    }

    public Boolean getFromAttachmentMenu() {
        return fromAttachmentMenu;
    }
}