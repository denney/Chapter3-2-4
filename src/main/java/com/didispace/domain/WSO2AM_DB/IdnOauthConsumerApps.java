package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH_CONSUMER_APPS", schema = "PUBLIC", catalog = "WSO2AM_DB")
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
    private String pkceMandatory;
    private String pkceSupportPlain;
    private String appState;
    private Collection<IdnOauth1AAccessToken> idnOauth1AAccessTokensById;
    private Collection<IdnOauth1ARequestToken> idnOauth1ARequestTokensById;
    private Collection<IdnOauth2AccessToken> idnOauth2AccessTokensById;
    private Collection<IdnOauth2AuthorizationCode> idnOauth2AuthorizationCodesById;

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

    @Basic
    @Column(name = "PKCE_MANDATORY")
    public String getPkceMandatory() {
        return pkceMandatory;
    }

    public void setPkceMandatory(String pkceMandatory) {
        this.pkceMandatory = pkceMandatory;
    }

    @Basic
    @Column(name = "PKCE_SUPPORT_PLAIN")
    public String getPkceSupportPlain() {
        return pkceSupportPlain;
    }

    public void setPkceSupportPlain(String pkceSupportPlain) {
        this.pkceSupportPlain = pkceSupportPlain;
    }

    @Basic
    @Column(name = "APP_STATE")
    public String getAppState() {
        return appState;
    }

    public void setAppState(String appState) {
        this.appState = appState;
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
        if (pkceMandatory != null ? !pkceMandatory.equals(that.pkceMandatory) : that.pkceMandatory != null)
            return false;
        if (pkceSupportPlain != null ? !pkceSupportPlain.equals(that.pkceSupportPlain) : that.pkceSupportPlain != null)
            return false;
        if (appState != null ? !appState.equals(that.appState) : that.appState != null) return false;

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
        result = 31 * result + (pkceMandatory != null ? pkceMandatory.hashCode() : 0);
        result = 31 * result + (pkceSupportPlain != null ? pkceSupportPlain.hashCode() : 0);
        result = 31 * result + (appState != null ? appState.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "idnOauthConsumerAppsByConsumerKeyId")
    public Collection<IdnOauth1AAccessToken> getIdnOauth1AAccessTokensById() {
        return idnOauth1AAccessTokensById;
    }

    public void setIdnOauth1AAccessTokensById(Collection<IdnOauth1AAccessToken> idnOauth1AAccessTokensById) {
        this.idnOauth1AAccessTokensById = idnOauth1AAccessTokensById;
    }

    @OneToMany(mappedBy = "idnOauthConsumerAppsByConsumerKeyId")
    public Collection<IdnOauth1ARequestToken> getIdnOauth1ARequestTokensById() {
        return idnOauth1ARequestTokensById;
    }

    public void setIdnOauth1ARequestTokensById(Collection<IdnOauth1ARequestToken> idnOauth1ARequestTokensById) {
        this.idnOauth1ARequestTokensById = idnOauth1ARequestTokensById;
    }

    @OneToMany(mappedBy = "idnOauthConsumerAppsByConsumerKeyId")
    public Collection<IdnOauth2AccessToken> getIdnOauth2AccessTokensById() {
        return idnOauth2AccessTokensById;
    }

    public void setIdnOauth2AccessTokensById(Collection<IdnOauth2AccessToken> idnOauth2AccessTokensById) {
        this.idnOauth2AccessTokensById = idnOauth2AccessTokensById;
    }

    @OneToMany(mappedBy = "idnOauthConsumerAppsByConsumerKeyId")
    public Collection<IdnOauth2AuthorizationCode> getIdnOauth2AuthorizationCodesById() {
        return idnOauth2AuthorizationCodesById;
    }

    public void setIdnOauth2AuthorizationCodesById(Collection<IdnOauth2AuthorizationCode> idnOauth2AuthorizationCodesById) {
        this.idnOauth2AuthorizationCodesById = idnOauth2AuthorizationCodesById;
    }
}
