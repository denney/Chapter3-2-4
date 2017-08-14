package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH1A_REQUEST_TOKEN", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOauth1ARequestToken {
    private String requestToken;
    private String requestTokenSecret;
    private Integer consumerKeyId;
    private String callbackUrl;
    private String scope;
    private String authorized;
    private String oauthVerifier;
    private String authzUser;
    private Integer tenantId;
    private IdnOauthConsumerApps idnOauthConsumerAppsByConsumerKeyId;

    @Id
    @Column(name = "REQUEST_TOKEN")
    public String getRequestToken() {
        return requestToken;
    }

    public void setRequestToken(String requestToken) {
        this.requestToken = requestToken;
    }

    @Basic
    @Column(name = "REQUEST_TOKEN_SECRET")
    public String getRequestTokenSecret() {
        return requestTokenSecret;
    }

    public void setRequestTokenSecret(String requestTokenSecret) {
        this.requestTokenSecret = requestTokenSecret;
    }

    @Basic
    @Column(name = "CONSUMER_KEY_ID")
    public Integer getConsumerKeyId() {
        return consumerKeyId;
    }

    public void setConsumerKeyId(Integer consumerKeyId) {
        this.consumerKeyId = consumerKeyId;
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
    @Column(name = "SCOPE")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    @Basic
    @Column(name = "AUTHORIZED")
    public String getAuthorized() {
        return authorized;
    }

    public void setAuthorized(String authorized) {
        this.authorized = authorized;
    }

    @Basic
    @Column(name = "OAUTH_VERIFIER")
    public String getOauthVerifier() {
        return oauthVerifier;
    }

    public void setOauthVerifier(String oauthVerifier) {
        this.oauthVerifier = oauthVerifier;
    }

    @Basic
    @Column(name = "AUTHZ_USER")
    public String getAuthzUser() {
        return authzUser;
    }

    public void setAuthzUser(String authzUser) {
        this.authzUser = authzUser;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOauth1ARequestToken that = (IdnOauth1ARequestToken) o;

        if (requestToken != null ? !requestToken.equals(that.requestToken) : that.requestToken != null) return false;
        if (requestTokenSecret != null ? !requestTokenSecret.equals(that.requestTokenSecret) : that.requestTokenSecret != null)
            return false;
        if (consumerKeyId != null ? !consumerKeyId.equals(that.consumerKeyId) : that.consumerKeyId != null)
            return false;
        if (callbackUrl != null ? !callbackUrl.equals(that.callbackUrl) : that.callbackUrl != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (authorized != null ? !authorized.equals(that.authorized) : that.authorized != null) return false;
        if (oauthVerifier != null ? !oauthVerifier.equals(that.oauthVerifier) : that.oauthVerifier != null)
            return false;
        if (authzUser != null ? !authzUser.equals(that.authzUser) : that.authzUser != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = requestToken != null ? requestToken.hashCode() : 0;
        result = 31 * result + (requestTokenSecret != null ? requestTokenSecret.hashCode() : 0);
        result = 31 * result + (consumerKeyId != null ? consumerKeyId.hashCode() : 0);
        result = 31 * result + (callbackUrl != null ? callbackUrl.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (authorized != null ? authorized.hashCode() : 0);
        result = 31 * result + (oauthVerifier != null ? oauthVerifier.hashCode() : 0);
        result = 31 * result + (authzUser != null ? authzUser.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CONSUMER_KEY_ID", referencedColumnName = "ID")
    public IdnOauthConsumerApps getIdnOauthConsumerAppsByConsumerKeyId() {
        return idnOauthConsumerAppsByConsumerKeyId;
    }

    public void setIdnOauthConsumerAppsByConsumerKeyId(IdnOauthConsumerApps idnOauthConsumerAppsByConsumerKeyId) {
        this.idnOauthConsumerAppsByConsumerKeyId = idnOauthConsumerAppsByConsumerKeyId;
    }
}
