package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_POLICY_CRITERIA", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmPolicyCriteria {
    private int id;
    private int criteriaId;
    private int policyId;
    private DmCriteria dmCriteriaByCriteriaId;
    private DmPolicy dmPolicyByPolicyId;
    private Collection<DmPolicyCriteriaProperties> dmPolicyCriteriaPropertiesById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "CRITERIA_ID")
    public int getCriteriaId() {
        return criteriaId;
    }

    public void setCriteriaId(int criteriaId) {
        this.criteriaId = criteriaId;
    }

    @Basic
    @Column(name = "POLICY_ID")
    public int getPolicyId() {
        return policyId;
    }

    public void setPolicyId(int policyId) {
        this.policyId = policyId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmPolicyCriteria that = (DmPolicyCriteria) o;

        if (id != that.id) return false;
        if (criteriaId != that.criteriaId) return false;
        if (policyId != that.policyId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + criteriaId;
        result = 31 * result + policyId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "CRITERIA_ID", referencedColumnName = "ID", nullable = false)
    public DmCriteria getDmCriteriaByCriteriaId() {
        return dmCriteriaByCriteriaId;
    }

    public void setDmCriteriaByCriteriaId(DmCriteria dmCriteriaByCriteriaId) {
        this.dmCriteriaByCriteriaId = dmCriteriaByCriteriaId;
    }

    @ManyToOne
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "ID", nullable = false)
    public DmPolicy getDmPolicyByPolicyId() {
        return dmPolicyByPolicyId;
    }

    public void setDmPolicyByPolicyId(DmPolicy dmPolicyByPolicyId) {
        this.dmPolicyByPolicyId = dmPolicyByPolicyId;
    }

    @OneToMany(mappedBy = "dmPolicyCriteriaByPolicyCriterionId")
    public Collection<DmPolicyCriteriaProperties> getDmPolicyCriteriaPropertiesById() {
        return dmPolicyCriteriaPropertiesById;
    }

    public void setDmPolicyCriteriaPropertiesById(Collection<DmPolicyCriteriaProperties> dmPolicyCriteriaPropertiesById) {
        this.dmPolicyCriteriaPropertiesById = dmPolicyCriteriaPropertiesById;
    }
}
