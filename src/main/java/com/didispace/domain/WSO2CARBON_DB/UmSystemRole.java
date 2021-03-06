package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_SYSTEM_ROLE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmSystemRolePK.class)
public class UmSystemRole {
    private int umId;
    private String umRoleName;
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
    @Column(name = "UM_ROLE_NAME")
    public String getUmRoleName() {
        return umRoleName;
    }

    public void setUmRoleName(String umRoleName) {
        this.umRoleName = umRoleName;
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

        UmSystemRole that = (UmSystemRole) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umRoleName != null ? !umRoleName.equals(that.umRoleName) : that.umRoleName != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umRoleName != null ? umRoleName.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
