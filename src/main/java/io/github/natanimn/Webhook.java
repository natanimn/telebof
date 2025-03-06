package io.github.natanimn;

import io.github.natanimn.enums.Updates;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * A Class that holds <strong>setWebhook</strong> parameters.
 * @author Natanim Negash
 */

/**
 * Natanim Negash
 *  3 March 2025
 */    /**
 * Natanim Negash
 *  3 March 2025
 */
public class Webhook {

    private final Map<String, Object> objectMap = new HashMap<>();
    private int port;
    private String path;
    private final String webhookUrl;

    private Webhook add(String name, Object value){
        objectMap.put(name, value);
        return this;
    }

    /**
     * A constructor of Webhook
     * @param url HTTPS URL to send updates to.
     * @param path A path where updates send to.    
     */
    public Webhook(String url, String path){
        this.webhookUrl = url;
        this.path = path;
        add("url", url+path);
    }

    public Webhook(String url, String path,int port){
        this.webhookUrl = url;
        this.port = port;
        add("url", url+path);
    }

    public Webhook certificate(File file){
        return add("certificate", file);
    }
    
    public Webhook ipAddress(String ipAddress){
        return add("ip_address", ipAddress);
    }
    
    public Webhook maxConnections(int maxConnections){
        return add("max_connections", maxConnections);
    }

    public Webhook allowedUpdates(Updates[] allowedUpdates){
        List<String> updates = new ArrayList<>();
        if (allowedUpdates != null) {
            List.of(allowedUpdates).forEach(update -> updates.add(update.name().toLowerCase()));
        }
        return add("allowed_updates", updates);
    }

    public Webhook dropPendingUpdates(Boolean dropPendingUpdates){
        return add("drop_pending_updates", dropPendingUpdates);
    }

    public Webhook secretToken(String secretToken){
        return add("secret_token", secretToken);
    }

    public Map<String, Object> getObjectMap() {
        return objectMap;
    }

    protected String getWebhookUrl() {
        return webhookUrl;
    }

    protected int getPort() {
        return port;
    }

    protected String getPath() {
        return path;
    }
}
