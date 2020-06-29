
package com.yangmama.mall.pojo.orders;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class ClientDetails {

    @SerializedName("accept_language")
    private String acceptLanguage;
    @SerializedName("browser_height")
    private Long browserHeight;
    @SerializedName("browser_ip")
    private String browserIp;
    @SerializedName("browser_width")
    private Long browserWidth;
    @SerializedName("session_hash")
    private Object sessionHash;
    @SerializedName("user_agent")
    private String userAgent;

    public String getAcceptLanguage() {
        return acceptLanguage;
    }

    public Long getBrowserHeight() {
        return browserHeight;
    }

    public String getBrowserIp() {
        return browserIp;
    }

    public Long getBrowserWidth() {
        return browserWidth;
    }

    public Object getSessionHash() {
        return sessionHash;
    }

    public String getUserAgent() {
        return userAgent;
    }

    public static class Builder {

        private String acceptLanguage;
        private Long browserHeight;
        private String browserIp;
        private Long browserWidth;
        private Object sessionHash;
        private String userAgent;

        public ClientDetails.Builder withAcceptLanguage(String acceptLanguage) {
            this.acceptLanguage = acceptLanguage;
            return this;
        }

        public ClientDetails.Builder withBrowserHeight(Long browserHeight) {
            this.browserHeight = browserHeight;
            return this;
        }

        public ClientDetails.Builder withBrowserIp(String browserIp) {
            this.browserIp = browserIp;
            return this;
        }

        public ClientDetails.Builder withBrowserWidth(Long browserWidth) {
            this.browserWidth = browserWidth;
            return this;
        }

        public ClientDetails.Builder withSessionHash(Object sessionHash) {
            this.sessionHash = sessionHash;
            return this;
        }

        public ClientDetails.Builder withUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public ClientDetails build() {
            ClientDetails clientDetails = new ClientDetails();
            clientDetails.acceptLanguage = acceptLanguage;
            clientDetails.browserHeight = browserHeight;
            clientDetails.browserIp = browserIp;
            clientDetails.browserWidth = browserWidth;
            clientDetails.sessionHash = sessionHash;
            clientDetails.userAgent = userAgent;
            return clientDetails;
        }

    }

}
