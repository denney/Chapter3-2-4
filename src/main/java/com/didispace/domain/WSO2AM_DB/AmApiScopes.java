package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API_SCOPES", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApiScopes {
    private int apiId;
    private int scopeId;
    private AmApi amApiByApiId;
    private IdnOauth2Scope idnOauth2ScopeByScopeId;

    @Basic
    @Column(name = "API_ID")
    public int getApiId() {
        return apiId;
    }

    public void setApiId(int apiId) {
        this.apiId = apiId;
    }

    @Basic
    @Column(name = "SCOPE_ID")
    public int getScopeId() {
        return scopeId;
    }

    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmApiScopes that = (AmApiScopes) o;

        if (apiId != that.apiId) return false;
        if (scopeId != that.scopeId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = apiId;
        result = 31 * result + scopeId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "API_ID", referencedColumnName = "API_ID", nullable = false)
    public AmApi getAmApiByApiId() {
        return amApiByApiId;
    }

    public void setAmApiByApiId(AmApi amApiByApiId) {
        this.amApiByApiId = amApiByApiId;
    }

    @ManyToOne
    @JoinColumn(name = "SCOPE_ID", referencedColumnName = "SCOPE_ID", nullable = false)
    public IdnOauth2Scope getIdnOauth2ScopeByScopeId() {
        return idnOauth2ScopeByScopeId;
    }

    public void setIdnOauth2ScopeByScopeId(IdnOauth2Scope idnOauth2ScopeByScopeId) {
        this.idnOauth2ScopeByScopeId = idnOauth2ScopeByScopeId;
    }
}
