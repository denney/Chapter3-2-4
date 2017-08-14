package com.didispace.domain.WSO2CARBON_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "UM_PROFILE_CONFIG", schema = "PUBLIC", catalog = "WSO2CARBON_DB")
@IdClass(UmProfileConfigPK.class)
public class UmProfileConfig {
    private int umId;
    private Integer umDialectId;
    private String umProfileName;
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
    public Integer getUmDialectId() {
        return umDialectId;
    }

    public void setUmDialectId(Integer umDialectId) {
        this.umDialectId = umDialectId;
    }

    @Basic
    @Column(name = "UM_PROFILE_NAME")
    public String getUmProfileName() {
        return umProfileName;
    }

    public void setUmProfileName(String umProfileName) {
        this.umProfileName = umProfileName;
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

        UmProfileConfig that = (UmProfileConfig) o;

        if (umId != that.umId) return false;
        if (umTenantId != that.umTenantId) return false;
        if (umDialectId != null ? !umDialectId.equals(that.umDialectId) : that.umDialectId != null) return false;
        if (umProfileName != null ? !umProfileName.equals(that.umProfileName) : that.umProfileName != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = umId;
        result = 31 * result + (umDialectId != null ? umDialectId.hashCode() : 0);
        result = 31 * result + (umProfileName != null ? umProfileName.hashCode() : 0);
        result = 31 * result + umTenantId;
        return result;
    }
}
