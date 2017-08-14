package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_ROLE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmRolePK.class)
public class UmRole {
    private int umId;
    private String umRoleName;
    private int umTenantId;
    private Boolean umSharedRole;

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

    @Basic
    @Column(name = "UM_SHARED_ROLE")
    public Boolean getUmSharedRole() {
        return umSharedRole;
    }

    public void setUmSharedRole(Boolean umSharedRole) {
        this.umSharedRole = umSharedRole;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UmRole umRole = (UmRole) o;

        if (umId != umRole.umId) return false;
        if (umTenantId != umRole.umTenantId) return false;
        if (umRoleName != null ? !umRoleName.equals(umRole.umRoleName) : umRole.umRoleName != null) return false;
        if (umSharedRole != null ? !umSharedRole.equals(umRole.umSharedRole) : umRole.umSharedRole != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umRoleName != null ? umRoleName.hashCode() : 0);
        result = 31 * result + umTenantId;
        result = 31 * result + (umSharedRole != null ? umSharedRole.hashCode() : 0);
        return result;
    }
}
