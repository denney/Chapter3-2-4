package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_POLICY_GROUP_MAPPING", schema = "PUBLIC", catalog = "WSO2APPM_DB")
@IdClass(ApmPolicyGroupMappingPK.class)
public class ApmPolicyGroupMapping {
    private int policyGrpId;
    private int appId;
    private ApmPolicyGroup apmPolicyGroupByPolicyGrpId;

    @Id
    @Column(name = "POLICY_GRP_ID")
    public int getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(int policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Id
    @Column(name = "APP_ID")
    public int getAppId() {
        return appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGroupMapping that = (ApmPolicyGroupMapping) o;

        if (policyGrpId != that.policyGrpId) return false;
        if (appId != that.appId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId;
        result = 31 * result + appId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_GRP_ID", referencedColumnName = "POLICY_GRP_ID", nullable = false)
    public ApmPolicyGroup getApmPolicyGroupByPolicyGrpId() {
        return apmPolicyGroupByPolicyGrpId;
    }

    public void setApmPolicyGroupByPolicyGrpId(ApmPolicyGroup apmPolicyGroupByPolicyGrpId) {
        this.apmPolicyGroupByPolicyGrpId = apmPolicyGroupByPolicyGrpId;
    }
}
