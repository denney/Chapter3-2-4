package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_ROLE_PERMISSION", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmRolePermissionPK.class)
public class UmRolePermission {
    private int umId;
    private int umPermissionId;
    private String umRoleName;
    private short umIsAllowed;
    private int umTenantId;
    private Integer umDomainId;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_PERMISSION_ID")
    public int getUmPermissionId() {
        return umPermissionId;
    }

    public void setUmPermissionId(int umPermissionId) {
        this.umPermissionId = umPermissionId;
    }

    @Basic
    @Column(name = "UM_ROLE_NAME")
    public String getUmRoleName() {
        return umRoleName;
    }

    public void setUmRoleName(String umRoleName) {
        this.umRoleName = umRoleName;
    }

    @Basic
    @Column(name = "UM_IS_ALLOWED")
    public short getUmIsAllowed() {
        return umIsAllowed;
    }

    public void setUmIsAllowed(short umIsAllowed) {
        this.umIsAllowed = umIsAllowed;
    }

    @Id
    @Column(name = "UM_TENANT_ID")
    public int getUmTenantId() {
        return umTenantId;
    }

    public void setUmTenantId(int umTenantId) {
        this.umTenantId = umTenantId;
    }

    @Basic
    @Column(name = "UM_DOMAIN_ID")
    public Integer getUmDomainId() {
        return umDomainId;
    }

    public void setUmDomainId(Integer umDomainId) {
        this.umDomainId = umDomainId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmRolePermission that = (UmRolePermission) o;

        if (umId != that.umId) return false;
        if (umPermissionId != that.umPermissionId) return false;
        if (umIsAllowed != that.umIsAllowed) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umRoleName != null ? !umRoleName.equals(that.umRoleName) : that.umRoleName != null) return false;
        if (umDomainId != null ? !umDomainId.equals(that.umDomainId) : that.umDomainId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + umPermissionId;
        result = 31 * result + (umRoleName != null ? umRoleName.hashCode() : 0);
        result = 31 * result + (int) umIsAllowed;
        result = 31 * result + umTenantId;
        result = 31 * result + (umDomainId != null ? umDomainId.hashCode() : 0);
        return result;
    }
}
