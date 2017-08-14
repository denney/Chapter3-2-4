package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH1A_ACCESS_TOKEN", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOauth1AAccessToken {
    private String accessToken;
    private String accessTokenSecret;
    private Integer consumerKeyId;
    private String scope;
    private String authzUser;
    private Integer tenantId;
    private IdnOauthConsumerApps idnOauthConsumerAppsByConsumerKeyId;

    @Id
    @Column(name = "ACCESS_TOKEN")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Basic
    @Column(name = "ACCESS_TOKEN_SECRET")
    public String getAccessTokenSecret() {
        return accessTokenSecret;
    }

    public void setAccessTokenSecret(String accessTokenSecret) {
        this.accessTokenSecret = accessTokenSecret;
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
    @Column(name = "SCOPE")
    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
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

        IdnOauth1AAccessToken that = (IdnOauth1AAccessToken) o;

        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (accessTokenSecret != null ? !accessTokenSecret.equals(that.accessTokenSecret) : that.accessTokenSecret != null)
            return false;
        if (consumerKeyId != null ? !consumerKeyId.equals(that.consumerKeyId) : that.consumerKeyId != null)
            return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (authzUser != null ? !authzUser.equals(that.authzUser) : that.authzUser != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = accessToken != null ? accessToken.hashCode() : 0;
        result = 31 * result + (accessTokenSecret != null ? accessTokenSecret.hashCode() : 0);
        result = 31 * result + (consumerKeyId != null ? consumerKeyId.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
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
