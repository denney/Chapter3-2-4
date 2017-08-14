package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_API_THROTTLE_POLICY", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmApiThrottlePolicy {
    private int policyId;
    private String name;
    private String displayName;
    private int tenantId;
    private String description;
    private String defaultQuotaType;
    private int defaultQuota;
    private String defaultQuotaUnit;
    private int defaultUnitTime;
    private String defaultTimeUnit;
    private String applicableLevel;
    private byte isDeployed;
    private String uuid;
    private Collection<AmConditionGroup> amConditionGroupsByPolicyId;

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
    @Column(name = "DEFAULT_QUOTA_TYPE")
    public String getDefaultQuotaType() {
        return defaultQuotaType;
    }

    public void setDefaultQuotaType(String defaultQuotaType) {
        this.defaultQuotaType = defaultQuotaType;
    }

    @Basic
    @Column(name = "DEFAULT_QUOTA")
    public int getDefaultQuota() {
        return defaultQuota;
    }

    public void setDefaultQuota(int defaultQuota) {
        this.defaultQuota = defaultQuota;
    }

    @Basic
    @Column(name = "DEFAULT_QUOTA_UNIT")
    public String getDefaultQuotaUnit() {
        return defaultQuotaUnit;
    }

    public void setDefaultQuotaUnit(String defaultQuotaUnit) {
        this.defaultQuotaUnit = defaultQuotaUnit;
    }

    @Basic
    @Column(name = "DEFAULT_UNIT_TIME")
    public int getDefaultUnitTime() {
        return defaultUnitTime;
    }

    public void setDefaultUnitTime(int defaultUnitTime) {
        this.defaultUnitTime = defaultUnitTime;
    }

    @Basic
    @Column(name = "DEFAULT_TIME_UNIT")
    public String getDefaultTimeUnit() {
        return defaultTimeUnit;
    }

    public void setDefaultTimeUnit(String defaultTimeUnit) {
        this.defaultTimeUnit = defaultTimeUnit;
    }

    @Basic
    @Column(name = "APPLICABLE_LEVEL")
    public String getApplicableLevel() {
        return applicableLevel;
    }

    public void setApplicableLevel(String applicableLevel) {
        this.applicableLevel = applicableLevel;
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

        AmApiThrottlePolicy that = (AmApiThrottlePolicy) o;

        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;
        if (defaultQuota != that.defaultQuota) return false;
        if (defaultUnitTime != that.defaultUnitTime) return false;
        if (isDeployed != that.isDeployed) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        if (displayName != null ? !displayName.equals(that.displayName) : that.displayName != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;
        if (defaultQuotaType != null ? !defaultQuotaType.equals(that.defaultQuotaType) : that.defaultQuotaType != null)
            return false;
        if (defaultQuotaUnit != null ? !defaultQuotaUnit.equals(that.defaultQuotaUnit) : that.defaultQuotaUnit != null)
            return false;
        if (defaultTimeUnit != null ? !defaultTimeUnit.equals(that.defaultTimeUnit) : that.defaultTimeUnit != null)
            return false;
        if (applicableLevel != null ? !applicableLevel.equals(that.applicableLevel) : that.applicableLevel != null)
            return false;
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
        result = 31 * result + (defaultQuotaType != null ? defaultQuotaType.hashCode() : 0);
        result = 31 * result + defaultQuota;
        result = 31 * result + (defaultQuotaUnit != null ? defaultQuotaUnit.hashCode() : 0);
        result = 31 * result + defaultUnitTime;
        result = 31 * result + (defaultTimeUnit != null ? defaultTimeUnit.hashCode() : 0);
        result = 31 * result + (applicableLevel != null ? applicableLevel.hashCode() : 0);
        result = 31 * result + (int) isDeployed;
        result = 31 * result + (uuid != null ? uuid.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "amApiThrottlePolicyByPolicyId")
    public Collection<AmConditionGroup> getAmConditionGroupsByPolicyId() {
        return amConditionGroupsByPolicyId;
    }

    public void setAmConditionGroupsByPolicyId(Collection<AmConditionGroup> amConditionGroupsByPolicyId) {
        this.amConditionGroupsByPolicyId = amConditionGroupsByPolicyId;
    }
}
