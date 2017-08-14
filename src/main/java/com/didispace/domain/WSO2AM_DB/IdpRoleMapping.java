package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_ROLE_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpRoleMapping {
    private int id;
    private Integer idpRoleId;
    private Integer tenantId;
    private String userStoreId;
    private String localRole;
    private IdpRole idpRoleByIdpRoleId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IDP_ROLE_ID")
    public Integer getIdpRoleId() {
        return idpRoleId;
    }

    public void setIdpRoleId(Integer idpRoleId) {
        this.idpRoleId = idpRoleId;
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
    @Column(name = "USER_STORE_ID")
    public String getUserStoreId() {
        return userStoreId;
    }

    public void setUserStoreId(String userStoreId) {
        this.userStoreId = userStoreId;
    }

    @Basic
    @Column(name = "LOCAL_ROLE")
    public String getLocalRole() {
        return localRole;
    }

    public void setLocalRole(String localRole) {
        this.localRole = localRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpRoleMapping that = (IdpRoleMapping) o;

        if (id != that.id) return false;
        if (idpRoleId != null ? !idpRoleId.equals(that.idpRoleId) : that.idpRoleId != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (userStoreId != null ? !userStoreId.equals(that.userStoreId) : that.userStoreId != null) return false;
        if (localRole != null ? !localRole.equals(that.localRole) : that.localRole != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idpRoleId != null ? idpRoleId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (userStoreId != null ? userStoreId.hashCode() : 0);
        result = 31 * result + (localRole != null ? localRole.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDP_ROLE_ID", referencedColumnName = "ID")
    public IdpRole getIdpRoleByIdpRoleId() {
        return idpRoleByIdpRoleId;
    }

    public void setIdpRoleByIdpRoleId(IdpRole idpRoleByIdpRoleId) {
        this.idpRoleByIdpRoleId = idpRoleByIdpRoleId;
    }
}
