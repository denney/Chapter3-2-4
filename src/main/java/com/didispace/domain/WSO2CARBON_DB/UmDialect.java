package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_DIALECT", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmDialectPK.class)
public class UmDialect {
    private int umId;
    private String umDialectUri;
    private int umTenantId;
    private UmClaim umClaimByUmTenantId;

    @Id
    @Column(name = "UM_ID")
    public int getUmId() {
        return umId;
    }

    public void setUmId(int umId) {
        this.umId = umId;
    }

    @Basic
    @Column(name = "UM_DIALECT_URI")
    public String getUmDialectUri() {
        return umDialectUri;
    }

    public void setUmDialectUri(String umDialectUri) {
        this.umDialectUri = umDialectUri;
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

        UmDialect umDialect = (UmDialect) o;

        if (umId != umDialect.umId) return false;
        if (umTenantId != umDialect.umTenantId) return false;
        if (umDialectUri != null ? !umDialectUri.equals(umDialect.umDialectUri) : umDialect.umDialectUri != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umDialectUri != null ? umDialectUri.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "UM_TENANT_ID", referencedColumnName = "UM_TENANT_ID", nullable = false)
    public UmClaim getUmClaimByUmTenantId() {
        return umClaimByUmTenantId;
    }

    public void setUmClaimByUmTenantId(UmClaim umClaimByUmTenantId) {
        this.umClaimByUmTenantId = umClaimByUmTenantId;
    }
}
