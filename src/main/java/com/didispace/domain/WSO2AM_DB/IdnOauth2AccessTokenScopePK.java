package com.didispace.domain.WSO2AM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class IdnOauth2AccessTokenScopePK implements Serializable {
    private String tokenId;
    private String tokenScope;

    @Column(name = "TOKEN_ID")
    @Id
    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    @Column(name = "TOKEN_SCOPE")
    @Id
    public String getTokenScope() {
        return tokenScope;
    }

    public void setTokenScope(String tokenScope) {
        this.tokenScope = tokenScope;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOauth2AccessTokenScopePK that = (IdnOauth2AccessTokenScopePK) o;

        if (tokenId != null ? !tokenId.equals(that.tokenId) : that.tokenId != null) return false;
        if (tokenScope != null ? !tokenScope.equals(that.tokenScope) : that.tokenScope != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = tokenId != null ? tokenId.hashCode() : 0;
        result = 31 * result + (tokenScope != null ? tokenScope.hashCode() : 0);
        return result;
    }
}
