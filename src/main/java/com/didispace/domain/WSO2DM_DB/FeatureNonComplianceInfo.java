package com.didispace.domain.WSO2DM_DB;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "FEATURE_NON_COMPLIANCE_INFO", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class FeatureNonComplianceInfo {
    private Integer deviceId;
    private String deviceIdentification;
    private String deviceModel;
    private String vendor;
    private String osVersion;
    private String ownership;
    private String owner;
    private String connectivityStatus;
    private Integer policyId;
    private String platform;
    private String featureCode;
    private Integer isComplaint;
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
    @Column(name = "DEVICE_MODEL")
    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    @Basic
    @Column(name = "VENDOR")
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    @Basic
    @Column(name = "OS_VERSION")
    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
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
    @Column(name = "OWNER")
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
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
    @Column(name = "PLATFORM")
    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
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
    @Column(name = "IS_COMPLAINT")
    public Integer getIsComplaint() {
        return isComplaint;
    }

    public void setIsComplaint(Integer isComplaint) {
        this.isComplaint = isComplaint;
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

        FeatureNonComplianceInfo that = (FeatureNonComplianceInfo) o;

        if (deviceId != null ? !deviceId.equals(that.deviceId) : that.deviceId != null) return false;
        if (deviceIdentification != null ? !deviceIdentification.equals(that.deviceIdentification) : that.deviceIdentification != null)
            return false;
        if (deviceModel != null ? !deviceModel.equals(that.deviceModel) : that.deviceModel != null) return false;
        if (vendor != null ? !vendor.equals(that.vendor) : that.vendor != null) return false;
        if (osVersion != null ? !osVersion.equals(that.osVersion) : that.osVersion != null) return false;
        if (ownership != null ? !ownership.equals(that.ownership) : that.ownership != null) return false;
        if (owner != null ? !owner.equals(that.owner) : that.owner != null) return false;
        if (connectivityStatus != null ? !connectivityStatus.equals(that.connectivityStatus) : that.connectivityStatus != null)
            return false;
        if (policyId != null ? !policyId.equals(that.policyId) : that.policyId != null) return false;
        if (platform != null ? !platform.equals(that.platform) : that.platform != null) return false;
        if (featureCode != null ? !featureCode.equals(that.featureCode) : that.featureCode != null) return false;
        if (isComplaint != null ? !isComplaint.equals(that.isComplaint) : that.isComplaint != null) return false;
        if (tenantId != null ? !tenantId.equals(that.tenantId) : that.tenantId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = deviceId != null ? deviceId.hashCode() : 0;
        result = 31 * result + (deviceIdentification != null ? deviceIdentification.hashCode() : 0);
        result = 31 * result + (deviceModel != null ? deviceModel.hashCode() : 0);
        result = 31 * result + (vendor != null ? vendor.hashCode() : 0);
        result = 31 * result + (osVersion != null ? osVersion.hashCode() : 0);
        result = 31 * result + (ownership != null ? ownership.hashCode() : 0);
        result = 31 * result + (owner != null ? owner.hashCode() : 0);
        result = 31 * result + (connectivityStatus != null ? connectivityStatus.hashCode() : 0);
        result = 31 * result + (policyId != null ? policyId.hashCode() : 0);
        result = 31 * result + (platform != null ? platform.hashCode() : 0);
        result = 31 * result + (featureCode != null ? featureCode.hashCode() : 0);
        result = 31 * result + (isComplaint != null ? isComplaint.hashCode() : 0);
        result = 31 * result + (tenantId != null ? tenantId.hashCode() : 0);
        return result;
    }
}
