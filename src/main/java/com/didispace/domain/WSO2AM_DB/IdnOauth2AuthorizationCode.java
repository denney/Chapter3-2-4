package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH2_AUTHORIZATION_CODE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOauth2AuthorizationCode {
    private String codeId;
    private String authorizationCode;
    private Integer consumerKeyId;
    private String callbackUrl;
    private String scope;
    private String authzUser;
    private Integer tenantId;
    private String userDomain;
    private Timestamp timeCreated;
    private Long validityPeriod;
    private String state;
    private String tokenId;
    private String subjectIdentifier;
    private String pkceCodeChallenge;
    private String pkceCodeChallengeMethod;
    private IdnOauthConsumerApps idnOauthConsumerAppsByConsumerKeyId;

    @Id
    @Column(name = "CODE_ID")
    public String getCodeId() {
        return codeId;
    }

    public void setCodeId(String codeId) {
        this.codeId = codeId;
    }

    @Basic
    @Column(name = "AUTHORIZATION_CODE")
    public String getAuthorizationCode() {
        return authorizationCode;
    }

    public void setAuthorizationCode(String authorizationCode) {
        this.authorizationCode = authorizationCode;
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
    @Column(name = "TIME_CREATED")
    public Timestamp getTimeCreated() {
        return timeCreated;
    }

    public void setTimeCreated(Timestamp timeCreated) {
        this.timeCreated = timeCreated;
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
    @Column(name = "STATE")
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Basic
    @Column(name = "TOKEN_ID")
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Basic
    @Column(name = "SUBJECT_IDENTIFIER")
    public String getSubjectIdentifier() {
        return subjectIdentifier;
    }

    public void setSubjectIdentifier(String subjectIdentifier) {
        this.subjectIdentifier = subjectIdentifier;
    }

    @Basic
    @Column(name = "PKCE_CODE_CHALLENGE")
    public String getPkceCodeChallenge() {
        return pkceCodeChallenge;
    }

    public void setPkceCodeChallenge(String pkceCodeChallenge) {
        this.pkceCodeChallenge = pkceCodeChallenge;
    }

    @Basic
    @Column(name = "PKCE_CODE_CHALLENGE_METHOD")
    public String getPkceCodeChallengeMethod() {
        return pkceCodeChallengeMethod;
    }

    public void setPkceCodeChallengeMethod(String pkceCodeChallengeMethod) {
        this.pkceCodeChallengeMethod = pkceCodeChallengeMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOauth2AuthorizationCode that = (IdnOauth2AuthorizationCode) o;

        if (codeId != null ? !codeId.equals(that.codeId) : that.codeId != null) return false;
        if (authorizationCode != null ? !authorizationCode.equals(that.authorizationCode) : that.authorizationCode != null)
            return false;
        if (consumerKeyId != null ? !consumerKeyId.equals(that.consumerKeyId) : that.consumerKeyId != null)
            return false;
        if (callbackUrl != null ? !callbackUrl.equals(that.callbackUrl) : that.callbackUrl != null) return false;
        if (scope != null ? !scope.equals(that.scope) : that.scope != null) return false;
        if (authzUser != null ? !authzUser.equals(that.authzUser) : that.authzUser != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (userDomain != null ? !userDomain.equals(that.userDomain) : that.userDomain != null) return false;
        if (timeCreated != null ? !timeCreated.equals(that.timeCreated) : that.timeCreated != null) return false;
        if (validityPeriod != null ? !validityPeriod.equals(that.validityPeriod) : that.validityPeriod != null)
            return false;
        if (state != null ? !state.equals(that.state) : that.state != null) return false;
        if (tokenId != null ? !tokenId.equals(that.tokenId) : that.tokenId != null) return false;
        if (subjectIdentifier != null ? !subjectIdentifier.equals(that.subjectIdentifier) : that.subjectIdentifier != null)
            return false;
        if (pkceCodeChallenge != null ? !pkceCodeChallenge.equals(that.pkceCodeChallenge) : that.pkceCodeChallenge != null)
            return false;
        if (pkceCodeChallengeMethod != null ? !pkceCodeChallengeMethod.equals(that.pkceCodeChallengeMethod) : that.pkceCodeChallengeMethod != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = codeId != null ? codeId.hashCode() : 0;
        result = 31 * result + (authorizationCode != null ? authorizationCode.hashCode() : 0);
        result = 31 * result + (consumerKeyId != null ? consumerKeyId.hashCode() : 0);
        result = 31 * result + (callbackUrl != null ? callbackUrl.hashCode() : 0);
        result = 31 * result + (scope != null ? scope.hashCode() : 0);
        result = 31 * result + (authzUser != null ? authzUser.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (userDomain != null ? userDomain.hashCode() : 0);
        result = 31 * result + (timeCreated != null ? timeCreated.hashCode() : 0);
        result = 31 * result + (validityPeriod != null ? validityPeriod.hashCode() : 0);
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (tokenId != null ? tokenId.hashCode() : 0);
        result = 31 * result + (subjectIdentifier != null ? subjectIdentifier.hashCode() : 0);
        result = 31 * result + (pkceCodeChallenge != null ? pkceCodeChallenge.hashCode() : 0);
        result = 31 * result + (pkceCodeChallengeMethod != null ? pkceCodeChallengeMethod.hashCode() : 0);
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
