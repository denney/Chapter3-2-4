package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH2_RESOURCE_SCOPE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOauth2ResourceScope {
    private String resourcePath;
    private int scopeId;
    private Integer tenantId;
    private IdnOauth2Scope idnOauth2ScopeByScopeId;

    @Id
    @Column(name = "RESOURCE_PATH")
    public String getResourcePath() {
        return resourcePath;
    }

    public void setResourcePath(String resourcePath) {
        this.resourcePath = resourcePath;
    }

    @Basic
    @Column(name = "SCOPE_ID")
    public int getScopeId() {
        return scopeId;
    }

    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
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

        IdnOauth2ResourceScope that = (IdnOauth2ResourceScope) o;

        if (scopeId != that.scopeId) return false;
        if (resourcePath != null ? !resourcePath.equals(that.resourcePath) : that.resourcePath != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = resourcePath != null ? resourcePath.hashCode() : 0;
        result = 31 * result + scopeId;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
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
