package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_USER_ATTRIBUTE", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmUserAttributePK.class)
public class UmUserAttribute {
    private int umId;
    private String umAttrName;
    private String umAttrValue;
    private String umProfileId;
    private Integer umUserId;
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
    @Column(name = "UM_ATTR_NAME")
    public String getUmAttrName() {
        return umAttrName;
    }

    public void setUmAttrName(String umAttrName) {
        this.umAttrName = umAttrName;
    }

    @Basic
    @Column(name = "UM_ATTR_VALUE")
    public String getUmAttrValue() {
        return umAttrValue;
    }

    public void setUmAttrValue(String umAttrValue) {
        this.umAttrValue = umAttrValue;
    }

    @Basic
    @Column(name = "UM_PROFILE_ID")
    public String getUmProfileId() {
        return umProfileId;
    }

    public void setUmProfileId(String umProfileId) {
        this.umProfileId = umProfileId;
    }

    @Basic
    @Column(name = "UM_USER_ID")
    public Integer getUmUserId() {
        return umUserId;
    }

    public void setUmUserId(Integer umUserId) {
        this.umUserId = umUserId;
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

        UmUserAttribute that = (UmUserAttribute) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umAttrName != null ? !umAttrName.equals(that.umAttrName) : that.umAttrName != null) return false;
        if (umAttrValue != null ? !umAttrValue.equals(that.umAttrValue) : that.umAttrValue != null) return false;
        if (umProfileId != null ? !umProfileId.equals(that.umProfileId) : that.umProfileId != null) return false;
        if (umUserId != null ? !umUserId.equals(that.umUserId) : that.umUserId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umAttrName != null ? umAttrName.hashCode() : 0);
        result = 31 * result + (umAttrValue != null ? umAttrValue.hashCode() : 0);
        result = 31 * result + (umProfileId != null ? umProfileId.hashCode() : 0);
        result = 31 * result + (umUserId != null ? umUserId.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
