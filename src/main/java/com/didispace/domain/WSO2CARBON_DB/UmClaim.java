package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_CLAIM", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmClaimPK.class)
public class UmClaim {
    private int umId;
    private int umDialectId;
    private String umClaimUri;
    private String umDisplayTag;
    private String umDescription;
    private String umMappedAttributeDomain;
    private String umMappedAttribute;
    private String umRegEx;
    private Short umSupported;
    private Short umRequired;
    private Integer umDisplayOrder;
    private Short umCheckedAttribute;
    private Short umReadOnly;
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
    @Column(name = "UM_DIALECT_ID")
    public int getUmDialectId() {
        return umDialectId;
    }

    public void setUmDialectId(int umDialectId) {
        this.umDialectId = umDialectId;
    }

    @Basic
    @Column(name = "UM_CLAIM_URI")
    public String getUmClaimUri() {
        return umClaimUri;
    }

    public void setUmClaimUri(String umClaimUri) {
        this.umClaimUri = umClaimUri;
    }

    @Basic
    @Column(name = "UM_DISPLAY_TAG")
    public String getUmDisplayTag() {
        return umDisplayTag;
    }

    public void setUmDisplayTag(String umDisplayTag) {
        this.umDisplayTag = umDisplayTag;
    }

    @Basic
    @Column(name = "UM_DESCRIPTION")
    public String getUmDescription() {
        return umDescription;
    }

    public void setUmDescription(String umDescription) {
        this.umDescription = umDescription;
    }

    @Basic
    @Column(name = "UM_MAPPED_ATTRIBUTE_DOMAIN")
    public String getUmMappedAttributeDomain() {
        return umMappedAttributeDomain;
    }

    public void setUmMappedAttributeDomain(String umMappedAttributeDomain) {
        this.umMappedAttributeDomain = umMappedAttributeDomain;
    }

    @Basic
    @Column(name = "UM_MAPPED_ATTRIBUTE")
    public String getUmMappedAttribute() {
        return umMappedAttribute;
    }

    public void setUmMappedAttribute(String umMappedAttribute) {
        this.umMappedAttribute = umMappedAttribute;
    }

    @Basic
    @Column(name = "UM_REG_EX")
    public String getUmRegEx() {
        return umRegEx;
    }

    public void setUmRegEx(String umRegEx) {
        this.umRegEx = umRegEx;
    }

    @Basic
    @Column(name = "UM_SUPPORTED")
    public Short getUmSupported() {
        return umSupported;
    }

    public void setUmSupported(Short umSupported) {
        this.umSupported = umSupported;
    }

    @Basic
    @Column(name = "UM_REQUIRED")
    public Short getUmRequired() {
        return umRequired;
    }

    public void setUmRequired(Short umRequired) {
        this.umRequired = umRequired;
    }

    @Basic
    @Column(name = "UM_DISPLAY_ORDER")
    public Integer getUmDisplayOrder() {
        return umDisplayOrder;
    }

    public void setUmDisplayOrder(Integer umDisplayOrder) {
        this.umDisplayOrder = umDisplayOrder;
    }

    @Basic
    @Column(name = "UM_CHECKED_ATTRIBUTE")
    public Short getUmCheckedAttribute() {
        return umCheckedAttribute;
    }

    public void setUmCheckedAttribute(Short umCheckedAttribute) {
        this.umCheckedAttribute = umCheckedAttribute;
    }

    @Basic
    @Column(name = "UM_READ_ONLY")
    public Short getUmReadOnly() {
        return umReadOnly;
    }

    public void setUmReadOnly(Short umReadOnly) {
        this.umReadOnly = umReadOnly;
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

        UmClaim umClaim = (UmClaim) o;

        if (umId != umClaim.umId) return false;
        if (umDialectId != umClaim.umDialectId) return false;
        if (umTenantId != umClaim.umTenantId) return false;
        if (umClaimUri != null ? !umClaimUri.equals(umClaim.umClaimUri) : umClaim.umClaimUri != null) return false;
        if (umDisplayTag != null ? !umDisplayTag.equals(umClaim.umDisplayTag) : umClaim.umDisplayTag != null)
            return false;
        if (umDescription != null ? !umDescription.equals(umClaim.umDescription) : umClaim.umDescription != null)
            return false;
        if (umMappedAttributeDomain != null ? !umMappedAttributeDomain.equals(umClaim.umMappedAttributeDomain) : umClaim.umMappedAttributeDomain != null)
            return false;
        if (umMappedAttribute != null ? !umMappedAttribute.equals(umClaim.umMappedAttribute) : umClaim.umMappedAttribute != null)
            return false;
        if (umRegEx != null ? !umRegEx.equals(umClaim.umRegEx) : umClaim.umRegEx != null) return false;
        if (umSupported != null ? !umSupported.equals(umClaim.umSupported) : umClaim.umSupported != null) return false;
        if (umRequired != null ? !umRequired.equals(umClaim.umRequired) : umClaim.umRequired != null) return false;
        if (umDisplayOrder != null ? !umDisplayOrder.equals(umClaim.umDisplayOrder) : umClaim.umDisplayOrder != null)
            return false;
        if (umCheckedAttribute != null ? !umCheckedAttribute.equals(umClaim.umCheckedAttribute) : umClaim.umCheckedAttribute != null)
            return false;
        if (umReadOnly != null ? !umReadOnly.equals(umClaim.umReadOnly) : umClaim.umReadOnly != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + umDialectId;
        result = 31 * result + (umClaimUri != null ? umClaimUri.hashCode() : 0);
        result = 31 * result + (umDisplayTag != null ? umDisplayTag.hashCode() : 0);
        result = 31 * result + (umDescription != null ? umDescription.hashCode() : 0);
        result = 31 * result + (umMappedAttributeDomain != null ? umMappedAttributeDomain.hashCode() : 0);
        result = 31 * result + (umMappedAttribute != null ? umMappedAttribute.hashCode() : 0);
        result = 31 * result + (umRegEx != null ? umRegEx.hashCode() : 0);
        result = 31 * result + (umSupported != null ? umSupported.hashCode() : 0);
        result = 31 * result + (umRequired != null ? umRequired.hashCode() : 0);
        result = 31 * result + (umDisplayOrder != null ? umDisplayOrder.hashCode() : 0);
        result = 31 * result + (umCheckedAttribute != null ? umCheckedAttribute.hashCode() : 0);
        result = 31 * result + (umReadOnly != null ? umReadOnly.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
