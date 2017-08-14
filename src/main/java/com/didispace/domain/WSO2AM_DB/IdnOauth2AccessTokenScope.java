package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH2_ACCESS_TOKEN_SCOPE", schema = "PUBLIC", catalog = "WSO2AM_DB")
@IdClass(IdnOauth2AccessTokenScopePK.class)
public class IdnOauth2AccessTokenScope {
    private String tokenId;
    private String tokenScope;
    private Integer tenantId;
    private IdnOauth2AccessToken idnOauth2AccessTokenByTokenId;

    @Id
    @Column(name = "TOKEN_ID")
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Id
    @Column(name = "TOKEN_SCOPE")
    public String getTokenScope() {
        return tokenScope;
    }

    public void setTokenScope(String tokenScope) {
        this.tokenScope = tokenScope;
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

        IdnOauth2AccessTokenScope that = (IdnOauth2AccessTokenScope) o;

        if (tokenId != null ? !tokenId.equals(that.tokenId) : that.tokenId != null) return false;
        if (tokenScope != null ? !tokenScope.equals(that.tokenScope) : that.tokenScope != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tokenId != null ? tokenId.hashCode() : 0;
        result = 31 * result + (tokenScope != null ? tokenScope.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "TOKEN_ID", referencedColumnName = "TOKEN_ID", nullable = false)
    public IdnOauth2AccessToken getIdnOauth2AccessTokenByTokenId() {
        return idnOauth2AccessTokenByTokenId;
    }

    public void setIdnOauth2AccessTokenByTokenId(IdnOauth2AccessToken idnOauth2AccessTokenByTokenId) {
        this.idnOauth2AccessTokenByTokenId = idnOauth2AccessTokenByTokenId;
    }
}
