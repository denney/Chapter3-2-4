package com.didispace.domain.WSO2DM_DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "POLICY_COMPLIANCE_INFO", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class PolicyComplianceInfo {
    private Integer deviceId;
    private String deviceIdentification;
    private String platform;
    private String ownership;
    private String connectivityStatus;
    private Integer policyId;
    private Integer isCompliant;
    private Integer tenantId;

    @Basic
    @Column(name = "DEVICE_ID")
    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    @Basic
    @Column(name = "DEVICE_IDENTIFICATION")
    public String getDeviceIdentification() {
        return deviceIdentification;
    }

    public void setDeviceIdentification(String deviceIdentification) {
        this.deviceIdentification = deviceIdentification;
    }

    @Basic
    @Column(name = "PLATFORM")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    @Basic
    @Column(name = "OWNERSHIP")
    public String getOwnership() {
        return ownership;
    }

    public void setOwnership(String ownership) {
        this.ownership = ownership;
    }

    @Basic
    @Column(name = "CONNECTIVITY_STATUS")
    public String getConnectivityStatus() {
        return connectivityStatus;
    }

    public void setConnectivityStatus(String connectivityStatus) {
        this.connectivityStatus = connectivityStatus;
    }

    @Basic
    @Column(name = "POLICY_ID")
    public Integer getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Integer policyId) {
        this.policyId = policyId;
    }

    @Basic
    @Column(name = "IS_COMPLIANT")
    public Integer getIsCompliant() {
        return isCompliant;
    }

    public void setIsCompliant(Integer isCompliant) {
        this.isCompliant = isCompliant;
    }

    @Basic
    @Column(name = "TENANT_ID")
    public Integer getTenantId() {
        return tenantId;
    }

    public void setTenantId(Integer tenantId) {
        this.tenantId = tenantId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        PolicyComplianceInfo that = (PolicyComplianceInfo) o;

        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (deviceIdentification != null ? !deviceIdentification.equals(that.deviceIdentification) : that.deviceIdentification != null)
            return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
        if (ownership != null ? !ownership.equals(that.ownership) : that.ownership != null) return false;
        if (connectivityStatus != null ? !connectivityStatus.equals(that.connectivityStatus) : that.connectivityStatus != null)
            return false;
        if (policyId != null ? !policyId.equals(that.policyId) : that.policyId != null) return false;
        if (isCompliant != null ? !isCompliant.equals(that.isCompliant) : that.isCompliant != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceId != null ? deviceId.hashCode() : 0;
        result = 31 * result + (deviceIdentification != null ? deviceIdentification.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (ownership != null ? ownership.hashCode() : 0);
        result = 31 * result + (connectivityStatus != null ? connectivityStatus.hashCode() : 0);
        result = 31 * result + (policyId != null ? policyId.hashCode() : 0);
        result = 31 * result + (isCompliant != null ? isCompliant.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
