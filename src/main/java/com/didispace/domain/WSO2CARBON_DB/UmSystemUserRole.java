package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_SYSTEM_USER_ROLE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmSystemUserRolePK.class)
public class UmSystemUserRole {
    private int umId;
    private String umUserName;
    private int umRoleId;
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
    @Column(name = "UM_USER_NAME")
    public String getUmUserName() {
        return umUserName;
    }

    public void setUmUserName(String umUserName) {
        this.umUserName = umUserName;
    }

    @Basic
    @Column(name = "UM_ROLE_ID")
    public int getUmRoleId() {
        return umRoleId;
    }

    public void setUmRoleId(int umRoleId) {
        this.umRoleId = umRoleId;
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

        UmSystemUserRole that = (UmSystemUserRole) o;

        if (umId != that.umId) return false;
        if (umRoleId != that.umRoleId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umUserName != null ? !umUserName.equals(that.umUserName) : that.umUserName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umUserName != null ? umUserName.hashCode() : 0);
        result = 31 * result + umRoleId;
        result = 31 * result + umTenantId;
        return result;
    }
}
