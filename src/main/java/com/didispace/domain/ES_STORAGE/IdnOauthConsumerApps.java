package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH_CONSUMER_APPS", schema = "PUBLIC", catalog = "ES_STORAGE")
public class IdnOauthConsumerApps {
    private int id;
    private String consumerKey;
    private String consumerSecret;
    private String username;
    private Integer tenantId;
    private String userDomain;
    private String appName;
    private String oauthVersion;
    private String callbackUrl;
    private String grantTypes;
    private ApmApiConsumerApps apmApiConsumerAppsByConsumerKey;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CONSUMER_KEY")
    public String getConsumerKey() {
        return consumerKey;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    @Basic
    @Column(name = "CONSUMER_SECRET")
    public String getConsumerSecret() {
        return consumerSecret;
    }

    public void setConsumerSecret(String consumerSecret) {
        this.consumerSecret = consumerSecret;
    }

    @Basic
    @Column(name = "USERNAME")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "USER_DOMAIN")
    public String getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain;
    }

    @Basic
    @Column(name = "APP_NAME")
    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    @Basic
    @Column(name = "OAUTH_VERSION")
    public String getOauthVersion() {
        return oauthVersion;
    }

    public void setOauthVersion(String oauthVersion) {
        this.oauthVersion = oauthVersion;
    }

    @Basic
    @Column(name = "CALLBACK_URL")
    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    @Basic
    @Column(name = "GRANT_TYPES")
    public String getGrantTypes() {
        return grantTypes;
    }

    public void setGrantTypes(String grantTypes) {
        this.grantTypes = grantTypes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOauthConsumerApps that = (IdnOauthConsumerApps) o;

        if (id != that.id) return false;
        if (consumerKey != null ? !consumerKey.equals(that.consumerKey) : that.consumerKey != null) return false;
        if (consumerSecret != null ? !consumerSecret.equals(that.consumerSecret) : that.consumerSecret != null)
            return false;
        if (username != null ? !username.equals(that.username) : that.username != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (userDomain != null ? !userDomain.equals(that.userDomain) : that.userDomain != null) return false;
        if (appName != null ? !appName.equals(that.appName) : that.appName != null) return false;
        if (oauthVersion != null ? !oauthVersion.equals(that.oauthVersion) : that.oauthVersion != null) return false;
        if (callbackUrl != null ? !callbackUrl.equals(that.callbackUrl) : that.callbackUrl != null) return false;
        if (grantTypes != null ? !grantTypes.equals(that.grantTypes) : that.grantTypes != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (consumerKey != null ? consumerKey.hashCode() : 0);
        result = 31 * result + (consumerSecret != null ? consumerSecret.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (userDomain != null ? userDomain.hashCode() : 0);
        result = 31 * result + (appName != null ? appName.hashCode() : 0);
        result = 31 * result + (oauthVersion != null ? oauthVersion.hashCode() : 0);
        result = 31 * result + (callbackUrl != null ? callbackUrl.hashCode() : 0);
        result = 31 * result + (grantTypes != null ? grantTypes.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CONSUMER_KEY", referencedColumnName = "APP_CONSUMER_KEY")
    public ApmApiConsumerApps getApmApiConsumerAppsByConsumerKey() {
        return apmApiConsumerAppsByConsumerKey;
    }

    public void setApmApiConsumerAppsByConsumerKey(ApmApiConsumerApps apmApiConsumerAppsByConsumerKey) {
        this.apmApiConsumerAppsByConsumerKey = apmApiConsumerAppsByConsumerKey;
    }
}
