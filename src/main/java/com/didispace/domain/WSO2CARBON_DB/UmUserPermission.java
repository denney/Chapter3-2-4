package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_USER_PERMISSION", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmUserPermissionPK.class)
public class UmUserPermission {
    private int umId;
    private int umPermissionId;
    private String umUserName;
    private short umIsAllowed;
    private int umTenantId;

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
    @Column(name = "UM_USER_NAME")
    public String getUmUserName() {
        return umUserName;
    }

    public void setUmUserName(String umUserName) {
        this.umUserName = umUserName;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmUserPermission that = (UmUserPermission) o;

        if (umId != that.umId) return false;
        if (umPermissionId != that.umPermissionId) return false;
        if (umIsAllowed != that.umIsAllowed) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umUserName != null ? !umUserName.equals(that.umUserName) : that.umUserName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + umPermissionId;
        result = 31 * result + (umUserName != null ? umUserName.hashCode() : 0);
        result = 31 * result + (int) umIsAllowed;
        result = 31 * result + umTenantId;
        return result;
    }
}
