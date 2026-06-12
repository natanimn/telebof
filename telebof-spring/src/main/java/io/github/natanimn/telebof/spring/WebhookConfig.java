package io.github.natanimn.telebof.spring;

import java.io.File;

/**
 * WebhookConfig class.
 * @author Natanim
 * @since 2.0.0
 * @version 2.0.0
 */
public class WebhookConfig {
    private final String url;
    private File certificate;
    private String ipAddress;
    private String secretToken;
    private Boolean dropPendingUpdates;
    private Integer maxConnections;

    private WebhookConfig(String url, File certificate, String secretToken, String ipAddress, Boolean dropPendingUpdates, Integer maxConnections) {
        this.url = url;
        this.certificate = certificate;
        this.secretToken = secretToken;
        this.ipAddress = ipAddress;
        this.dropPendingUpdates = dropPendingUpdates;
        this.maxConnections = maxConnections;
    }

    public WebhookConfig(String url){
        this.url = url;
    }

    static ConfigBuilder builder(String url){
        return new ConfigBuilder(url);
    }

    static class ConfigBuilder{
        private String url;
        private File certificate;
        private String ipAddress;
        private Boolean dropPendingUpdates;
        private String secretToken;
        private Integer maxConnections;

        public ConfigBuilder(String url){
            this.url = url;
            this.ipAddress = null;
            this.certificate = null;
            this.dropPendingUpdates = null;
            this.secretToken = null;
            this.maxConnections = null;
        }

        public ConfigBuilder certificate(File certificate){
            this.certificate = certificate;
            return this;
        }

        public ConfigBuilder ipAddress(String ipAddress){
            this.ipAddress = ipAddress;
            return this;
        }

        public ConfigBuilder secretToken(String secretToken){
            this.secretToken = secretToken;
            return this;
        }

        public ConfigBuilder dropPendingUpdates(Boolean dropPendingUpdates){
            this.dropPendingUpdates = dropPendingUpdates;
            return this;
        }

        public ConfigBuilder maxConnections(Integer maxConnections){
            this.maxConnections = maxConnections;
            return this;
        }

        public WebhookConfig build(){
            return new WebhookConfig(url, certificate, secretToken, ipAddress, dropPendingUpdates, maxConnections);
        }
    }

    public String getUrl() {
        return url;
    }

    public File getCertificate() {
        return certificate;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public String getSecretToken() {
        return secretToken;
    }

    public Boolean getDropPendingUpdates() {
        return dropPendingUpdates;
    }

    public Integer getMaxConnections() {
        return maxConnections;
    }
}
