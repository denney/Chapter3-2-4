package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class UmDomainPK implements Serializable {
    private int umDomainId;
    private int umTenantId;

    @Column(name = "UM_DOMAIN_ID")
    @Id
    public int getUmDomainId() {
        return umDomainId;
    }

    public void setUmDomainId(int umDomainId) {
        this.umDomainId = umDomainId;
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

        UmDomainPK that = (UmDomainPK) o;

        if (umDomainId != that.umDomainId) return false;
        if (umTenantId != that.umTenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umDomainId;
        result = 31 * result + umTenantId;
        return result;
    }
}
