package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_POLICY_HARD_THROTTLING", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmPolicyHardThrottling {
    private int policyId;
    private String name;
    private int tenantId;
    private String description;
    private String quotaType;
    private int quota;
    private String quotaUnit;
    private int unitTime;
    private String timeUnit;
    private byte isDeployed;

    @Id
    @Column(name = "POLICY_ID")
    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    @Basic
    @Column(name = "NAME")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Basic
    @Column(name = "QUOTA_TYPE")
    public String getQuotaType() {
        return quotaType;
    }

    public void setQuotaType(String quotaType) {
        this.quotaType = quotaType;
    }

    @Basic
    @Column(name = "QUOTA")
    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    @Basic
    @Column(name = "QUOTA_UNIT")
    public String getQuotaUnit() {
        return quotaUnit;
    }

    public void setQuotaUnit(String quotaUnit) {
        this.quotaUnit = quotaUnit;
    }

    @Basic
    @Column(name = "UNIT_TIME")
    public int getUnitTime() {
        return unitTime;
    }

    public void setUnitTime(int unitTime) {
        this.unitTime = unitTime;
    }

    @Basic
    @Column(name = "TIME_UNIT")
    public String getTimeUnit() {
        return timeUnit;
    }

    public void setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
    }

    @Basic
    @Column(name = "IS_DEPLOYED")
    public byte getIsDeployed() {
        return isDeployed;
    }

    public void setIsDeployed(byte isDeployed) {
        this.isDeployed = isDeployed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmPolicyHardThrottling that = (AmPolicyHardThrottling) o;

        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;
        if (quota != that.quota) return false;
        if (unitTime != that.unitTime) return false;
        if (isDeployed != that.isDeployed) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (quotaType != null ? !quotaType.equals(that.quotaType) : that.quotaType != null) return false;
        if (quotaUnit != null ? !quotaUnit.equals(that.quotaUnit) : that.quotaUnit != null) return false;
        if (timeUnit != null ? !timeUnit.equals(that.timeUnit) : that.timeUnit != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (quotaType != null ? quotaType.hashCode() : 0);
        result = 31 * result + quota;
        result = 31 * result + (quotaUnit != null ? quotaUnit.hashCode() : 0);
        result = 31 * result + unitTime;
        result = 31 * result + (timeUnit != null ? timeUnit.hashCode() : 0);
        result = 31 * result + (int) isDeployed;
        return result;
    }
}
