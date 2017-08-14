package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class UmUserRolePK implements Serializable {
    private int umId;
    private int umTenantId;

    @Column(name = "UM_ID")
    @Id
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Column(name = "UM_TENANT_ID")
    @Id
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

        UmUserRolePK that = (UmUserRolePK) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + umTenantId;
        return result;
    }
}
