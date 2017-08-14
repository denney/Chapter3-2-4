package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_USER_ROLE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmUserRolePK.class)
public class UmUserRole {
    private int umId;
    private int umRoleId;
    private int umUserId;
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
    @Column(name = "UM_ROLE_ID")
    public int getUmRoleId() {
        return umRoleId;
    }

    public void setUmRoleId(int umRoleId) {
        this.umRoleId = umRoleId;
    }

    @Basic
    @Column(name = "UM_USER_ID")
    public int getUmUserId() {
        return umUserId;
    }

    public void setUmUserId(int umUserId) {
        this.umUserId = umUserId;
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

        UmUserRole that = (UmUserRole) o;

        if (umId != that.umId) return false;
        if (umRoleId != that.umRoleId) return false;
        if (umUserId != that.umUserId) return false;
        if (umTenantId != that.umTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + umRoleId;
        result = 31 * result + umUserId;
        result = 31 * result + umTenantId;
        return result;
    }
}
