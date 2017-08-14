package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_GROUP_POLICY", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDeviceGroupPolicy {
    private int id;
    private int deviceGroupId;
    private int policyId;
    private int tenantId;
    private DmGroup dmGroupByDeviceGroupId;
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
    @Column(name = "DEVICE_GROUP_ID")
    public int getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(int deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        DmDeviceGroupPolicy that = (DmDeviceGroupPolicy) o;

        if (id != that.id) return false;
        if (deviceGroupId != that.deviceGroupId) return false;
        if (policyId != that.policyId) return false;
        if (tenantId != that.tenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceGroupId;
        result = 31 * result + policyId;
        result = 31 * result + tenantId;
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "DEVICE_GROUP_ID", referencedColumnName = "ID", nullable = false)
    public DmGroup getDmGroupByDeviceGroupId() {
        return dmGroupByDeviceGroupId;
    }

    public void setDmGroupByDeviceGroupId(DmGroup dmGroupByDeviceGroupId) {
        this.dmGroupByDeviceGroupId = dmGroupByDeviceGroupId;
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
