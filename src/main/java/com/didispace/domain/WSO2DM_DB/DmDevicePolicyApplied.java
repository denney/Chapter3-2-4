package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_POLICY_APPLIED", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDevicePolicyApplied {
    private int id;
    private int deviceId;
    private int enrolmentId;
    private int policyId;
    private byte[] policyContent;
    private int tenantId;
    private Byte applied;
    private Timestamp createdTime;
    private Timestamp updatedTime;
    private Timestamp appliedTime;
    private DmDevice dmDeviceByDeviceId;

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
    @Column(name = "POLICY_CONTENT")
    public byte[] getPolicyContent() {
        return policyContent;
    }

    public void setPolicyContent(byte[] policyContent) {
        this.policyContent = policyContent;
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
    @Column(name = "APPLIED")
    public Byte getApplied() {
        return applied;
    }

    public void setApplied(Byte applied) {
        this.applied = applied;
    }

    @Basic
    @Column(name = "CREATED_TIME")
    public Timestamp getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Timestamp createdTime) {
        this.createdTime = createdTime;
    }

    @Basic
    @Column(name = "UPDATED_TIME")
    public Timestamp getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(Timestamp updatedTime) {
        this.updatedTime = updatedTime;
    }

    @Basic
    @Column(name = "APPLIED_TIME")
    public Timestamp getAppliedTime() {
        return appliedTime;
    }

    public void setAppliedTime(Timestamp appliedTime) {
        this.appliedTime = appliedTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDevicePolicyApplied that = (DmDevicePolicyApplied) o;

        if (id != that.id) return false;
        if (deviceId != that.deviceId) return false;
        if (enrolmentId != that.enrolmentId) return false;
        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;
        if (!Arrays.equals(policyContent, that.policyContent)) return false;
        if (applied != null ? !applied.equals(that.applied) : that.applied != null) return false;
        if (createdTime != null ? !createdTime.equals(that.createdTime) : that.createdTime != null) return false;
        if (updatedTime != null ? !updatedTime.equals(that.updatedTime) : that.updatedTime != null) return false;
        if (appliedTime != null ? !appliedTime.equals(that.appliedTime) : that.appliedTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceId;
        result = 31 * result + enrolmentId;
        result = 31 * result + policyId;
        result = 31 * result + Arrays.hashCode(policyContent);
        result = 31 * result + tenantId;
        result = 31 * result + (applied != null ? applied.hashCode() : 0);
        result = 31 * result + (createdTime != null ? createdTime.hashCode() : 0);
        result = 31 * result + (updatedTime != null ? updatedTime.hashCode() : 0);
        result = 31 * result + (appliedTime != null ? appliedTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEVICE_ID", referencedColumnName = "ID", nullable = false)
    public DmDevice getDmDeviceByDeviceId() {
        return dmDeviceByDeviceId;
    }

    public void setDmDeviceByDeviceId(DmDevice dmDeviceByDeviceId) {
        this.dmDeviceByDeviceId = dmDeviceByDeviceId;
    }
}
