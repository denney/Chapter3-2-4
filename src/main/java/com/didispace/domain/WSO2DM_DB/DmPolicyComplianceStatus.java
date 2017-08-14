package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_POLICY_COMPLIANCE_STATUS", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmPolicyComplianceStatus {
    private int id;
    private int deviceId;
    private int enrolmentId;
    private int policyId;
    private int tenantId;
    private Integer status;
    private Timestamp lastSuccessTime;
    private Timestamp lastRequestedTime;
    private Timestamp lastFailedTime;
    private Integer attempts;
    private Collection<DmPolicyComplianceFeatures> dmPolicyComplianceFeaturesById;

    @Id
    @Column(name = "ID")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "DEVICE_ID")
    public int getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(int deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "ENROLMENT_ID")
    public int getEnrolmentId() {
        return enrolmentId;
    }

    public void setEnrolmentId(int enrolmentId) {
        this.enrolmentId = enrolmentId;
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
    @Column(name = "TENANT_ID")
    public int getTenantId() {
        return tenantId;
    }

    public void setTenantId(int tenantId) {
        this.tenantId = tenantId;
    }

    @Basic
    @Column(name = "STATUS")
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    @Basic
    @Column(name = "LAST_SUCCESS_TIME")
    public Timestamp getLastSuccessTime() {
        return lastSuccessTime;
    }

    public void setLastSuccessTime(Timestamp lastSuccessTime) {
        this.lastSuccessTime = lastSuccessTime;
    }

    @Basic
    @Column(name = "LAST_REQUESTED_TIME")
    public Timestamp getLastRequestedTime() {
        return lastRequestedTime;
    }

    public void setLastRequestedTime(Timestamp lastRequestedTime) {
        this.lastRequestedTime = lastRequestedTime;
    }

    @Basic
    @Column(name = "LAST_FAILED_TIME")
    public Timestamp getLastFailedTime() {
        return lastFailedTime;
    }

    public void setLastFailedTime(Timestamp lastFailedTime) {
        this.lastFailedTime = lastFailedTime;
    }

    @Basic
    @Column(name = "ATTEMPTS")
    public Integer getAttempts() {
        return attempts;
    }

    public void setAttempts(Integer attempts) {
        this.attempts = attempts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmPolicyComplianceStatus that = (DmPolicyComplianceStatus) o;

        if (id != that.id) return false;
        if (deviceId != that.deviceId) return false;
        if (enrolmentId != that.enrolmentId) return false;
        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;
        if (status != null ? !status.equals(that.status) : that.status != null) return false;
        if (lastSuccessTime != null ? !lastSuccessTime.equals(that.lastSuccessTime) : that.lastSuccessTime != null)
            return false;
        if (lastRequestedTime != null ? !lastRequestedTime.equals(that.lastRequestedTime) : that.lastRequestedTime != null)
            return false;
        if (lastFailedTime != null ? !lastFailedTime.equals(that.lastFailedTime) : that.lastFailedTime != null)
            return false;
        if (attempts != null ? !attempts.equals(that.attempts) : that.attempts != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceId;
        result = 31 * result + enrolmentId;
        result = 31 * result + policyId;
        result = 31 * result + tenantId;
        result = 31 * result + (status != null ? status.hashCode() : 0);
        result = 31 * result + (lastSuccessTime != null ? lastSuccessTime.hashCode() : 0);
        result = 31 * result + (lastRequestedTime != null ? lastRequestedTime.hashCode() : 0);
        result = 31 * result + (lastFailedTime != null ? lastFailedTime.hashCode() : 0);
        result = 31 * result + (attempts != null ? attempts.hashCode() : 0);
        return result;
    }

    @OneToMany(mappedBy = "dmPolicyComplianceStatusByComplianceStatusId")
    public Collection<DmPolicyComplianceFeatures> getDmPolicyComplianceFeaturesById() {
        return dmPolicyComplianceFeaturesById;
    }

    public void setDmPolicyComplianceFeaturesById(Collection<DmPolicyComplianceFeatures> dmPolicyComplianceFeaturesById) {
        this.dmPolicyComplianceFeaturesById = dmPolicyComplianceFeaturesById;
    }
}
