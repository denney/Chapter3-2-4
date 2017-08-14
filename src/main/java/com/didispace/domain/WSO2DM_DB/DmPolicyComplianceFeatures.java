package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_POLICY_COMPLIANCE_FEATURES", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmPolicyComplianceFeatures {
    private int id;
    private int complianceStatusId;
    private int tenantId;
    private String featureCode;
    private Integer status;
    private DmPolicyComplianceStatus dmPolicyComplianceStatusByComplianceStatusId;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "COMPLIANCE_STATUS_ID")
    public int getComplianceStatusId() {
        return complianceStatusId;
    }

    public void setComplianceStatusId(int complianceStatusId) {
        this.complianceStatusId = complianceStatusId;
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
    @Column(name = "FEATURE_CODE")
    public String getFeatureCode() {
        return featureCode;
    }

    public void setFeatureCode(String featureCode) {
        this.featureCode = featureCode;
    }

    @Basic
    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmPolicyComplianceFeatures that = (DmPolicyComplianceFeatures) o;

        if (id != that.id) return false;
        if (complianceStatusId != that.complianceStatusId) return false;
        if (tenantId != that.tenantId) return false;
        if (featureCode != null ? !featureCode.equals(that.featureCode) : that.featureCode != null) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + complianceStatusId;
        result = 31 * result + tenantId;
        result = 31 * result + (featureCode != null ? featureCode.hashCode() : 0);
        result = 31 * result + (status != null ? status.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "COMPLIANCE_STATUS_ID", referencedColumnName = "ID", nullable = false)
    public DmPolicyComplianceStatus getDmPolicyComplianceStatusByComplianceStatusId() {
        return dmPolicyComplianceStatusByComplianceStatusId;
    }

    public void setDmPolicyComplianceStatusByComplianceStatusId(DmPolicyComplianceStatus dmPolicyComplianceStatusByComplianceStatusId) {
        this.dmPolicyComplianceStatusByComplianceStatusId = dmPolicyComplianceStatusByComplianceStatusId;
    }
}
