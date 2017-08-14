package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH2_ACCESS_TOKEN", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOauth2AccessToken {
    private String tokenId;
    private String accessToken;
    private String refreshToken;
    private Integer consumerKeyId;
    private String authzUser;
    private Integer tenantId;
    private String userDomain;
    private String userType;
    private String grantType;
    private Timestamp timeCreated;
    private Timestamp refreshTokenTimeCreated;
    private Long validityPeriod;
    private Long refreshTokenValidityPeriod;
    private String tokenScopeHash;
    private String tokenState;
    private String tokenStateId;
    private String subjectIdentifier;
    private IdnOauthConsumerApps idnOauthConsumerAppsByConsumerKeyId;
    private Collection<IdnOauth2AccessTokenScope> idnOauth2AccessTokenScopesByTokenId;

    @Id
    @Column(name = "TOKEN_ID")
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Basic
    @Column(name = "ACCESS_TOKEN")
    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Basic
    @Column(name = "REFRESH_TOKEN")
    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
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

    @Basic
    @Column(name = "USER_DOMAIN")
    public String getUserDomain() {
        return userDomain;
    }

    public void setUserDomain(String userDomain) {
        this.userDomain = userDomain;
    }

    @Basic
    @Column(name = "USER_TYPE")
    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    @Basic
    @Column(name = "GRANT_TYPE")
    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    @Basic
    @Column(name = "TIME_CREATED")
    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
    }

    @Basic
    @Column(name = "REFRESH_TOKEN_TIME_CREATED")
    public Timestamp getRefreshTokenTimeCreated() {
        return refreshTokenTimeCreated;
    }

    public void setRefreshTokenTimeCreated(Timestamp refreshTokenTimeCreated) {
        this.refreshTokenTimeCreated = refreshTokenTimeCreated;
    }

    @Basic
    @Column(name = "VALIDITY_PERIOD")
    public Long getValidityPeriod() {
        return validityPeriod;
    }

    public void setValidityPeriod(Long validityPeriod) {
        this.validityPeriod = validityPeriod;
    }

    @Basic
    @Column(name = "REFRESH_TOKEN_VALIDITY_PERIOD")
    public Long getRefreshTokenValidityPeriod() {
        return refreshTokenValidityPeriod;
    }

    public void setRefreshTokenValidityPeriod(Long refreshTokenValidityPeriod) {
        this.refreshTokenValidityPeriod = refreshTokenValidityPeriod;
    }

    @Basic
    @Column(name = "TOKEN_SCOPE_HASH")
    public String getTokenScopeHash() {
        return tokenScopeHash;
    }

    public void setTokenScopeHash(String tokenScopeHash) {
        this.tokenScopeHash = tokenScopeHash;
    }

    @Basic
    @Column(name = "TOKEN_STATE")
    public String getTokenState() {
        return tokenState;
    }

    public void setTokenState(String tokenState) {
        this.tokenState = tokenState;
    }

    @Basic
    @Column(name = "TOKEN_STATE_ID")
    public String getTokenStateId() {
        return tokenStateId;
    }

    public void setTokenStateId(String tokenStateId) {
        this.tokenStateId = tokenStateId;
    }

    @Basic
    @Column(name = "SUBJECT_IDENTIFIER")
    public String getSubjectIdentifier() {
        return subjectIdentifier;
    }

    public void setSubjectIdentifier(String subjectIdentifier) {
        this.subjectIdentifier = subjectIdentifier;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOauth2AccessToken that = (IdnOauth2AccessToken) o;

        if (tokenId != null ? !tokenId.equals(that.tokenId) : that.tokenId != null) return false;
        if (accessToken != null ? !accessToken.equals(that.accessToken) : that.accessToken != null) return false;
        if (refreshToken != null ? !refreshToken.equals(that.refreshToken) : that.refreshToken != null) return false;
        if (consumerKeyId != null ? !consumerKeyId.equals(that.consumerKeyId) : that.consumerKeyId != null)
            return false;
        if (authzUser != null ? !authzUser.equals(that.authzUser) : that.authzUser != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (userDomain != null ? !userDomain.equals(that.userDomain) : that.userDomain != null) return false;
        if (userType != null ? !userType.equals(that.userType) : that.userType != null) return false;
        if (grantType != null ? !grantType.equals(that.grantType) : that.grantType != null) return false;
        if (timeCreated != null ? !timeCreated.equals(that.timeCreated) : that.timeCreated != null) return false;
        if (refreshTokenTimeCreated != null ? !refreshTokenTimeCreated.equals(that.refreshTokenTimeCreated) : that.refreshTokenTimeCreated != null)
            return false;
        if (validityPeriod != null ? !validityPeriod.equals(that.validityPeriod) : that.validityPeriod != null)
            return false;
        if (refreshTokenValidityPeriod != null ? !refreshTokenValidityPeriod.equals(that.refreshTokenValidityPeriod) : that.refreshTokenValidityPeriod != null)
            return false;
        if (tokenScopeHash != null ? !tokenScopeHash.equals(that.tokenScopeHash) : that.tokenScopeHash != null)
            return false;
        if (tokenState != null ? !tokenState.equals(that.tokenState) : that.tokenState != null) return false;
        if (tokenStateId != null ? !tokenStateId.equals(that.tokenStateId) : that.tokenStateId != null) return false;
        if (subjectIdentifier != null ? !subjectIdentifier.equals(that.subjectIdentifier) : that.subjectIdentifier != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tokenId != null ? tokenId.hashCode() : 0;
        result = 31 * result + (accessToken != null ? accessToken.hashCode() : 0);
        result = 31 * result + (refreshToken != null ? refreshToken.hashCode() : 0);
        result = 31 * result + (consumerKeyId != null ? consumerKeyId.hashCode() : 0);
        result = 31 * result + (authzUser != null ? authzUser.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (userDomain != null ? userDomain.hashCode() : 0);
        result = 31 * result + (userType != null ? userType.hashCode() : 0);
        result = 31 * result + (grantType != null ? grantType.hashCode() : 0);
        result = 31 * result + (timeCreated != null ? timeCreated.hashCode() : 0);
        result = 31 * result + (refreshTokenTimeCreated != null ? refreshTokenTimeCreated.hashCode() : 0);
        result = 31 * result + (validityPeriod != null ? validityPeriod.hashCode() : 0);
        result = 31 * result + (refreshTokenValidityPeriod != null ? refreshTokenValidityPeriod.hashCode() : 0);
        result = 31 * result + (tokenScopeHash != null ? tokenScopeHash.hashCode() : 0);
        result = 31 * result + (tokenState != null ? tokenState.hashCode() : 0);
        result = 31 * result + (tokenStateId != null ? tokenStateId.hashCode() : 0);
        result = 31 * result + (subjectIdentifier != null ? subjectIdentifier.hashCode() : 0);
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

    @OneToMany(mappedBy = "idnOauth2AccessTokenByTokenId")
    public Collection<IdnOauth2AccessTokenScope> getIdnOauth2AccessTokenScopesByTokenId() {
        return idnOauth2AccessTokenScopesByTokenId;
    }

    public void setIdnOauth2AccessTokenScopesByTokenId(Collection<IdnOauth2AccessTokenScope> idnOauth2AccessTokenScopesByTokenId) {
        this.idnOauth2AccessTokenScopesByTokenId = idnOauth2AccessTokenScopesByTokenId;
    }
}
