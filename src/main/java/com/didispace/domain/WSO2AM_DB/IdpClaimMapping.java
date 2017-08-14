package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_CLAIM_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpClaimMapping {
    private int id;
    private Integer idpClaimId;
    private Integer tenantId;
    private String localClaim;
    private String defaultValue;
    private String isRequested;
    private IdpClaim idpClaimByIdpClaimId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "IDP_CLAIM_ID")
    public Integer getIdpClaimId() {
        return idpClaimId;
    }

    public void setIdpClaimId(Integer idpClaimId) {
        this.idpClaimId = idpClaimId;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "LOCAL_CLAIM")
    public String getLocalClaim() {
        return localClaim;
    }

    public void setLocalClaim(String localClaim) {
        this.localClaim = localClaim;
    }

    @Basic
    @Column(name = "DEFAULT_VALUE")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Basic
    @Column(name = "IS_REQUESTED")
    public String getIsRequested() {
        return isRequested;
    }

    public void setIsRequested(String isRequested) {
        this.isRequested = isRequested;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        IdpClaimMapping that = (IdpClaimMapping) o;

        if (id != that.id) return false;
        if (idpClaimId != null ? !idpClaimId.equals(that.idpClaimId) : that.idpClaimId != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (localClaim != null ? !localClaim.equals(that.localClaim) : that.localClaim != null) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
        if (isRequested != null ? !isRequested.equals(that.isRequested) : that.isRequested != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (idpClaimId != null ? idpClaimId.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (localClaim != null ? localClaim.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        result = 31 * result + (isRequested != null ? isRequested.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDP_CLAIM_ID", referencedColumnName = "ID")
    public IdpClaim getIdpClaimByIdpClaimId() {
        return idpClaimByIdpClaimId;
    }

    public void setIdpClaimByIdpClaimId(IdpClaim idpClaimByIdpClaimId) {
        this.idpClaimByIdpClaimId = idpClaimByIdpClaimId;
    }
}
