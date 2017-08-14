package com.didispace.domain.WSO2AM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "AM_CONDITION_GROUP", schema = "PUBLIC", catalog = "WSO2AM_DB")
public class AmConditionGroup {
    private int conditionGroupId;
    private int policyId;
    private String quotaType;
    private int quota;
    private String quotaUnit;
    private int unitTime;
    private String timeUnit;
    private String description;
    private AmApiThrottlePolicy amApiThrottlePolicyByPolicyId;
    private Collection<AmHeaderFieldCondition> amHeaderFieldConditionsByConditionGroupId;
    private Collection<AmIpCondition> amIpConditionsByConditionGroupId;
    private Collection<AmJwtClaimCondition> amJwtClaimConditionsByConditionGroupId;
    private Collection<AmQueryParameterCondition> amQueryParameterConditionsByConditionGroupId;

    @Id
    @Column(name = "CONDITION_GROUP_ID")
    public int getConditionGroupId() {
        return conditionGroupId;
    }

    public void setConditionGroupId(int conditionGroupId) {
        this.conditionGroupId = conditionGroupId;
    }

    @Basic
    @Column(name = "POLICY_ID")
    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
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
    @Column(name = "DESCRIPTION")
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AmConditionGroup that = (AmConditionGroup) o;

        if (conditionGroupId != that.conditionGroupId) return false;
        if (policyId != that.policyId) return false;
        if (quota != that.quota) return false;
        if (unitTime != that.unitTime) return false;
        if (quotaType != null ? !quotaType.equals(that.quotaType) : that.quotaType != null) return false;
        if (quotaUnit != null ? !quotaUnit.equals(that.quotaUnit) : that.quotaUnit != null) return false;
        if (timeUnit != null ? !timeUnit.equals(that.timeUnit) : that.timeUnit != null) return false;
        if (description != null ? !description.equals(that.description) : that.description != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = conditionGroupId;
        result = 31 * result + policyId;
        result = 31 * result + (quotaType != null ? quotaType.hashCode() : 0);
        result = 31 * result + quota;
        result = 31 * result + (quotaUnit != null ? quotaUnit.hashCode() : 0);
        result = 31 * result + unitTime;
        result = 31 * result + (timeUnit != null ? timeUnit.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "POLICY_ID", nullable = false)
    public AmApiThrottlePolicy getAmApiThrottlePolicyByPolicyId() {
        return amApiThrottlePolicyByPolicyId;
    }

    public void setAmApiThrottlePolicyByPolicyId(AmApiThrottlePolicy amApiThrottlePolicyByPolicyId) {
        this.amApiThrottlePolicyByPolicyId = amApiThrottlePolicyByPolicyId;
    }

    @OneToMany(mappedBy = "amConditionGroupByConditionGroupId")
    public Collection<AmHeaderFieldCondition> getAmHeaderFieldConditionsByConditionGroupId() {
        return amHeaderFieldConditionsByConditionGroupId;
    }

    public void setAmHeaderFieldConditionsByConditionGroupId(Collection<AmHeaderFieldCondition> amHeaderFieldConditionsByConditionGroupId) {
        this.amHeaderFieldConditionsByConditionGroupId = amHeaderFieldConditionsByConditionGroupId;
    }

    @OneToMany(mappedBy = "amConditionGroupByConditionGroupId")
    public Collection<AmIpCondition> getAmIpConditionsByConditionGroupId() {
        return amIpConditionsByConditionGroupId;
    }

    public void setAmIpConditionsByConditionGroupId(Collection<AmIpCondition> amIpConditionsByConditionGroupId) {
        this.amIpConditionsByConditionGroupId = amIpConditionsByConditionGroupId;
    }

    @OneToMany(mappedBy = "amConditionGroupByConditionGroupId")
    public Collection<AmJwtClaimCondition> getAmJwtClaimConditionsByConditionGroupId() {
        return amJwtClaimConditionsByConditionGroupId;
    }

    public void setAmJwtClaimConditionsByConditionGroupId(Collection<AmJwtClaimCondition> amJwtClaimConditionsByConditionGroupId) {
        this.amJwtClaimConditionsByConditionGroupId = amJwtClaimConditionsByConditionGroupId;
    }

    @OneToMany(mappedBy = "amConditionGroupByConditionGroupId")
    public Collection<AmQueryParameterCondition> getAmQueryParameterConditionsByConditionGroupId() {
        return amQueryParameterConditionsByConditionGroupId;
    }

    public void setAmQueryParameterConditionsByConditionGroupId(Collection<AmQueryParameterCondition> amQueryParameterConditionsByConditionGroupId) {
        this.amQueryParameterConditionsByConditionGroupId = amQueryParameterConditionsByConditionGroupId;
    }
}
