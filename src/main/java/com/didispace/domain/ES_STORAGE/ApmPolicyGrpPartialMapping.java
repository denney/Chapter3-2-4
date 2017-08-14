package com.didispace.domain.ES_STORAGE;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "APM_POLICY_GRP_PARTIAL_MAPPING", schema = "PUBLIC", catalog = "ES_STORAGE")
@IdClass(ApmPolicyGrpPartialMappingPK.class)
public class ApmPolicyGrpPartialMapping {
    private int policyGrpId;
    private int policyPartialId;
    private String effect;
    private String policyId;

    @Id
    @Column(name = "POLICY_GRP_ID")
    public int getPolicyGrpId() {
        return policyGrpId;
    }

    public void setPolicyGrpId(int policyGrpId) {
        this.policyGrpId = policyGrpId;
    }

    @Id
    @Column(name = "POLICY_PARTIAL_ID")
    public int getPolicyPartialId() {
        return policyPartialId;
    }

    public void setPolicyPartialId(int policyPartialId) {
        this.policyPartialId = policyPartialId;
    }

    @Basic
    @Column(name = "EFFECT")
    public String getEffect() {
        return effect;
    }

    public void setEffect(String effect) {
        this.effect = effect;
    }

    @Basic
    @Column(name = "POLICY_ID")
    public String getPolicyId() {
        return policyId;
    }

    public void setPolicyId(String policyId) {
        this.policyId = policyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ApmPolicyGrpPartialMapping that = (ApmPolicyGrpPartialMapping) o;

        if (policyGrpId != that.policyGrpId) return false;
        if (policyPartialId != that.policyPartialId) return false;
        if (effect != null ? !effect.equals(that.effect) : that.effect != null) return false;
        if (policyId != null ? !policyId.equals(that.policyId) : that.policyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = policyGrpId;
        result = 31 * result + policyPartialId;
        result = 31 * result + (effect != null ? effect.hashCode() : 0);
        result = 31 * result + (policyId != null ? policyId.hashCode() : 0);
        return result;
    }
}
