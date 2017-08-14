package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_POLICY_SUBSCRIPTION", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmPolicySubscription {
    private int policyId;
    private String name;
    private String displayName;
    private int tenantId;
    private String description;
    private String quotaType;
    private int quota;
    private String quotaUnit;
    private int unitTime;
    private String timeUnit;
    private Integer rateLimitCount;
    private String rateLimitTimeUnit;
    private byte isDeployed;
    private byte[] customAttributes;
    private boolean stopOnQuotaReach;
    private String billingPlan;
    private String uuid;

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
    @Column(name = "DISPLAY_NAME")
    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
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
    @Column(name = "RATE_LIMIT_COUNT")
    public Integer getRateLimitCount() {
        return rateLimitCount;
    }

    public void setRateLimitCount(Integer rateLimitCount) {
        this.rateLimitCount = rateLimitCount;
    }

    @Basic
    @Column(name = "RATE_LIMIT_TIME_UNIT")
    public String getRateLimitTimeUnit() {
        return rateLimitTimeUnit;
    }

    public void setRateLimitTimeUnit(String rateLimitTimeUnit) {
        this.rateLimitTimeUnit = rateLimitTimeUnit;
    }

    @Basic
    @Column(name = "IS_DEPLOYED")
    public byte getIsDeployed() {
        return isDeployed;
    }

    public void setIsDeployed(byte isDeployed) {
        this.isDeployed = isDeployed;
    }

    @Basic
    @Column(name = "CUSTOM_ATTRIBUTES")
    public byte[] getCustomAttributes() {
        return customAttributes;
    }

    public void setCustomAttributes(byte[] customAttributes) {
        this.customAttributes = customAttributes;
    }

    @Basic
    @Column(name = "STOP_ON_QUOTA_REACH")
    public boolean isStopOnQuotaReach() {
        return stopOnQuotaReach;
    }

    public void setStopOnQuotaReach(boolean stopOnQuotaReach) {
        this.stopOnQuotaReach = stopOnQuotaReach;
    }

    @Basic
    @Column(name = "BILLING_PLAN")
    public String getBillingPlan() {
        return billingPlan;
    }

    public void setBillingPlan(String billingPlan) {
        this.billingPlan = billingPlan;
    }

    @Basic
    @Column(name = "UUID")
    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmPolicySubscription that = (AmPolicySubscription) o;

        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;
        if (quota != that.quota) return false;
        if (unitTime != that.unitTime) return false;
        if (isDeployed != that.isDeployed) return false;
        if (stopOnQuotaReach != that.stopOnQuotaReach) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (quotaType != null ? !quotaType.equals(that.quotaType) : that.quotaType != null) return false;
        if (quotaUnit != null ? !quotaUnit.equals(that.quotaUnit) : that.quotaUnit != null) return false;
        if (timeUnit != null ? !timeUnit.equals(that.timeUnit) : that.timeUnit != null) return false;
        if (rateLimitCount != null ? !rateLimitCount.equals(that.rateLimitCount) : that.rateLimitCount != null)
            return false;
        if (rateLimitTimeUnit != null ? !rateLimitTimeUnit.equals(that.rateLimitTimeUnit) : that.rateLimitTimeUnit != null)
            return false;
        if (!Arrays.equals(customAttributes, that.customAttributes)) return false;
        if (billingPlan != null ? !billingPlan.equals(that.billingPlan) : that.billingPlan != null) return false;
        if (uuid != null ? !uuid.equals(that.uuid) : that.uuid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyId;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (displayName != null ? displayName.hashCode() : 0);
        result = 31 * result + tenantId;
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (quotaType != null ? quotaType.hashCode() : 0);
        result = 31 * result + quota;
        result = 31 * result + (quotaUnit != null ? quotaUnit.hashCode() : 0);
        result = 31 * result + unitTime;
        result = 31 * result + (timeUnit != null ? timeUnit.hashCode() : 0);
        result = 31 * result + (rateLimitCount != null ? rateLimitCount.hashCode() : 0);
        result = 31 * result + (rateLimitTimeUnit != null ? rateLimitTimeUnit.hashCode() : 0);
        result = 31 * result + (int) isDeployed;
        result = 31 * result + Arrays.hashCode(customAttributes);
        result = 31 * result + (stopOnQuotaReach ? 1 : 0);
        result = 31 * result + (billingPlan != null ? billingPlan.hashCode() : 0);
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }
}
