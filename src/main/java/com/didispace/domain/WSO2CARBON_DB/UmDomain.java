package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_DOMAIN", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmDomainPK.class)
public class UmDomain {
    private int umDomainId;
    private String umDomainName;
    private int umTenantId;

    @Id
    @Column(name = "UM_DOMAIN_ID")
    public int getUmDomainId() {
        return umDomainId;
    }

    public void setUmDomainId(int umDomainId) {
        this.umDomainId = umDomainId;
    }

    @Basic
    @Column(name = "UM_DOMAIN_NAME")
    public String getUmDomainName() {
        return umDomainName;
    }

    public void setUmDomainName(String umDomainName) {
        this.umDomainName = umDomainName;
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

        UmDomain umDomain = (UmDomain) o;

        if (umDomainId != umDomain.umDomainId) return false;
        if (umTenantId != umDomain.umTenantId) return false;
        if (umDomainName != null ? !umDomainName.equals(umDomain.umDomainName) : umDomain.umDomainName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umDomainId;
        result = 31 * result + (umDomainName != null ? umDomainName.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
