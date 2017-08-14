package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "SP_CLAIM_MAPPING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class SpClaimMapping {
    private int id;
    private int tenantId;
    private String idpClaim;
    private String spClaim;
    private int appId;
    private String isRequested;
    private String isMandatory;
    private String defaultValue;
    private SpApp spAppByAppId;

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
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "IDP_CLAIM")
    public String getIdpClaim() {
        return idpClaim;
    }

    public void setIdpClaim(String idpClaim) {
        this.idpClaim = idpClaim;
    }

    @Basic
    @Column(name = "SP_CLAIM")
    public String getSpClaim() {
        return spClaim;
    }

    public void setSpClaim(String spClaim) {
        this.spClaim = spClaim;
    }

    @Basic
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Basic
    @Column(name = "IS_REQUESTED")
    public String getIsRequested() {
        return isRequested;
    }

    public void setIsRequested(String isRequested) {
        this.isRequested = isRequested;
    }

    @Basic
    @Column(name = "IS_MANDATORY")
    public String getIsMandatory() {
        return isMandatory;
    }

    public void setIsMandatory(String isMandatory) {
        this.isMandatory = isMandatory;
    }

    @Basic
    @Column(name = "DEFAULT_VALUE")
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SpClaimMapping that = (SpClaimMapping) o;

        if (id != that.id) return false;
        if (tenantId != that.tenantId) return false;
        if (appId != that.appId) return false;
        if (idpClaim != null ? !idpClaim.equals(that.idpClaim) : that.idpClaim != null) return false;
        if (spClaim != null ? !spClaim.equals(that.spClaim) : that.spClaim != null) return false;
        if (isRequested != null ? !isRequested.equals(that.isRequested) : that.isRequested != null) return false;
        if (isMandatory != null ? !isMandatory.equals(that.isMandatory) : that.isMandatory != null) return false;
        if (defaultValue != null ? !defaultValue.equals(that.defaultValue) : that.defaultValue != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + tenantId;
        result = 31 * result + (idpClaim != null ? idpClaim.hashCode() : 0);
        result = 31 * result + (spClaim != null ? spClaim.hashCode() : 0);
        result = 31 * result + appId;
        result = 31 * result + (isRequested != null ? isRequested.hashCode() : 0);
        result = 31 * result + (isMandatory != null ? isMandatory.hashCode() : 0);
        result = 31 * result + (defaultValue != null ? defaultValue.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "APP_ID", referencedColumnName = "ID", nullable = false)
    public SpApp getSpAppByAppId() {
        return spAppByAppId;
    }

    public void setSpAppByAppId(SpApp spAppByAppId) {
        this.spAppByAppId = spAppByAppId;
    }
}
