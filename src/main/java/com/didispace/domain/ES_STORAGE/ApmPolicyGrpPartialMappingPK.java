package com.didispace.domain.ES_STORAGE;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by admin on 2017/8/14.
 */
public class ApmPolicyGrpPartialMappingPK implements Serializable {
    private int policyGrpId;
    private int policyPartialId;

    @Column(name = "POLICY_GRP_ID")
    @Id
    public int getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(int policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Column(name = "POLICY_PARTIAL_ID")
    @Id
    public int getPolicyPartialId() {
        return policyPartialId;
    }

    public void setPolicyPartialId(int policyPartialId) {
        this.policyPartialId = policyPartialId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGrpPartialMappingPK that = (ApmPolicyGrpPartialMappingPK) o;

        if (policyGrpId != that.policyGrpId) return false;
        if (policyPartialId != that.policyPartialId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId;
        result = 31 * result + policyPartialId;
        return result;
    }
}
