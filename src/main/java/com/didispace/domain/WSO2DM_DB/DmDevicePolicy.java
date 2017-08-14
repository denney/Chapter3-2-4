package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;
import java.util.Arrays;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_POLICY", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDevicePolicy {
    private int id;
    private int deviceId;
    private int enrolmentId;
    private byte[] device;
    private int policyId;
    private DmDevice dmDeviceByDeviceId;
    private DmPolicy dmPolicyByPolicyId;

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
    @Column(name = "DEVICE")
    public byte[] getDevice() {
        return device;
    }

    public void setDevice(byte[] device) {
        this.device = device;
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

        DmDevicePolicy that = (DmDevicePolicy) o;

        if (id != that.id) return false;
        if (deviceId != that.deviceId) return false;
        if (enrolmentId != that.enrolmentId) return false;
        if (policyId != that.policyId) return false;
        if (!Arrays.equals(device, that.device)) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceId;
        result = 31 * result + enrolmentId;
        result = 31 * result + Arrays.hashCode(device);
        result = 31 * result + policyId;
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

    @ManyToOne
    @JoinColumn(name = "POLICY_ID", referencedColumnName = "ID", nullable = false)
    public DmPolicy getDmPolicyByPolicyId() {
        return dmPolicyByPolicyId;
    }

    public void setDmPolicyByPolicyId(DmPolicy dmPolicyByPolicyId) {
        this.dmPolicyByPolicyId = dmPolicyByPolicyId;
    }
}
