package com.didispace.domain.WSO2DM_DB;

import javax.persistence.*;

/**
 * Created by admin on 2017/8/14.
 */
@Entity
@Table(name = "DM_DEVICE_APPLICATION_MAPPING", schema = "PUBLIC", catalog = "WSO2DM_DB")
public class DmDeviceApplicationMapping {
    private int id;
    private int deviceId;
    private int applicationId;
    private int tenantId;
    private DmDevice dmDeviceByDeviceId;
    private DmApplication dmApplicationByApplicationId;

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
    @Column(name = "APPLICATION_ID")
    public int getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(int applicationId) {
        this.applicationId = applicationId;
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

        DmDeviceApplicationMapping that = (DmDeviceApplicationMapping) o;

        if (id != that.id) return false;
        if (deviceId != that.deviceId) return false;
        if (applicationId != that.applicationId) return false;
        if (tenantId != that.tenantId) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + deviceId;
        result = 31 * result + applicationId;
        result = 31 * result + tenantId;
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
    @JoinColumn(name = "APPLICATION_ID", referencedColumnName = "ID", nullable = false)
    public DmApplication getDmApplicationByApplicationId() {
        return dmApplicationByApplicationId;
    }

    public void setDmApplicationByApplicationId(DmApplication dmApplicationByApplicationId) {
        this.dmApplicationByApplicationId = dmApplicationByApplicationId;
    }
}
