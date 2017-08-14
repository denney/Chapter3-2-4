package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "IDP_LOCAL_CLAIM", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class IdpLocalClaim {
    private int id;
    private Integer tenantId;
    private Integer idpId;
    private String claimUri;
    private String defaultValue;
    private String isRequested;
    private Idp idpByIdpId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
    @Column(name = "IDP_ID")
    public Integer getIdpId() {
        return idpId;
    }

    public void setIdpId(Integer idpId) {
        this.idpId = idpId;
    }

    @Basic
    @Column(name = "CLAIM_URI")
    public String getClaimUri() {
        return claimUri;
    }

    public void setClaimUri(String claimUri) {
        this.claimUri = claimUri;
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

        IdpLocalClaim that = (IdpLocalClaim) o;

        if (id != that.id) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;
        if (idpId != null ? !idpId.equals(that.idpId) : that.idpId != null) return false;
        if (claimUri != null ? !claimUri.equals(that.claimUri) : that.claimUri != null) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;
        if (isRequested != null ? !isRequested.equals(that.isRequested) : that.isRequested != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        result = 31 * result + (idpId != null ? idpId.hashCode() : 0);
        result = 31 * result + (claimUri != null ? claimUri.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        result = 31 * result + (isRequested != null ? isRequested.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "IDP_ID", referencedColumnName = "ID")
    public Idp getIdpByIdpId() {
        return idpByIdpId;
    }

    public void setIdpByIdpId(Idp idpByIdpId) {
        this.idpByIdpId = idpByIdpId;
    }
}
