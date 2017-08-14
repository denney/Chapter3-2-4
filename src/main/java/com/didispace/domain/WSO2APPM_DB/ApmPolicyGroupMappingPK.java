package com.didispace.domain.WSO2APPM_DB;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class ApmPolicyGroupMappingPK implements Serializable {
    private int policyGrpId;
    private int appId;

    @Column(name = "POLICY_GRP_ID")
    @Id
    public int getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(int policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Column(name = "APP_ID")
    @Id
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

        ApmPolicyGroupMappingPK that = (ApmPolicyGroupMappingPK) o;

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
}
