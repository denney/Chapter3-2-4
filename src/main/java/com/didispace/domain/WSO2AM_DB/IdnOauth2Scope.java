package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDN_OAUTH2_SCOPE", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdnOauth2Scope {
    private int scopeId;
    private String scopeKey;
    private String name;
    private String description;
    private int tenantId;
    private String roles;
    private Collection<AmApiScopes> amApiScopesByScopeId;
    private Collection<IdnOauth2ResourceScope> idnOauth2ResourceScopesByScopeId;

    @Id
    @Column(name = "SCOPE_ID")
    public int getScopeId() {
        return scopeId;
    }

    public void setScopeId(int scopeId) {
        this.scopeId = scopeId;
    }

    @Basic
    @Column(name = "SCOPE_KEY")
    public String getScopeKey() {
        return scopeKey;
    }

    public void setScopeKey(String scopeKey) {
        this.scopeKey = scopeKey;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "ROLES")
    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdnOauth2Scope that = (IdnOauth2Scope) o;

        if (scopeId != that.scopeId) return false;
        if (tenantId != that.tenantId) return false;
        if (scopeKey != null ? !scopeKey.equals(that.scopeKey) : that.scopeKey != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (roles != null ? !roles.equals(that.roles) : that.roles != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = scopeId;
        result = 31 * result + (scopeKey != null ? scopeKey.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (roles != null ? roles.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "idnOauth2ScopeByScopeId")
    public Collection<AmApiScopes> getAmApiScopesByScopeId() {
        return amApiScopesByScopeId;
    }

    public void setAmApiScopesByScopeId(Collection<AmApiScopes> amApiScopesByScopeId) {
        this.amApiScopesByScopeId = amApiScopesByScopeId;
    }

    @OneToMany(mappedBy = "idnOauth2ScopeByScopeId")
    public Collection<IdnOauth2ResourceScope> getIdnOauth2ResourceScopesByScopeId() {
        return idnOauth2ResourceScopesByScopeId;
    }

    public void setIdnOauth2ResourceScopesByScopeId(Collection<IdnOauth2ResourceScope> idnOauth2ResourceScopesByScopeId) {
        this.idnOauth2ResourceScopesByScopeId = idnOauth2ResourceScopesByScopeId;
    }
}
