package io.github.natanimn.types.media_and_service;

/**
 * This object represents a service message about a user allowing a bot to write messages after adding it to the attachment menu,
 * launching a Web App from a link, or accepting an explicit request from a Web App sent by the method <a href="https://core.telegram.org/bots/webapps#initializing-mini-apps">requestWriteAccess</a>.
 * @author Natanim
 * @since 3 March 2025
 * @version 0.9
 */
public class WriteAccessAllowed {
    /**
     * Optional. Name of the Web App, if the access was granted when the Web App was launched from a link
     */
    public String web_app_name;

    /**
     * Optional. True, if the access was granted after the user accepted an explicit request from a Web App sent by the
     * method <a href="https://core.telegram.org/bots/webapps#initializing-mini-apps">requestWriteAccess</a>.
     */
    public Boolean from_request;

    /**
     * Optional. True, if the access was granted when the bot was added to the attachment or side menu
     */
    public Boolean from_attachment_menu;

}
